package Carnival;
public class Carnival {

	public static void main(String[] args) {
		Gamebooth balloonDartToss = new Gamebooth(2,"tiger plush", "sticker");
		Gamebooth ringToss = new Gamebooth(2,"bear keychain", "pencil");
		Gamebooth breakAPlate = new Gamebooth(1.5, "pig plush", "plastic dinosaur");
		Player shonda = new Player(5);
		Player luis = new Player(3);
				
		System.out.print("Shonda goes to Balloon Dart Toss. ");
		System.out.println(shonda.play(balloonDartToss));
		
		System.out.print("Luis goes to Ring Toss. ");
		System.out.println(luis.play(ringToss));
		
		System.out.print("Shonda goes to Ring Toss. ");
		System.out.println(shonda.play(ringToss));
		
		System.out.print("Luis goes to Break A Plate. ");
		System.out.println(luis.play(breakAPlate));
		
		System.out.println("Shonda won: " + shonda.showPrizes());
		System.out.println("Luis won: " + luis.showPrizes());
		System.out.println(shonda);
		System.out.println(luis);
		System.out.println(luis.toString());
		System.out.println(shonda.toString());
		System.out.println("Total prizes won in ballon dart toss are " +balloonDartToss.firstPrizesAwarded());
		System.out.println("Total prizes won in ring toss toss are " +ringToss.firstPrizesAwarded());
		System.out.println("Total prizes won in break a plate are " +breakAPlate.firstPrizesAwarded());
		System.out.println("Total consilation prizes won in ballon dart toss are " +balloonDartToss.conPrizesAwarded());
		System.out.println("Total consilation prizes won in ring toss are " +ringToss.conPrizesAwarded());
		System.out.println("Total consilation prizes won in break a plate are " +breakAPlate.conPrizesAwarded());
	}
}
