package knightGame;

import java.util.Scanner;

public class KnightGameTester {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int selectBoard, selectPlayer;

		System.out.println("\t<Kinght Tour>");
		System.out.println("");
		System.out.println("1. 3X3 board\t2. 5X5 board\t3. 8X8 board");
		System.out.print("Select the board : ");
		selectBoard = in.nextInt();

		System.out.println("");
		System.out.println("1.Computer\t2.User");
		System.out.print("Select the player : ");
		selectPlayer = in.nextInt();

		KnightGame game = new KnightGame(selectBoard, selectPlayer);
		KnightGame.clear();
		
		if(selectPlayer == 1){
			game.computerMode();
		}
		else if (selectPlayer == 2) {
			game.userMode();
		}
	}
}
