package week05CodingProject;

public class App extends SpacedLogger  {
	
	public static void main(String[] a) {
		
		Logger log = new AsteriskLogger();
		
		log.log("One Piece");
		System.out.println();
		
		log.error("One Piece");
		System.out.println();
		
		
		SpacedLogger nextLog = new SpacedLogger();
		
		nextLog.log("Hola");
		System.out.println();
		
		nextLog.error("Hola");
		System.out.println();
		
		
	}
}
