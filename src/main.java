import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {
	static Scanner scanner = new Scanner(System.in);
	static boolean playing = false;
	static int xPosition = 0;
	static int yPosition = 0;
	static double distance = 0f;
	static int xTarget = -3;
	static int yTarget = 3;
	static int numberItems = -1;

	
	public static void main(String[] args) throws InterruptedException {
		init();
	}
	
	public static void init() throws InterruptedException {
		ident();
		keywords.keys();

		intro();
		playing = true;
		while(playing) {
			String input = userInput();
			checkPosition(input);
			if(numberItems == 0)
				printInventory();
		}
		
		
		
		scanner.close();
	}
	
	public static void printInventory() throws InterruptedException {
		printSpace(40); Thread.sleep(200); System.out.print("     ____\r\n"); 
		printSpace(40); Thread.sleep(200); System.out.print("    ,'   Y`.\r\n"); 
		printSpace(40); Thread.sleep(200); System.out.print("   /        \\\r\n"); 
		printSpace(40); Thread.sleep(200); System.out.print("   \\ ()  () /\r\n"); 
		printSpace(40); Thread.sleep(200); System.out.print("    `. /\\ ,'\r\n"); 
		printSpace(40); Thread.sleep(200); System.out.print("8====| \"\" |====8\r\n"); 
		printSpace(40); Thread.sleep(200); System.out.print("     `LLLU'");
		
		String[] strings = new String[1];
		strings[0] = "P  O  S  S  E  S  S  I  O  N  S";
		System.out.println();
		printSpace(33); Thread.sleep(200); main.autoText(strings, false, 20);
		System.out.println();
		System.out.println();
		List<String> items = inventory.getList();
		
		for(String item : items) {
			
			
			strings[0] = item;
			printSpace(36); Thread.sleep(200); main.autoText(strings, false, 20);
			System.out.println();
		}
		
		try {
			if(numberItems == 0) {
				numberItems++;
				System.out.println();
				strings[0] = "(Type 'items' to see your inventory)";
				printSpace(36); Thread.sleep(200); main.autoText(strings, false, 20);
			}
			
			Thread.sleep(200); System.out.println();
			Thread.sleep(200); System.out.println();
			Thread.sleep(200); System.out.println();
			}
		
		catch (NullPointerException ex){
			System.out.println("Not a big problem");
		}
	}
	
	public static void ident() throws InterruptedException {
		Thread.sleep(20); System.out.println();
		Thread.sleep(20); System.out.println();
		Thread.sleep(20); System.out.println();
		
        Thread.sleep(200);
  
		System.out.print("\r"); 
		Thread.sleep(20);
		System.out.print(" .---. .-. .-..----.     .--.  .----. .-. .-..----..-. .-. .---. .-. .-..----. .----. .----.    .----. .----.\r\n"); 
		Thread.sleep(20);
		System.out.print("{_   _}| {_} || {_      / {} \\ | {}  \\| | | || {_  |  `| |{_   _}| { } || {}  }| {_  { {__     /  {}  \\| {_  \r\n"); 
		Thread.sleep(20);
		System.out.print("  | |  | { } || {__    /  /\\  \\|     /\\ \\_/ /| {__ | |\\  |  | |  | {_} || .-. \\| {__ .-._} }   \\      /| |   \r\n"); 
		Thread.sleep(20);
		System.out.print("  `-'  `-' `-'`----'   `-'  `-'`----'  `---' `----'`-' `-'  `-'  `-----'`-' `-'`----'`----'     `----' `-'   \r"); 
		Thread.sleep(20);
		System.out.print("");
		Thread.sleep(20);
		System.out.print("\r"); 
		Thread.sleep(20);
		System.out.print(" .---. .-. .-..----.   .----.   .--.  .----. .----. .----..-. .-.   .-.   .-. .----.  .----. .----. \r\n"); 
		Thread.sleep(20);
		System.out.print("{_   _}| {_} || {_     | {}  } / {} \\ | {}  }| {}  }| {_  |  `| |   |  `.'  |/  {}  \\/  {}  \\| {}  }\r\n"); 
		Thread.sleep(20);
		System.out.print("  | |  | { } || {__    | {}  }/  /\\  \\| .-. \\| .-. \\| {__ | |\\  |   | |\\ /| |\\      /\\      /| .-. \\\r\n"); 
		Thread.sleep(20);
		System.out.print("  `-'  `-' `-'`----'   `----' `-'  `-'`-' `-'`-' `-'`----'`-' `-'   `-' ` `-' `----'  `----' `-' `-'\r"); 
		Thread.sleep(20);
		System.out.println("");
		
		Thread.sleep(20); System.out.println();
		Thread.sleep(20); System.out.println();
		
		Thread.sleep(20);
		printSpace(14); System.out.print("                .-~~~~~~~~~-._       _.-~~~~~~~~~-.\r\n"); 
		Thread.sleep(20);
		printSpace(14); System.out.print("            __.'              ~.   .~              `.__\r\n"); 
		Thread.sleep(20);
		printSpace(14); System.out.print("          .'//                  \\./                  \\\\`.\r\n"); 
		Thread.sleep(20);
		printSpace(14); System.out.print("        .'//                     |                     \\\\`.\r\n");
		Thread.sleep(20);
		printSpace(14); System.out.print("      .'// .-~\"\"\"\"\"\"\"~~~~-._     |     _,-~~~~\"\"\"\"\"\"\"~-. \\\\`.\r\n");
		Thread.sleep(20);
		printSpace(14); System.out.print("    .'//.-\"                 `-.  |  .-'                 \"-.\\\\`.\r\n");
		Thread.sleep(20);
		printSpace(14); System.out.print("  .'//______.============-..   \\ | /   ..-============.______\\\\`.\r\n"); 
		Thread.sleep(20);
		printSpace(14); System.out.print(".'______________________________\\|/______________________________`.");
		System.out.println("");
		System.out.println("");
		String[] creationDate = new String[1];
		printSpace(15); creationDate[0] = "Created by Matt Bulley - Friday, 9 February";
		autoText(creationDate, false, 20);
		
		System.out.println("");
		System.out.println("");
		Thread.sleep(200); System.out.println();
		Thread.sleep(200); System.out.println();
		Thread.sleep(200); System.out.println();
		Thread.sleep(1000);
	}
	
	public static void printSpace(int spaces) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < spaces; i++) {
			sb.append(" ");
		}
		String toString = sb.toString();
		System.out.print(toString);
	}
	
	public static void intro() throws InterruptedException {
		
		String[] strings = new String[3];
		
		strings[0] = "Simple text adventure called \"The adventure of the barren moor\"\r\n"; 		
		strings[1] = "Type 'quit' to exit the program.\r\n";
		strings[2] = "Try: north/south/east/west and look.\r\n";
		
		
		
		autoText(strings, false, 20);
		
	}
	
	public static void autoText(String[] strings, boolean space, int speed) throws InterruptedException {
		
		try {
			for(String string : strings) {
				char[] characters = string.toCharArray();
				
				if(space)
					main.printSpace(36); 
				
				for(char character : characters) {
					Thread.sleep(speed);
					System.out.print(character);
				}
			}
		}
		catch (NullPointerException ex){
			System.out.println("");
		}
	}
	
	public static void checkPosition(String input) throws InterruptedException {
		
		String temp = input;
		System.out.println();
	
		if(input.equalsIgnoreCase("north") || input.equalsIgnoreCase("south") || input.equalsIgnoreCase("east") || input.equalsIgnoreCase("west")) {
			movePosition(input);
			temp = "";
		}
		
		if(input.equalsIgnoreCase("quit")) {
			System.out.println("Thanks for playing.");
			System.exit(0);
		}
		
		if(input.equalsIgnoreCase("items")) {
			printInventory();
		}
		
		
		if(xPosition == 0 && yPosition == 1)
			keywords.pos01(temp);
		
		if(xPosition == -1 && yPosition == -2)
			keywords.posn1n2(temp);
		
		if(xPosition == -3 && yPosition == 3)
			keywords.posn33(temp);
		
		if(xPosition == 1 && yPosition == 0)
			keywords.pos10(temp);

		
		String[] strings = new String[2];
		strings[0] = "[" + xPosition + "/" + yPosition + "]\r\n";
		strings[1] = "The Dial Reads: " + Double.toString(distance) + " miles";
		
		main.autoText(strings, true, 20);
		Thread.sleep(200); System.out.println();
		Thread.sleep(200); System.out.println();
		Thread.sleep(200); System.out.println();
	}
	
	public static String userInput() throws InterruptedException {
		boolean incorrectInput = true;
		String input = "";
		scanner.reset();
		do {
			try {
					input = scanner.nextLine();
					incorrectInput = false;
				} catch (Exception wrongInput) {
					
					System.out.println("");
					System.out.println("Incorrect input! Please enter a valid input");
				}
			
			if(incorrectInput) {
				System.out.println("");
				System.out.println("Incorrect input! Please enter a valid input");
			}
		} while (incorrectInput);
		
		checkUserInput(input);
		return input;
	}
	
	public static void checkUserInput(String input) throws InterruptedException {
		System.out.println("");
		
		
		keywords.check(input);
	}

	public static void movePosition(String ID) throws InterruptedException
	{
		
		
		String[] strings = new String[1];
		switch(ID)
		{
			case "north":
				strings[0] = "You move to the north.\r\n";
				main.yPosition++;
				break;
			case "south":
				strings[0] = "You move to the south.\r\n";
				main.yPosition--;
				break;
			case "east":
				strings[0] = "You move to the east.\r\n";
				main.xPosition++;
				break;
			case "west":
				strings[0] = "You move to the west.\r\n";
				main.xPosition--;
				break;
		}
			
		main.printSpace(36); main.autoText(strings, false, 20);
		
		//update distance
		double xLength = xTarget - xPosition;
		double xSquared = Math.pow(xLength, 2);
		double yLength = yTarget - yPosition;
		double ySquared = Math.pow(yLength, 2);
		distance = Math.sqrt(xSquared + ySquared); 
		distance = round(distance, 1);
	}
	
	private static double round (double value, int precision) {
	    int scale = (int) Math.pow(10, precision);
	    return (double) Math.round(value * scale) / scale;
	}

}
