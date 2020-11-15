package dbAssignment.opti_home_shop.data.repository;

import dbAssignment.opti_home_shop.data.model.OrderTable;

public class OrderTableRepository extends GenericRep<OrderTable, Integer> {

	public OrderTableRepository() {
		super(OrderTable.class);
	}

}
