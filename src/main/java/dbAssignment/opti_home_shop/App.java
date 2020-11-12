package dbAssignment.opti_home_shop;

import java.util.Iterator;
import java.util.List;

public class App {
	public static void main(String[] args) {

		ShippingRepository a = new ShippingRepository();
		a.reconnectToDatabase();
		List<Shipping> articleGroupList = a.findAll();
		Iterator<Shipping> i1 = articleGroupList.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next().toString());
		}
		a.closeConnection();
	}
}
