
public class LaunchApp {

	public static void main(String[] args) {
		
		Amazon a = new Amazon();
		//FedEx ex=new FedEx();
		//a.setService(new FedEx());//setter injection
		//a.setService(new Ups());
		a.setService(new Dhl());
		
		boolean status = a.initateDelivery(5768.4);
		if(status)
			System.out.println("Order delivered successfully");
		else 
			System.out.println("Failed to deliver");
	}

}
