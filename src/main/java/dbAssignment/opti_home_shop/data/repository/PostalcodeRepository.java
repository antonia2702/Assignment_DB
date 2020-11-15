package dbAssignment.opti_home_shop.data.repository;

import dbAssignment.opti_home_shop.data.model.Postalcode;

public class PostalcodeRepository extends GenericRep<Postalcode, Integer> {

	public PostalcodeRepository() {
		super(Postalcode.class);
	}

}