package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
}


public class LoopsVsStreams {
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("John", 25));
		people.add(new Person("Santo", 17));
		people.add(new Person("Daniel", 16));
		people.add(new Person("David", 20));
		people.add(new Person("Michael", 23));
		
		
		List<String> adultNamesInUpperCase = new ArrayList<>();
		
		// With loop
		for(Person person : people) {
			if(person.getAge() >= 18) {
				String upperCaseName = person.getName().toUpperCase();
				adultNamesInUpperCase.add(upperCaseName);
			}
		}
		
		for(String name : adultNamesInUpperCase) {
			System.out.println("Using loop ==> "+name);
		}
		
		// With Streams (functional style)
		adultNamesInUpperCase = people.stream()
				.filter(person -> person.getAge() >= 18)
				.map(person -> person.getName().toUpperCase())
				.collect(Collectors.toList());
		adultNamesInUpperCase.forEach(name -> System.out.println("Using Stream ==> "+name));
		
		//Using method reference 
		adultNamesInUpperCase.forEach(System.out::println);
		

	}

}
