package lt.lhu.unit05_02.view;

import lt.lhu.unit05_02.bean.Customer;
import lt.lhu.unit05_02.bean.CustomersList;

public class CustomersView {
	public static void view(CustomersList customers) {

		Customer c = new Customer();

		for (int i = 0; i < customers.size(); i++) {
			c = customers.getCustomer(i);
			System.out.println("ID: " + c.getId());
			System.out.println("Name: " + c.getName());
			System.out.println("Surname: " + c.getSurname());
			System.out.println("Middle name: " + c.getMiddleName());
			System.out.println("Address: " + c.getaddress());
			System.out.println("Credit card number: " + c.getCreditCard());
			System.out.println("Bank account number: " + c.getAccNumber());
			System.out.println("__________________________________________________");
		}

	}

}
