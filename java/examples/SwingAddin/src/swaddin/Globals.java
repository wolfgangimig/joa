package swaddin;

public class Globals {
	
	private static SwingAddin addin;

	protected static void setThisAddin(SwingAddin addin) {
		Globals.addin = addin;
	}

	public static SwingAddin getThisAddin() {
		return addin;
	}
}
