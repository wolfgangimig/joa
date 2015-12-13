package imcl;

import com.wilutions.com.ComException;
import com.wilutions.mslib.uccollaborationlib.ContactEndpointType;
import com.wilutions.mslib.uccollaborationlib.IAccessPermission;
import com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation;
import com.wilutions.mslib.uccollaborationlib.IContact;
import com.wilutions.mslib.uccollaborationlib.IContactEndpoint;
import com.wilutions.mslib.uccollaborationlib.ICustomAvailabilityState;
import com.wilutions.mslib.uccollaborationlib.IPhone;
import com.wilutions.mslib.uccollaborationlib.ISelf;
import com.wilutions.mslib.uccollaborationlib.PublishableContactInformationType;
import com.wilutions.mslib.uccollaborationlib.SettingItemTypeInternal;

public class IMClientSelf implements ISelf {

	public IMClientSelf(Object buildContact) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAsynchronousOperation PublishContactInformation(
			PublishableContactInformationType[] _publishablePresenceItemTypes, Object[] _publishablePresenceItemValues,
			Object _selfCallback, Object _state) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContact getContact() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPhone CreatePhone(ContactEndpointType _phoneType, String _phoneUri, Boolean _toBePublished)
			throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean CanSetPhone(ContactEndpointType _phoneType) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPhone[] getPhones() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAsynchronousOperation SetPhones(IPhone[] _phones, Object _selfCallback, Object _state) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICustomAvailabilityState[] GetPublishableCustomAvailabilityStates(Integer _localeId) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAccessPermission[] getPermissions() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getPhotoDisplayed() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContactEndpoint getTestCallEndpoint() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAsynchronousOperation SetPhone(ContactEndpointType _phoneType, String _phoneUri, Boolean _toBePublished,
			Object _selfCallback, Object _state) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAsynchronousOperation RemovePhone(ContactEndpointType _phoneType, Object _selfCallback, Object _state)
			throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPhone GetPhone(ContactEndpointType _phoneType) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getIsInResiliencyMode() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object GetSettingInternal(SettingItemTypeInternal _settingItem) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

}
