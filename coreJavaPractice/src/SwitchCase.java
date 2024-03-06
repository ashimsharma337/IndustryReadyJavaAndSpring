
public class SwitchCase {

	public static void main(String[] args) {
		
		String day = "Wednesday";
		
		switch(day) {
		
		case "Monday" :
			System.out.println("7 am");
			break;
		// case "Tuesday", "Wednesday", "Thursday" : // Multi-constant case labels with comma supported from Java 14 onwards only
		case "Tuesday" : case "Wednesday" : case "Thursday" :
			System.out.println("8 am");
			break;
		case "Friday" : 
			System.out.println("9 am");
		    break;
		case "Saturday" : case "Sunday" :
			System.out.println("Don't wake up!!");
		    break;
		default: 
			System.out.println("What day is it ?");
		}
		
		// Java 12 introduced arrow operators instead of using break keyword
//		switch (day) {
//        case "Monday"-> "Week day";
//        case "Tuesday"-> "Week day";
//        case "Wednesday"->"Week day";
//        case "Thursday"->"Week day";
//        case "Friday"->"Week day";
//        case "Saturday"-> "Weekend";
//        case "Sunday"-> "Weekend";
//        default->"Unknown";
		//};
		// The Evolution of Switch Statement From java 7 to Java 17
		// Link: https://medium.com/@javatechie/the-evolution-of-switch-statement-from-java-7-to-java-17-4b5eee8d29b7
       
	}

}
