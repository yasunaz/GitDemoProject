package demo;

public class HelloWord {
	
	// Where CPU reads our code 
	public static void main(String[] args) {
		System.out.println("Hello Students!");
	}
	
	
	// Method that pauses entire program for specified second
	public static void pause(int second) {
		try {
			Thread.sleep(second * 1000); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
