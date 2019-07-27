package demo;

public class HelloWord {
	
	// Where CPU reads our code 
	public static void main(String[] args) {
		for(int i = 0; i < 30; i++) {
			System.out.println(i);
			pause(1);
			sayWhat();
		}
	}
	
	
	// Method that pauses entire program for specified second
	public static void pause(int second) {
		try {
			Thread.sleep(second * 2000);
			System.out.println("Pausing rightn ow...");
			System.out.println("\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// what to say
	public static void sayWhat() {
		System.out.println("WHAAAAAT");
	}
}
