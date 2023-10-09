// There are four things in method 

// ReturnType name (Parameter) { task/activity }

/* Method overloading(Compile time Polymorphism)
 * If there are multiple methods in a class with same name but different parameter is known as method overloading
 * Method that will be called will be resolve during the compile time 
 * Actually one method is doing only one task, so it is also known as false polymorphism 
 * 
 */

class Calc {
	
	void add() {
		int a = 10;
		int b = 20;
		int result = a+b;
		System.out.println("This is the result of method with zero param: "+result);
	}
    
	void add(int a, int b) {
		int result = a+b;
		System.out.println("This is the result of method with 2 int param: "+result);
	}
	
	void add(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("This is the result of method with 3 int param: "+result);
	}
	
	double add(double n1, float n2) {
		return n1+n2;
	}
	
	double add(double a , int b, int c) {
		return a+b+c;
	}
	
	
}

public class Method {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.add();
		c.add(2,3);
		c.add(2,3,4);
		double result = c.add(2.1f, 3.2f);
		System.out.println("Float and double param, and float argument gives double (Type casting) : "+result); // Type casting
	
		

	}

}
