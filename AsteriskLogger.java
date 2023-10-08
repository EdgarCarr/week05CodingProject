package week05CodingProject;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		System.out.println("******************" + "*".repeat(error.length()));
		System.out.println("***ERROR: " + error + "*".repeat(error.length()));
		System.out.println("******************" + "*".repeat(error.length()));
		
		
	}

}
