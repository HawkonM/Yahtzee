package yahtzee;

public class Dice {
	int[] diceArray ;
	
	static int[] createDiceArray() {
		int[] dArray = {1, 2, 3, 4, 5};
		for(int i=0; i<5; i++) {
			dArray[i] = rollDice();
		}
		return dArray;
		
	}
	
	
	//rolls a one of the dice in a array, needs an array of dice as input and an index to roll
	static int[] rollPos(int[] diceArray, int index) {	
		int[] dA = diceArray;
		dA[index] = rollDice();
		return dA;	
	
	}
	
	static int rollDice() {
		double r = Math.random();
        double sum = Math.floor(r * 6) + 1;
        int s = (int) Math.round(sum);
        System.out.println(s);
        return s;
		
	}
}
