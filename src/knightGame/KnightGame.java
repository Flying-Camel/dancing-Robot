package knightGame;

import java.util.Random;
import java.util.Scanner;

public class KnightGame {
	public static Scanner in = new Scanner(System.in);
	public static final int[][] board3 = new int[3][3];
	public static final int[][] board5 = new int[5][5];
	public static final int[][] board8 = new int[8][8];
	private int[][] board; // ������ �̵��ߴ����� �˷��ִ� ����.
	private int manyRows; // ����ϱ�� ���� ����ϴ���.
	private int count; // ���� ���° �����̰� �ִ��� Ȯ��.
	
	public KnightGame(int board, int player) {
		count = 1;
		if (board == 1) {
			this.board = board3;
			manyRows = 3;
		} else if (board == 2) {
			this.board = board5;
			manyRows = 5;
		} else if (board == 3) {
			this.board = board8;
			manyRows = 8;
		}
	}

	public void start() {

		Random startingPoint = new Random();
		int randomRow = startingPoint.nextInt(manyRows);
		int randomCol = startingPoint.nextInt(manyRows);
		this.board[randomRow][randomCol] = 100;

		printMovePossible(randomRow, randomCol);
		if (isQuiteGame())
			printScore();
	}


	public void printScore() {
		System.out.println("Your score is... " + count + "!!");
	}

	public boolean isQuiteGame() {
		if (countPossible() == 0)
			return true;
		else
			return false;
	}

	public void userMode() {
		start();
		while (!isQuiteGame()) {
			System.out.println(toString());
			movePosition();
			clear();
		}
		System.out.println(toString());
		printScore();
	}
	
	public void computerMode() {
		
		start();
		while (!isQuiteGame()) {
			System.out.println(toString());
			selectBest();
			clear();
		}			
		System.out.println(toString());
		printScore();
	}
	//1,2 2,3 3,4 4,5 �� �������� ���� �Ϸ� X 3,1 3,5 ����
	public void selectBest(){      //���� ������ ��ǥ�� ã�� 300���� ����.
		int row=0,col=0;
		int count=8;
		int[][] countBoard = new int[manyRows][manyRows];
		
		for (int i = 0; i < manyRows; i++)
			for (int j = 0; j < manyRows; j++)
				if(board[i][j]==100){
					row=i;
					col=j;                      //������ġ�� ��ǥ�� ����  ���ʿ�???
				}
		for (int i = 0; i < manyRows; i++)
			for (int j = 0; j < manyRows; j++)
				if(board[i][j]==200){
					erase();                   //�����ִ� 200 �������
					printMovePossible(i,j);    //����ġ���� 200�� ���
					if(count>countPossible()){         //���⿡ �������ִ�.
						countBoard[i][j] = countPossible();   //���� ������ ������ �ڸ��� �������� ��.
						count=countPossible();
					}
					else
						countBoard[i][j]=500;
					erase();                       //�ٽ� ��� 200�� �����ְ�
					printMovePossible(row,col);    //100 �������� 200 �����.
				}
				else countBoard[i][j]= 500; //ī��Ʈ�� 0�϶��� ������ �ǵ��� �ؾ��Ѵ�. (�����Ⱚ)
							
			for (int i = 0; i < manyRows; i++)
				for (int j = 0; j < manyRows; j++)
					if(countBoard[i][j]==count){
						move(i,j);
						erase();                   
						printMovePossible(i,j);    
					}	
	}
	
	public int countPossible(){
		int count=0;
		
		for (int i = 0; i < manyRows; i++)
			for (int j = 0; j < manyRows; j++)
				if (board[i][j] == 200)
					count++;
		
		return count;
	}

	public void printMovePossible(int row, int col) {

		if ((row + 1) < manyRows && (col + 2) < manyRows
				&& board[row + 1][col + 2] == 0)
			board[row + 1][col + 2] = 200;
		if ((row + 1) < manyRows && (col - 2) < manyRows && (col - 2) > -1
				&& board[row + 1][col - 2] == 0)
			board[row + 1][col - 2] = 200;
		if ((row - 1) < manyRows && (col + 2) < manyRows && (row - 1) > -1
				&& board[row - 1][col + 2] == 0)
			board[row - 1][col + 2] = 200;
		if ((row - 1) < manyRows && (col - 2) < manyRows && (row - 1) > -1
				&& (col - 2) > -1 && board[row - 1][col - 2] == 0)
			board[row - 1][col - 2] = 200;
		if ((row + 2) < manyRows && (col + 1) < manyRows
				&& board[row + 2][col + 1] == 0)
			board[row + 2][col + 1] = 200;
		if ((row + 2) < manyRows && (col - 1) < manyRows && (col - 1) > -1
				&& board[row + 2][col - 1] == 0)
			board[row + 2][col - 1] = 200;
		if ((row - 2) < manyRows && (col + 1) < manyRows && (row - 2) > -1
				&& board[row - 2][col + 1] == 0)
			board[row - 2][col + 1] = 200;
		if ((row - 2) < manyRows && (col - 1) < manyRows && (row - 2) > -1
				&& (col - 1) > -1 && board[row - 2][col - 1] == 0)
			board[row - 2][col - 1] = 200;
	}

	public boolean isMove(int possible) {
		if (possible == 200)
			return true;
		return false;
	}

	public void move(int row, int col) {
		// �ε��� ���� ����� �ʵ��� ����ó�����ش�.
		if (row > manyRows || col > manyRows || row < 0 || col < 0
				|| !isMove(board[row][col])) {
			System.out.println("Can't move there");
			try {
				Thread.sleep(1000); // 1�ʰ� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return;
		}
		for (int i = 0; i < manyRows; i++)
			for (int j = 0; j < manyRows; j++) { // ������ġ �˻�.
				if (board[i][j] == 100)
					board[i][j] = count; // ������ġ�� �̵�Ƚ�� ����
			}
		this.board[row][col] = 100; // ���ο� �ε����� ������ġ�� ��
		count++; // �̵�Ƚ�� ����.

		erase(); // �����ִ� S�� �����ְ�
		printMovePossible(row, col); // �ű�� S ������ְ�
	}

	public void erase() {
		for (int i = 0; i < manyRows; i++)
			for (int j = 0; j < manyRows; j++) {
				if (board[i][j] == 200)
					board[i][j] = 0;
			}
	}

	public void movePosition() {
		int row, col;
		System.out.println("Enter next move");
		System.out.print("Row : ");
		row = in.nextInt();
		System.out.print("Colum : ");
		col = in.nextInt();

		move(row - 1, col - 1); // �ű��
	}

	public String toString() {
		String stringBoard = " ";

		for (int i = 1; i < board.length + 1; i++)
			stringBoard += "  " + i;
		stringBoard += "\n";

		for (int j = 0; j < board.length; j++) {
			stringBoard += (j + 1) + "��";
			for (int i = 0; i < board.length; i++) {
				if (board[j][i] == 0)
					stringBoard += "  ��";
				else if (board[j][i] == 100)
					stringBoard += "P ��";
				else if (board[j][i] == 200)
					stringBoard += "S ��";
				else {
					if (board[j][i] < 10)
						stringBoard += "" + board[j][i] + " ��";
					else
						stringBoard += "" + board[j][i] + "��";
				}
			}
			stringBoard += "\n";
		}
		return stringBoard;
	}

	public static void clear() { // ȭ���� �����ϰ� ���ش�
		for (int i = 0; i < 80; i++) {
			System.out.println("");
		}
	}
}
