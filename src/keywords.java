import java.util.*;

public class keywords {
	public static List<String> keyword = new ArrayList<String>();
	
	public static void keys() {
		keyword.add("look"); // 1
		keyword.add("north");
		keyword.add("south");
		keyword.add("east");
		keyword.add("west");
		keyword.add("help");
		keyword.add("ask");
		keyword.add("examine");
		keyword.add("inspect");
		keyword.add("grab");
		keyword.add("take");
	}
	
	public static void check(String input) throws InterruptedException
	{
		if(keyword.contains(input))
		{
			
			main.printSpace(44); Thread.sleep(200); System.out.print("  ___\r\n"); 
			main.printSpace(44); Thread.sleep(200); System.out.print(" / \\ \\\r\n"); 
			main.printSpace(44); Thread.sleep(200); System.out.print("/ /_\\_\\\r\n"); 
			main.printSpace(44); Thread.sleep(200); System.out.print("\\/____/");
			System.out.println();
		}
		
	}
	
	public static void pos00(String ID) throws InterruptedException
	{
		String[] strings = new String[1];
		switch(ID)
		{
			case "look":
				strings[0] = "There is an infinite swamp spanning in all directions.\r\n"; 
				break;
			case "quit":
				System.out.println("Thanks for playing.");
				System.exit(0);
				break;
		}
			
		main.autoText(strings, false, 20);
	}
	
	public static void pos01(String ID) throws InterruptedException
	{
		String[] strings = new String[2];
		 
		
		switch(ID)
		{
			case "":
				strings[0] = "Walking about a mile through the marshes.\r\n";
				strings[1] = "You find a stone well that is old and broken.\r\n";
				break;
			case "look":
				strings[0] = "There is a broken wooden bucket hanging by a rope.";
				strings[1] = "\r\n";
				break;
			case "grab":
				strings[0] = "You lean over the ominous well, and take the bucket.";
				strings[1] = "\r\n";
				break;
			case "take":
				strings[0] = "You lean over the ominous well, and take the bucket.";
				strings[1] = "\r\n";
				inventory.setBucket(true);
				break;
			case "quit":
				System.out.println("Thanks for playing.");
				System.exit(0);
				break;
		}
			
		main.autoText(strings, true, 20);
	}
	
	public static void pos02(String ID) throws InterruptedException
	{
		String[] strings = new String[1];
		switch(ID)
		{
			case "look":
				strings[0] = "There is an infinite swamp spanning in all directions.\r\n"; 
				break;
			case "quit":
				System.out.println("Thanks for playing.");
				System.exit(0);
				break;
		}
			
		main.autoText(strings, false, 20);
	}
	
	public static void pos03(String ID) throws InterruptedException
	{
		String[] strings = new String[1];
		switch(ID)
		{
			case "look":
				strings[0] = "There is an infinite swamp spanning in all directions.\r\n"; 
				break;
			case "quit":
				System.out.println("Thanks for playing.");
				System.exit(0);
				break;
		}
			
		main.autoText(strings, false, 20);
	}
	
	public static void pos0n1(String ID) throws InterruptedException
	{
		String[] strings = new String[1];
		switch(ID)
		{
			case "look":
				strings[0] = "There is an infinite swamp spanning in all directions.\r\n"; 
				break;
			case "quit":
				System.out.println("Thanks for playing.");
				System.exit(0);
				break;
		}
			
		main.autoText(strings, false, 20);
	}
	
	public static void pos0n2(String ID) throws InterruptedException
	{
		String[] strings = new String[1];
		switch(ID)
		{
			case "look":
				strings[0] = "There is an infinite swamp spanning in all directions.\r\n"; 
				break;
			case "quit":
				System.out.println("Thanks for playing.");
				System.exit(0);
				break;
		}
			
		main.autoText(strings, false, 20);
	}
	
