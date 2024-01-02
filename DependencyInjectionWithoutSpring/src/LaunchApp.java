
public class LaunchApp {

	public static void main(String[] args) {
	
       GreetingsGenerator greet = new GreetingsGenerator();
       System.out.println("Target Object before injecting dependent Object =>"+ greet);
       
       java.util.Date date = new java.util.Date(); 
       System.out.println("Dependent Obj =>"+ date);
       
       greet.setDate(date);//Setter injection
       
       System.out.println("Target Object after injecting dependent Object =>"+ greet);
       
       String message = greet.generateGreeting("Ashim");
       System.out.println(message);
       
	}

}
