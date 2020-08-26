import java.util.Scanner;

public class gameStart{
//	private String rock = "Rock";
//	private String paper = "Paper";
//	private String scissor = "Scissor";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String playerOne;
		String playerTwo;
//		gameStart defaultRules = new gameStart();
		nameChange rules = new nameChange();
		int choice;
		
		
		System.out.println("Welcome to Rock, Paper, Scissor Battle Royale\nInput 1 to start game\nInput 2 to change names");
		choice = input.nextInt();
		
		if(choice == 1) {
//			System.out.println("Game Start\n 1 = Rock\n 2 = Paper\n 3 = Scissor\n Enter name or number of your choice ");
//			playerOne = input.next();
//			playerTwo = input.next();
//			answerCheck(playerOne, playerTwo, defaultRules.rock, defaultRules.paper, defaultRules.scissor);
			gamePlayer(rules);
		
		}else if(choice == 2) {
			rules = ruleSettings();
			gamePlayer(rules);
//			System.out.println("Game Start\n 1 = "+ newRules.rock + "\n 2 = "+ newRules.paper + "\n 3 = "+ newRules.scissor +"\n Enter name or number of your choice ");
//			playerOne = input.next();
//			playerTwo = input.next();
//			answerCheck(playerOne, playerTwo, newRules.rock, newRules.paper, newRules.scissor);
		}
		
	}

	public static void gamePlayer(nameChange chosenRules) {
		String playerOne;
		String playerTwo;
		Scanner inputGame = new Scanner(System.in);
		
		//System.out.println("Game Start\n 1 = "+ chosenRules.rock + "\n 2 = "+ chosenRules.paper + "\n 3 = "+ chosenRules.scissor +"\n Enter name or number of your choice ");
		playerOne = inputGame.nextLine();
		playerTwo = inputGame.nextLine();
		answerCheck(playerOne, playerTwo, chosenRules.rock, chosenRules.paper, chosenRules.scissor);
		inputGame.close();
	}
	
//	public static void gamePlayer(nameChange chosenRules) {
//		String playerOne;
//		String playerTwo;
//		Scanner inputGame = new Scanner(System.in);
//		
//		System.out.println("Game Start\n 1 = "+ chosenRules.rock + "\n 2 = "+ chosenRules.paper + "\n 3 = "+ chosenRules.scissor +"\n Enter name or number of your choice ");
//		playerOne = inputGame.next();
//		playerTwo = inputGame.next();
//		answerCheck(playerOne, playerTwo, chosenRules.rock, chosenRules.paper, chosenRules.scissor);
//		inputGame.close();
//	}
	
	public static void randomNumber() {
		
	}
	
	public static nameChange ruleSettings() {
		String rockNewName;
		String paperNewName;
		String scissorNewName;
		Scanner inputRules = new Scanner(System.in);
		nameChange newRules = new nameChange();
		
		System.out.println("Enter new name for ROCK: ");
		rockNewName = inputRules.next();
		System.out.println("Enter new name for PAPER: ");
		paperNewName = inputRules.next();
		System.out.println("Enter new name for SCISSOR: ");
		scissorNewName = inputRules.next();
		
		newRules = new nameChange(rockNewName, paperNewName, scissorNewName);
		inputRules.close();
		return newRules;
	}
	
	public static void answerCheck(String playerOneAns, String playerTwoAns, String rockName, String paperName, String scissorName) {
		if(playerOneAns.equals("1") || playerOneAns.equalsIgnoreCase(rockName)) {
			if(playerTwoAns.equals("1") || playerTwoAns.equalsIgnoreCase(rockName)) {
				System.out.println("Draw");
			}
			else if(playerTwoAns.equals("2") || playerTwoAns.equalsIgnoreCase(paperName)) {
				System.out.println("Player Two Wins!");
			}
			else if(playerTwoAns.equals("3") || playerTwoAns.equalsIgnoreCase(scissorName)) {
				System.out.println("Player One Wins!");
			}
		}
		else if(playerOneAns.equals("2") || playerOneAns.equalsIgnoreCase(paperName)) {
			if(playerTwoAns.equals("1") || playerTwoAns.equalsIgnoreCase(rockName)) {
				System.out.println("Player One Wins!");
			}
			else if(playerTwoAns.equals("2") || playerTwoAns.equalsIgnoreCase(paperName)) {
				System.out.println("Draw");
			}
			else if(playerTwoAns.equals("3") || playerTwoAns.equalsIgnoreCase(scissorName)) {
				System.out.println("Player Two Wins!");
			}
		}
		else if(playerOneAns.equals("3") || playerOneAns.equalsIgnoreCase(scissorName)) {
			if(playerTwoAns.equals("1") || playerTwoAns.equalsIgnoreCase(rockName)) {
				System.out.println("Player Two Wins!");
			}
			else if(playerTwoAns.equals("2") || playerTwoAns.equalsIgnoreCase(paperName)) {
				System.out.println("Player One Wins!");
			}
			else if(playerTwoAns.equals("3") || playerTwoAns.equalsIgnoreCase(scissorName)) {
				System.out.println("Draw");
			}
		}

	}
}

class nameChange{
	String rock = "Rock";
	String paper = "Paper";
	String scissor = "Scissor";
	
	public nameChange() {
		rock = "Rock";
		paper = "Paper";
		scissor = "Scissor";
	}
	
	public nameChange(String newRock, String newPaper, String newScissor) {
	    rock = newRock;
	    paper = newPaper;
	    scissor = newScissor; 
	  }

}
