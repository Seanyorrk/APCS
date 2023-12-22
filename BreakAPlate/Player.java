package BreakAPlate;

/**
 * Player class
 */
public class Player {
	private double spendingMoney;
	private String prizesWon;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Player object created. Spending money given to player.
	 * Prize won set to to none.
	 */
	public Player(double money) {
		spendingMoney = money;
		prizesWon = "";
	}
	

	/** 
	 * Player pays for and then plays a game.
	 * pre: none
	 * post: Player's spending money decreased by cost of game.
	 * The player has a new prize added to existing prizes.
	 */
	public String play(double charge, String newPrize) {
		if (charge > spendingMoney) {
			return("Sorry, not enough money to play.");
		} else {
			spendingMoney -= charge;					//pay for game
			prizesWon = newPrize + ", " + prizesWon;	//add new prize to existing prizes
			return("prize won: "  + newPrize);			//display the new prize won
		}
	}


	/** 
	 * Returns the list of prizes won.
	 * pre: none
	 * post: The list of prizes is returned.
	 */
	public String showPrizes() {
	 	return(prizesWon);
	}

}



