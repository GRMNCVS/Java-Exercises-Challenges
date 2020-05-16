package polymorphism;

public class PlatformProvider {
	public static final Platform  pc = new Pc();
	public static final Platform  xbox = new Xbox();
	public static final Platform  ps = new Ps();
	public static final Platform Xbox360 = new Xbox360();
	
	public Platform providePlatform(PlatformCompatibility gamePlatformCompatibility) throws Exception {
		switch(gamePlatformCompatibility) {
			case PC:
				return pc;
			case XBOX:
				return xbox;
			case PS:
				return ps;
			case Xbox360:
				return Xbox360;
			default:
                throw new Exception("Unknown Platform");
		}
	}
}
