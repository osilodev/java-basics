class Robot {
	public void speak (String text) {
		System.out.println(text);
	}
	
	public void jump (int height) {
		System.out.println("Jumping: " + height);
	}
	
	public void move (String direction, int distance) {
		System.out.println("Moving " + distance + " metres in direction " + direction);
	}
}

public class Application {

	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi, i am  Sam");
		sam.jump(7);
		sam.move("North West", 200);
	}

}
