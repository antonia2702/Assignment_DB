package dbAssignment.opti_home_shop.data.repository;

import dbAssignment.opti_home_shop.data.model.Inquiry;

public class InquiryRepository extends GenericRep<Inquiry, Integer> {

	public InquiryRepository() {
		super(Inquiry.class);
	}

}