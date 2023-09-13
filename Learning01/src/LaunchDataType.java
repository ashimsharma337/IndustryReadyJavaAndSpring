
public class LaunchDataType {

	public static void main(String[] args) {
	    
		// Primitive Types(eight type) and Class/Object/Array type
		// char for character 2by
		char ch = 'a';  // single quote
		System.out.println(ch);
		
		ch++;
		System.out.println(ch); // prints b character can be increment/decrement 
		
		char b = 65;
		System.out.println(b);  // prints A corresponding decimal for A is 65 
		
		// ASCII format (128) before but nowadays many most of the program follows UNICODE(68836) format
		
		// For whole number there are 
		// byte, short, int, long 
		// 1 by   2by    4by  8by
		// long has l in the end (suffix l is needed)
		// default datatype of whole number is int 
		
		// For floating points there are 
		// double and float
		// 8by         4by
		// double has double precision upto 14 digit after decimal (default and more precise)
		// float has single precision upto 7 digit after decimal (suffix f is needed after decimal)
		
		// boolean types (either true or false)
		// mostly use in conditional and relational operator
		
		// while creating variable numbers are not allowed it is allowed only after character
		// int 12age; not allowed
		// int 12;    not allowed 
		// int n12;   allowed 
		
		// only two special character is allowed only "-" and "$" no other special character
		// for integer literals only "-" is allowed but it has to be inbetween 
		// int marks = 10_000; only inbetween not before or after can also be used after decimal inbetween

	}

}
