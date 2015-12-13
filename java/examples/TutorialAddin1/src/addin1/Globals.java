package addin1;

public class Globals {
	
	private static JoaAddin1 addin;

	protected static void setThisAddin(JoaAddin1 addin) {
		Globals.addin = addin;
	}

	public static JoaAddin1 getThisAddin() {
		return addin;
	}
}
