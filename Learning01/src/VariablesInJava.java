
class Demo {
		
		int a;             // instance variable
		int b; 
		double c;
		static String text = "I am static variable..";   // static variable
		
		void display() {
			a = 30;
			b = 20;
			System.out.println("The value of a is : "+ a);
		}
}

class Demo1 {
	
	void display() {
		int a = 10;
		int b = 20;
		System.out.println("The value of a in Demo1 is : "+a);
	}
	
	void displayLocal(int a, int b) {
		int result = a + b;          // Here a and b is local variable
		System.out.println("Result is : " + result);
	}
}



public class VariablesInJava {

	public static void main(String[] args) {
    
	     Demo d = new Demo();
	     d.display();
	     Demo1 d1 = new Demo1();
	     d1.display();
	     d1.displayLocal(5, 4);
	     
         System.out.println(Demo.text);   // No need to create object for static variable it is class level
	}                                     // It is loaded during classloading time

}

/*
 * Object ===> Instance

Object Creation ==== Instantiation

Create an Object ==> Create an Instance


Object ==> Memory is allocated in Heap area


Instance Variable == Object variable == fields ==Properties


==> Instance variable are declared directly within a class.
==> Instance variable memory will be allocated on heap area within an Object/Instance.
==> JVM would allocate default values to instance variables.(0 for int, null for string e.t.c)
==>Instance variable memory would be  deallocated after object becomes referenceless and GC collects the object
==> Instance variable can be accessed anywhere within a class its declared.

==>Local variable declared within a method or block or loop.
==>Default values are not initialized for local variable.
==> Local variables cannot be used without initialization.
==>Memory will be allocated within stack area.
==>After finishing method local variable will be destroyed.
==>Local variable can-not be used outside the block.
 * 
 * */
