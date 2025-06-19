package singletonPatternExample;

public class main {
	
	public static void main(String args[]) {
		Logger log1 = Logger.getInstance();
		log1.log("First message");
		
		
		Logger log2 = Logger.getInstance();
		log1.log("second message");
		
		if(log1 == log2) {
			System.out.println("Both the instances are same");
			
		}
		else {
			System.out.println("Instances are not same ");
		}
	}


}
