
//Target class
public class Amazon {
	
	private DeliveryService service;

	
	
    public void setService(DeliveryService service) {
		this.service = service;
	}



	public boolean initateDelivery(double amount) {
		   
		return service.courierService(amount);
	}
}
