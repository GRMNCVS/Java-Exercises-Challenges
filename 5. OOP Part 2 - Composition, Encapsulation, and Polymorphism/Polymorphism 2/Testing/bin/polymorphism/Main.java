package polymorphism;

public class Main {

	public static void main(String[] args) throws Exception {
		Game AssasinsCreed = new Game("AssasinsCreed", PlatformCompatibility.PS);
		GameRunnable gameRunnable = new GameRunnable(AssasinsCreed);

		Game PrinceOfPersia = new Game(" PrinceOfPersia", PlatformCompatibility.Xbox360);
		GameRunnable coolGame = new GameRunnable(PrinceOfPersia);



	}
}
