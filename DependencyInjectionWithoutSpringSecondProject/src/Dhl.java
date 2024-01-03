
public class Dhl implements DeliveryService{

	@Override
	public boolean courierService(double amount) {
		
		System.out.println("Courier delivered through DHL and amount paid is " +amount);
		return true;
	}

}
