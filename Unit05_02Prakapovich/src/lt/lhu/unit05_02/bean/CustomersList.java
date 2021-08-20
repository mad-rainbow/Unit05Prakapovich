package lt.lhu.unit05_02.bean;

import java.util.ArrayList;
import java.util.List;

public class CustomersList {
	private List<Customer> customers;

	public CustomersList() {
		customers = new ArrayList<Customer>();
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public Customer getCustomer(int i) {
		return customers.get(i);
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public void add(Customer c) {
		customers.add(c);
	}

	public int size() {
		return customers.size();
	}

	public void setCustomer(int i, Customer s) {
		this.customers.set(i, s);

	}
}
