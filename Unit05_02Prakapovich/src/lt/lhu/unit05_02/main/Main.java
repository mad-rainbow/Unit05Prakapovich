package lt.lhu.unit05_02.main;

import lt.lhu.unit05_02.bean.Customer;
import lt.lhu.unit05_02.bean.CustomersList;
import lt.lhu.unit05_02.logic.CustomerLogic;
import lt.lhu.unit05_02.view.CustomersView;

public class Main {

	public static void main(String[] args) {
		String[] s1 = {"613096648", "Victor", "Ervin", "Wafiya", "4454 Koontz Lane, Los Angeles, CA", "5303011593411200", "US335200858227450465" };
		String[] s2 = {"008860958", "Arsenios", "Turid", "Nikolay", "4062 Duff Avenue, Mondovi, WI", "4539680758061361", "US335177438259484721"};
		String[] s3 = {"468483569", "Winnifred", "Gabriele", "Anzhela", "4703 Brighton Circle Road, Winsted, MN", "5465194995267273", "US335404362054509083"};
		String[] s4 = {"569412154", "Julia", "Shamash", "Eugraphios", "605 Middleville Road, Los Angeles, CA", "5105450110395266", "US335405109897873989"};
		String[] s5 = {"170509485", "Laelia", "Ervin", "Vilhjlmur", "3265 Harley Brook Lane, Johnsonville, SC", "4916749964110990", "US335369909964363010"};
		
		
		Customer c1 = new Customer(s1);
		Customer c2 = new Customer(s2);
		Customer c3 = new Customer(s3);
		Customer c4 = new Customer(s4);
		Customer c5 = new Customer(s5);
		
		CustomersList customers = new CustomersList();		
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);
		
		
		CustomersView.view(CustomerLogic.sortByName(customers));
	
		System.out.println("==================================================");
		CustomersView.view(CustomerLogic.cardSearch(customers, 4539680758061360L, 5105450110395270L));

		
		
		
		

	}

}
