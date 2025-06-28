package demo;

public class Calculator {
	public int Add(int i, int j) {
		return i+j;
	}
	 public int Subtract(int i, int j) {
		 return i>j ? i-j:j-i;
	 }
	 
	 public boolean isPositive(int i) {
		 if (i>0){
			 return true;
		 }
		 else {
			 return false;
		 }
		 
	 }
	 
	 public Integer nullableResult(boolean bool) {
		 if(bool) {
			 return null;
		 }
		 else return 0;
	 }
	 
	
}
