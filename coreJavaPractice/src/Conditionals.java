
public class Conditionals {

	public static void main(String[] args) {
		
		  int age = 80;
		  
		  if( age >= 18 && age <= 60) {
		
          System.out.println("You're are eligible for  license application");
          
		  } 
		  else if(age > 60){
          
          System.out.println("You're are not eligible for  license application!! Your time is near becarefull!");
          
		  } else { 
			  
		  System.out.println("calm down kidoo!!!");
		  
		  }
		  
		  // We can write above code using ternary operator in shorter code but there is no readability
		  
		  int res = (10>20) ? 10+20 : 20-10;
		  System.out.println(res); // prints 10
		  
		  int a = 10;
		  int b = 20;
		  int c = 30;
		  
		  int result = (a>=b) ? a+b+c : c-a;
		  System.out.println(result); // prints 20
		  
		  int re = (a==b) ? (a>b?a+b : a-b) : (a<b?a+b : a-b); // prints 30
		  
		  boolean ab = false;
		  String r = (ab) ? "This is true" : "This is false"; 
		  String r1 = (!ab) ? "This is true" : "This is false";
		  System.out.println(r);      // prints this is false
		  System.out.println(r1);     // prints this is true
		  System.out.println(re);
	}

}
