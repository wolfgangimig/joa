/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.com;

/**
 * Objects received from COM are of this class. This class provides functions to
 * invoke properties and methods via the IDispatch interface.
 */
public class Dispatch implements IDispatch {

	/**
	 * Pointer to a memory address of the attached JNI object.
	 */
	protected long ndisp;

	/**
	 * Default constructor. No JNI object is attached.
	 */
	public Dispatch() {
	}

	/**
	 * Initialization constructor called from JNI. Do not invoke this
	 * constructor with an arbitrary value.
	 * 
	 * @param ndisp
	 *            Address of the native COM object.
	 */
	protected Dispatch(long ndisp) {
		this.ndisp = ndisp;
	}

	/**
	 * Instantiate the COM object and assign its native pointer to this.
	 * 
	 * @param progId
	 *            Registered program ID.
	 * @throws ComException
	 */
	public Dispatch(String progId) throws ComException {
		JoaDll.nativeCoCreateInstance(progId, this, "");
	}

	/**
	 * Instantiate the COM object and assign its native pointer to this.
	 * 
	 * @param progId
	 *            Registered program ID.
	 * @param iid
	 *            COM interface GUID
	 * @throws ComException
	 */
	public Dispatch(String progId, String iid) throws ComException {
		JoaDll.nativeCoCreateInstance(progId, this, iid);
	}

	/**
	 * Null value for Dispatch objects. Use this value instead on NULL in call,
	 * set and get functions.
	 */
	public final static Dispatch NULL = new Dispatch(0);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ndisp ^ (ndisp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Dispatch other = (Dispatch) obj;
		if (ndisp != other.ndisp)
			return false;
		return true;
	}

	/**
	 * Finalizer function releases the COM object.
	 */
	@Override
	protected void finalize() throws Throwable {
		JoaDll.deleteDispatch(this);
		super.finalize();
	}

	@Override
	public <T> T as(Class<T> clazz) {

		// This check ...
		// if (!this.is(clazz)) {
		// throw new ClassCastException("Object does not implement " + clazz);
		// }
		// ... causes an error if the object does not have a dual interface
		// (only an IDispatch)
		// E.g. Page oPage =
		// oInsp.getModifiedFormPages().as(PagesImpl.class).Add("My Page").as(Page.class);
		// would throw an exception on the last "as".

		return as(this, clazz);
	}

	/**
	 * Static version of {@link #as(Class)}.
	 * 
	 * @param idisp
	 *            Dispatch object
	 * @param clazz
	 *            Class
	 * @return Casted object or null, if idisp is null.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T as(Object idisp, Class<T> clazz) {
		T ret = null;
		if (idisp != null) {
			assert idisp instanceof Dispatch;
			
			if (clazz.isAssignableFrom(idisp.getClass())) {
				ret = (T) idisp;
			} else {
				ret = (T) JoaDll.dispatchAs(idisp, clazz);
			}
		}
		return ret;
	}

	/**
	 * This function tests whether the object implements all COM interfaces of
	 * the given class.
	 * 
	 * @param clazz
	 *            Class or interface.
	 * @return true, if this implements all interfaces of clazz. The interfaces
	 *         to check are found by annotation CoInterface. If clazz does not
	 *         have any CoInterface, the function returns false.
	 */
	public boolean is(Class<?> clazz) {
		return JoaDll.dispatchIs(this, clazz);
	}

	/**
	 * Check whether a native COM object is assigned.
	 * 
	 * @return true, if no COM object is assigned.
	 */
	public boolean isNull() {
		return ndisp == 0;
	}

	/**
	 * Delete internal IDispatch pointer to the COM object. Other Java objects
	 * might still reference the COM object. If the COM object should be
	 * released from all Java objects, call function {@link #releaseComObject()}
	 */
	public synchronized void release() {
		JoaDll.deleteDispatch(this);
		assert this.ndisp == 0;
	}

	public String toString() {
		return "[Dispatch " + Long.toHexString(ndisp) + "]";
	}

	/**
	 * IDispatch invocation flag for function.
	 */
	public static int DISPATCH_METHOD = 1;
	/**
	 * IDispatch invocation flag used when a property value should be read.
	 */
	public static int DISPATCH_PROPERTYGET = 2;
	/**
	 * IDispatch invocation flag used when a property value should be set.
	 */
	public static int DISPATCH_PROPERTYPUT = 4;
	/**
	 * Reserved.
	 */
	public static int DISPATCH_PROPERTYPUTREF = 8;

