package week05CodingProject;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		char [] logChar = log.toCharArray();
		
		for (char i : logChar) {
			System.out.print(i);
			System.out.print(" ");
		}
		
	}

	@Override
	public void error(String error) {
		System.out.print("ERROR:" );
		char [] errorChar = error.toCharArray();
		
		for(char a : errorChar)	{
			System.out.print(a);
			System.out.print(" ");
		}
		
	}

}
