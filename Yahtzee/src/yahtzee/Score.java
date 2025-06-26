package yahtzee;



public class Score {
	
	
	public static int aces(int ones) {
		int sum = ones*1;
		return sum;
	}
	public static int twos(int twos) {
		int sum = twos*2;
		return sum;
	}
	public static int threes(int threes) {
		int sum = threes*3;
		return sum;
	}
	
	public static int fours(int fours) {
		int sum = fours*4;
		return sum;
	}
	
	public static int fives(int fives) {
		int sum = fives*5;
		return sum;
	}
	
	public static int sixes(int sixes) {
		int sum = sixes*6;
		return sum;
	}
	//should return 3 of a kind or more, todo fix the "or more" part
	public static int threeOfaKind(int a, int b, int c) {
		int sum = 0;
		if(a == b & b == c ) {
		sum = a + b + c;
		}
		return sum;
	}
	public static int fourOfaKind(int a, int b, int c, int d) {
		int sum = 0;
		if(a == b & b == c & c == d) {
		sum = a + b + c + d;
		}
		return sum;
	}
	
	public static int fullHouse(int[] diceArray) {
		//TODO
		int sum = 0;
		
		return sum;
	}
	
	public static int upperBonus(int upperTot) {
		if(upperTot <63) {
				return 0;
		} else return 35;
	}

	public static int yahtzeeBonus(int yahtzee) {
		if(yahtzee == 50) {
				return 100;
		} else return 0;
	}
}
