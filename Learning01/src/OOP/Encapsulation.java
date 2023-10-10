/* Binding of data and methods together is encapsulation 
 * While creating classes it is good practice to make variable private, and create getter and setter method to access them
 * 
 * Binding data member, instance variable, field to the getter & setter method is encapsulation
 * It also provide security, and prevent direct access.
 */

package OOP;

class Car {
	private String name;
	private String make;
	private int price;
	
	/*
	 * We can use these three things to avoid long getters and setters
	 * 1. lombok 
	 * 2. record 
	 * 3. Kotlin
	 */
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;             // if name is same shadowing problem occur which is resolved by this keyword
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
	
		Car c1 = new Car();
		c1.setName("Toyota");       // We can also set values using constructor
		c1.setMake("Camry");
		c1.setPrice(1000000);
		
		System.out.println("The current car is "+c1.getName()+" and model is "+c1.getMake()+" Price is: "+"$ "+c1.getPrice());
		
		

	}

}
