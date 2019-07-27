package demo;

public class HelloWord {
	
	// Where CPU reads our code 
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			pause(1);
		}
	}
	
	
	// Method that pauses entire program for specified second
	public static void pause(int second) {
		try {
			Thread.sleep(second * 1000); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		// some comment here
	}
}
