package lt.lhu.unit05_02.logic;

import java.util.ArrayList;

import java.util.List;
import lt.lhu.unit05_02.bean.*;

public class CustomerLogic {

	public static CustomersList sortByName(CustomersList customers) {

		for (int i = 0; i < customers.size() - 1; i++) {
			String min = customers.getCustomer(i).getName();
			int pos = i;

			for (int j = i + 1; j < customers.size(); j++) {
				String current = customers.getCustomer(j).getName();
				if (min.compareTo(current) > 0) {
					min = current;
					pos = j;
				} else if (min.compareTo(current) == 0) {
					String minSurname = customers.getCustomer(pos).getSurname();
					String currentSurname = customers.getCustomer(j).getSurname();

					if (minSurname.compareTo(currentSurname) > 0) {
						Customer temp = customers.getCustomer(pos);
						customers.setCustomer(pos, customers.getCustomer(j));
						customers.setCustomer(j, temp);
					}
				}
			}
			Customer temp = customers.getCustomer(pos);
			customers.setCustomer(pos, customers.getCustomer(i));
			customers.setCustomer(i, temp);
		}
		return customers;
	}

	public static CustomersList cardSearch(CustomersList customers, long query1, long query2) {
		CustomersList result = new CustomersList();
		List<Long> cards = new ArrayList<Long>();
		Customer c = new Customer();

		for (int i = 0; i < customers.size(); i++) {
			c = customers.getCustomer(i);
			if (Long.parseLong(c.getCreditCard()) > query1 && Long.parseLong(c.getCreditCard()) < query2) {
				cards.add(Long.parseLong(c.getCreditCard()));
			}
		}

		Long card;

		for (int i = 0; i < cards.size(); i++) {
			card = cards.get(i);
			for (int t = 0; t < customers.size(); t++) {
				c = customers.getCustomer(t);
				if (c.getCreditCard().equals(Long.toString(card))) {
					result.add(c);
				}
			}
		}

		return result;
	}

}