	public Object _get(String propName, Object... args) throws ComException {
		return _dispatchCall(null, propName, DISPATCH_PROPERTYGET, null, args);
	}

	public Object _get(String propName) throws ComException {
		return _dispatchCall(null, propName, DISPATCH_PROPERTYGET, null, new Object[0]);
	}

	public Object _get(int propId, Object... args) throws ComException {
		return _dispatchCall(propId, null, DISPATCH_PROPERTYGET, null, args);
	}

	public void _put(String propName, Object value, Object... args) throws ComException {
		_dispatchCall(null, propName, DISPATCH_PROPERTYPUT, value, args);
	}

	public void _put(int propId, Object value, Object... args) throws ComException {
		_dispatchCall(propId, null, DISPATCH_PROPERTYPUT, value, args);
	}

	@Deprecated
	public void _putref(String propName, Object value, Object... args) throws ComException {
		_dispatchCall(null, propName, DISPATCH_PROPERTYPUTREF, value, args);
	}

	@Deprecated
	public void _putref(int propId, Object value, Object... args) throws ComException {
		_dispatchCall(propId, null, DISPATCH_PROPERTYPUTREF, value, args);
	}

	public Object _call(String methodName, Object... args) throws ComException {
		return _dispatchCall(null, methodName, DISPATCH_METHOD, null, args);
	}

	public Object _call(int methodId, Object... args) throws ComException {
		return _dispatchCall(methodId, null, DISPATCH_METHOD, null, args);
	}

	public Object _dispatchCall(Integer methodId, String methodName, int method, Object putValue, Object... args)
			throws ComException {
		Object ret = JoaDll.dispatchCall(this, methodId, methodName, method, putValue, args);
		return ret;
	}

	/**
	 * Attach an event handler object. This function "advises" the handler's
	 * interfaces to the matching interfaces of the connection points.
	 * 
	 * @param handler
	 * @throws ComException
	 * @see {@link releaseEvents}
	 */
	public void withEvents(DispatchImpl handler) throws ComException {
		JoaDll.dispatchWithEvents(this, handler);
	}

	/**
	 * Static version of {@link #withEvents(DispatchImpl)}.
	 * 
	 * @param disp
	 *            Dispatch object
	 * @param handler
	 *            Handler object
	 * @throws ComException
	 */
	public static void withEvents(IDispatch disp, DispatchImpl handler) throws ComException {
		assert (disp != null);
		assert (disp instanceof Dispatch);
		assert (!((Dispatch) disp).isNull());
		assert (handler != null);
		JoaDll.dispatchWithEvents((Dispatch) disp, handler);
	}

	/**
	 * Disconnects the event handler.
	 * 
	 * @param handler
	 *            Handler object
	 * @throws ComException
	 */
	public void releaseEvents(DispatchImpl handler) throws ComException {
		JoaDll.dispatchReleaseEvents(this, handler);
	}

	/**
	 * Static version of {@link #releaseEvents(DispatchImpl)}.
	 * 
	 * @param disp
	 *            Dispatch object
	 * @param handler
	 *            Handler object
	 * @throws ComException
	 */
	public static void releaseEvents(IDispatch disp, DispatchImpl handler) throws ComException {
		if (disp == null || handler == null)
			return;
		assert (disp instanceof Dispatch);
		assert (!((Dispatch) disp).isNull());
		assert (handler != null);
		JoaDll.dispatchReleaseEvents((Dispatch) disp, handler);
	}

	/**
	 * Release all internal references to the COM object. This function effects
	 * other Dispatch objects that refer to the same COM object.
	 */
	public void releaseComObject() {
		releaseComObject(this);
	}

	/**
	 * Release all internal references to the COM object. This function effects
	 * other Dispatch objects that refer to the same COM object.
	 * 
	 * @param disp
	 *            COM object to be released.
	 */
	public static void releaseComObject(IDispatch disp) {
		assert (disp != null);
		assert (disp instanceof Dispatch);
		assert (!((Dispatch) disp).isNull());
		JoaDll.releaseComObject((Dispatch) disp);
	}

	/**
	 * This function tells the native library to call the interface from a
	 * background thread. Calling from a background thread should reduce
	 * deadlock situations in COM.
	 * 
	 * @param eventInterface
	 * @param memberName
	 */
	public static void addEventToBeCalledInBackground(Class<?> eventInterface, String memberName) {
		String iid = eventInterface.getAnnotation(CoInterface.class).guid();
		if (iid != null) {
			JoaDll.nativeAddEventCallInBackground(iid, memberName);
		}
	}
}
