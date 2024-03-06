
public class TypeCasting {

	public static void main(String[] args) {
		
		// changing data from one  type to another is Typecasting
        
		// Widening Casting (automatically or implicit typecasting or numeric type promotion)
		// byte-->short-->int-->long-->float-->double    char
		//  1by    2by    4by    8by    4by     8by       2by
		
		// concept: whatever we have in a glass can fit in bucket but not vice versa
		
		// Narrowing Casting(manually or explicit type casting from upper to low loss of data)
		// double-->float-->long-->int-->char-->short-->byte 
		
		
		int num = 9;
		double dbl = num; // automatic typecasting: int to double 
		
		System.out.println(num);     // prints 9
		System.out.println(dbl);     // prints 9.0
		
		// Manual 
		
		double dbl1 = 9.78d;
		int num1 = (int)dbl1; // manual casting double to int 
		System.out.println(dbl1);   // prints 9.78
		System.out.println(num1);   // prints 9
		
	}  

}
