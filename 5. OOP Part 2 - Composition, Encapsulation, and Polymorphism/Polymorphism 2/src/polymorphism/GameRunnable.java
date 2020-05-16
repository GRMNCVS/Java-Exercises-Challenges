package polymorphism;

import java.util.Scanner;

public class GameRunnable {
	private PlatformProvider platformProvider;
//	private Platform platform;
	private Pc myPC;

	
	public GameRunnable(Game game1) throws Exception {
		platformProvider = new PlatformProvider();
		PlatformCompatibility platformCompatibility = game1.getPlatformCompatibility();
		Platform platform = platformProvider.providePlatform(platformCompatibility);//upcast from child to parent
		runGameOnPlatform(platform);
	}
	
	private void runGameOnPlatform(Platform platform) {
		platform.launch();
	}

}
