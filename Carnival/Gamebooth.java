package Carnival;
import java.lang.Math;

public class Gamebooth {
	private double cost;
	private String firstPrize, consolationPrize;
	private int firstPrizesAwarded, conPrizesAwarded;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A GameBooth object created. The cost and prizes are set.
	 */
	public Gamebooth(double charge, String p1, String p2) {
		cost = charge;
		firstPrize = p1;
		consolationPrize = p2;
		firstPrizesAwarded = 0;
		conPrizesAwarded = 0;
	}
	

	/** 
	 * Game is played and prize awarded.
	 * pre: none
	 * post: Player had three tries. Player successful all 
	 * three times received the first prize. A consolation 
	 * prize has been awarded otherwise.
	 */
	public String start() {
		int toss;
		int successes = 0;
	 	
	 	/* play game */
	 	for (int i = 0; i < 3; i++) {	//player gets three tries
	 		toss = (int)(Math.random() + 0.5);	//0 or 1
	 		if (toss == 1) {
	 			successes += 1;			//a successful toss is equal to 1
	 		}
			
	 	}

		if (successes == 3) {
				firstPrizesAwarded += 1;
				return(firstPrize);
			} else {
				conPrizesAwarded += 1;
				return(consolationPrize);
			}
	}


	/** 
	 * Returns the cost to play the game.
	 * pre: none
	 * post: Cost of the game has been returned.
	 */
	public double firstPrizesAwarded() {
	 	return(firstPrizesAwarded);
	}
	public double conPrizesAwarded() {
	 	return(conPrizesAwarded);
	}
	public double getCost() {
	 	return(cost);
	}
}
