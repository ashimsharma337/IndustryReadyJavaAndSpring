import java.util.Scanner;

public class QuizService {
     
	int nums[] = new int[5]; // array of 5 integer
    Question questions[] = new Question[5]; // array of References
    int score = 0;

    public QuizService() {

        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");

    }

    public void playQuiz() {
    	
//    	System.out.println(questions[0].getTitle());
//    	
//    	System.out.print(questions[0].getOption1()+" ");
//    	System.out.print(questions[0].getOption2()+" ");
//    	System.out.print(questions[0].getOption3()+" ");
//    	System.out.print(questions[0].getOption4()+" ");
//    	
//    	System.out.println("");
//    	Scanner scan = new Scanner(System.in);
//    	String ans = scan.next();
//    	String correctAnswer = questions[0].getAnswer();
//    	
//    	if(correctAnswer.equals(ans)) {
//    		score =+ 2;
//    	}  else {
//    		score =- 1;
//    	}
//    	
//    	System.out.println("Your score is "+ score);
//    	
//    	for(Question q : questions) {
//    		System.out.println(q.getTitle());
//    	}
    	System.out.println("Welcome to Quiz app!");
    	for(int i = 0; i < questions.length; i++) {
    		
    		System.out.println(questions[i].getTitle());

    		System.out.print(questions[i].getOption1()+" ");
       	    System.out.print(questions[i].getOption2()+" ");
        	System.out.print(questions[i].getOption3()+" ");        	
        	System.out.print(questions[i].getOption4()+" ");
    		
        	System.out.println("");
        	Scanner scan = new Scanner(System.in);
        	String ans = scan.next();
        	String correctAnswer = questions[0].getAnswer();
        	
        	if(correctAnswer.equals(ans)) {
        		score =+ 2;
        	}  else {
        		score--;
        	}
    		
    	}
    	
    	System.out.println("Your score is "+ score);
    }
}
