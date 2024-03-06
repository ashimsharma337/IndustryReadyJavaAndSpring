
public class Operator {

	public static void main(String[] args) {
		// post and pre increment/decrement
//		int a=5;
//		int b;
//		++a;
//		System.out.println(a); // prints 6
//		b=++a;                 // prints 6
//		b=a++;                 // prints 5
		
//		b=a--;                 // prints 5 where a is 4
		
//		System.out.println(a);
//		System.out.println(b);
		
		// Arithmetic operators 
		// 10 + 2 = 12;
		// 10 - 2 = 8;
		// 10 * 2 = 20;
		// 10 / 2 = 5;
		// 10 % 2 = 0; modulus operator gives remainder 
		// 8 % 10 = 8; when denominator is greater than numerator result is numerator
		// -8 % 10 = -8; same as above sign will remain as it is 
		
		// Assignment operator
		// int age = 18;
		// compound assignment operator 
		// +=, -=, *=, /=
		// age = age + 1;
		// age = ++age;
		// age +=18; // results 36
		
		// Logical operator 
		// AND -- &&       // if all condition is true gives true
		// OR  -- ||       // if one of the value is true gives true
		// NOT -- !        !True = false and !False = true
		
		// Relational Operator 
		// < less than 
		// > greater than 
		// <= less than or equal to 
		// >= greater than or equal to 
		// == equal to (only for primitive type)
		
		// Ternary Operator 
		// ?: condition ? true : false
		
		
		int a = 18;
		int b = 20;
		int c = 18;
		
		System.out.println(a<b);///true
		
		boolean res = (a<b) && (a>b) && (a==c);
		System.out.println(res); // gives false because one condition is false
		
		boolean res1 = (a<b) || (a>b) || (a==c);
		System.out.println(res1); // gives true because some conditions are true
	} 
}
