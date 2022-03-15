
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit[] credits = {new CarCredit(), new OfficerCredit(), new NeedCredit()};
		
		Customer customer = new Customer(1, "Ali Yolalan");
		
		CustomerManager customerManager = new CustomerManager(customer, credits);
		customerManager.add(1, 50000);
	}

}
