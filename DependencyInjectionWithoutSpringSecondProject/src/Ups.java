
public class Ups implements DeliveryService{

	@Override
	public boolean courierService(double amount) {

        System.out.println("Courier delivered through UPS and amount paid is " +amount);
		return true;
	}

}