	public static void pos0n3(String ID) throws InterruptedException
	{
		String[] strings = new String[1];
		switch(ID)
		{
			case "look":
				strings[0] = "There is an infinite swamp spanning in all directions.\r\n"; 
				break;
			case "quit":
				System.out.println("Thanks for playing.");
				System.exit(0);
				break;
		}
			
		main.autoText(strings, false, 20);
	}
	
	public static void posn1n2(String ID) throws InterruptedException
	{
		String[] strings = new String[7];
		switch(ID)
		{
			case "":
				strings[0] = "A thick fog manifests itself around you.\r\n";
				Thread.sleep(200); System.out.print("");
				Thread.sleep(200); System.out.println("");
				Thread.sleep(200); System.out.println("");
				Thread.sleep(200); System.out.println("");
				main.printSpace(30); Thread.sleep(200); System.out.print("             __,aaPPPPPPPPaa,__\r\n");
				main.printSpace(30); Thread.sleep(200); System.out.print("         ,adP\"\"\"'          `\"\"Yb,_\r\n");
				main.printSpace(30); Thread.sleep(200); System.out.print("      ,adP'                     `\"Yb,\r\n");
				main.printSpace(30); Thread.sleep(200); System.out.print("    ,dP'     ,aadPP\"\"\"\"\"YYba,_     `\"Y,\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print("   ,P'    ,aP\"'            `\"\"Ya,     \"Y,\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print("  ,P'    aP'     _________     `\"Ya    `Yb,\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print(" ,P'    d\"    ,adP\"\"\"\"\"\"\"\"Yba,    `Y,    \"Y,\r\n");
				main.printSpace(30); Thread.sleep(200); System.out.print(",d'   ,d'   ,dP\"            `Yb,   `Y,    `Y,\r\n");
				main.printSpace(30); Thread.sleep(200); System.out.print("d'   ,d'   ,d'    ,dP\"\"Yb,    `Y,   `Y,    `b\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print("8    d'    d'   ,d\"      \"b,   `Y,   `8,    Y,\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print("8    8     8    d'    _   `Y,   `8    `8    `b\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print("8    8     8    8     8    `8    8     8     8\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print("8    Y,    Y,   `b, ,aP     P    8    ,P     8\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print("I,   `Y,   `Ya    \"\"\"\"     d'   ,P    d\"    ,P\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print("`Y,   `8,    `Ya         ,8\"   ,P'   ,P'    d'\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print(" `Y,   `Ya,    `Ya,,__,,d\"'   ,P'   ,P\"    ,P\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print(	"  `Y,    `Ya,     `\"\"\"\"'     ,P'   ,d\"    ,P'\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print(	"   `Yb,    `\"Ya,_          ,d\"    ,P'    ,P'\r\n");
				main.printSpace(30); Thread.sleep(200); System.out.print(	"     `Yb,      \"\"YbaaaaaadP\"     ,P'    ,P'\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print(	"       `Yba,                   ,d'    ,dP'\r\n");
				main.printSpace(30); Thread.sleep(200); System.out.print(	"          `\"Yba,__       __,adP\"     dP\"\r\n"); 
				main.printSpace(30); Thread.sleep(200); System.out.print(	"              `\"\"\"\"\"\"\"\"\"\"\"\"\"'");
				Thread.sleep(200); System.out.println("");
				Thread.sleep(200); System.out.println("");
				Thread.sleep(200); System.out.println("");
				
				strings[1] = "Ghostly whispers play tricks on the stranger.\r\n";
				strings[2] = "'I turn around once'\r\n";
				strings[3] = "'What is out will not get in'\r\n";
				strings[4] = "'I turn around again'\r\n";
				strings[5] = "'what is in will not get out'\r\n\r\n";
				strings[6] = "What am I?\r\n\r\n";
				
				break;
			case "key":
				strings[0] = "An unlocking sound clunks at your shoulder.\r\n"; 
				strings[1] = "You turn to look but it's gone.\r\n"; 
				strings[2] = "A thick key reveals itself."; 
				strings[3] = ""; 
				strings[4] = ""; 
				strings[5] = ""; 
				strings[6] = "\r\n"; 
				inventory.setKey(true);
				
				break;
			case "quit":
				System.out.println("Thanks for playing.");
				System.exit(0);
				break;
		}
			
		main.autoText(strings, true, 70);
	}
	
	public static void posn33(String ID) throws InterruptedException
	{
		String[] strings = new String[2];
		strings[0] = "RAAAAWRRRRRGHHHHHH!.\r\n"; 
		
		if(!ID.equals("end")) {
		main.printSpace(36); Thread.sleep(200); System.out.println();
		main.printSpace(36); Thread.sleep(200); System.out.print("   (\\               /)\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("    __)\\             /(__\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("   __)_ \\  (\\!~!/)  / _(__\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("  __)_ `.\\  )d b(  /.' _(__\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("___)_ `. \\\\(  _  )// .' _(___\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print(" )_  `. \\  ((q_p))  / .'  _(_\r\n");
		main.printSpace(36); Thread.sleep(200); System.out.print(" _)`.  \\  ,-)\\_/(-.  /  .'(_\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("  _) ,-._/v/vvvvv\\v\\_,-. (_\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("  _)///(._/v(___)v\\_.)\\\\\\(_\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("   \\_ ___/v(_____)v\\___ _/\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("     /vvv\\(_______)/vvv\\\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("     \\vvv/v(_____)v\\vvv/  \r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("     _\\vv\\\\v(___)v//vv/_\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("    '>_`  \\`-._.-'/  '_<`\r\n");
		main.printSpace(36); Thread.sleep(200); System.out.print("    ' >_,-'       `-._<`");
		}
		System.out.println();
		System.out.println();
		switch(ID)
		{
			case "sword":
				strings[0] = "You attack the dragon with your hand!.\r\n"; 
				strings[1] = "He disappears in a ploom of smoke!.\r\n"; 
				
				break;
			case "end":
				System.out.println("WINNER: Thanks for playing.");
				System.exit(0);
				break;
			default:
				break;
		}
			
		main.autoText(strings, true, 20);
		
		if(ID.equals("sword"))
			posn33("end");
	}
	
	public static void pos10(String ID) throws InterruptedException
	{
		String[] strings = new String[2];
		strings[0] = "Ride on my back\r\n";
		strings[1] = "I'll carry you across the river...\r\n"; 
		
		main.printSpace(36); Thread.sleep(200); System.out.println();
		main.printSpace(36); Thread.sleep(200); System.out.print("              _________\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("             /_/___|__/\\\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("            /_/       \\/|\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("            !_!       / |\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("            !_!       |_/\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("            !_!        \\|\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("           !___!        )\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("          !_____!\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print(" ======  !_______!  ======\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("//    \\\\!_________!//    \\\\\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("\\ =====\\!_________!/===== /\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print(" //   \\\\!_/#####\\_!//   \\\\\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print(" \\     \\\\|###)###|//     /\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("   ======!#######!======\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("  //      |Q(^)Q|      \\\\\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("  ||  ====       ====  ||\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("   \\ //             \\\\ /\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.print("    /_|             |_\\\r\n");
		main.printSpace(36); Thread.sleep(200); System.out.print("   |  \\__/       \\__/  |\r\n");  
		main.printSpace(36); Thread.sleep(200); System.out.print("   |    / /     \\ \\    |\r\n"); 
		main.printSpace(36); Thread.sleep(200); System.out.println("    \\__/=/       \\=\\__/\r\n");
		
		System.out.println();
		System.out.println();
		switch(ID)
		{
			case "run":
				strings[0] = "You manage to run away!."; 
				strings[1] = "\r\n";
				main.xPosition++;
				break;
			case "quit":
				System.out.println("Thanks for playing.");
				System.exit(0);
				break;
			default:
				break;
		}
			
		 main.autoText(strings, true, 20);
	}
	
	
}
