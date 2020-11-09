package dbAssignment.opti_home_shop;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "cart")
public class Cart {
	@Id
	@Column(name = "CART_Id")
	private int CART_Id;

	public int getCART_Id() {
		return this.CART_Id;
	}

	public void setCART_Id(int value) {
		this.CART_Id = value;
	}

	@Column (insertable = false, updatable = false)
	private int CA_Id;

	public int getCA_Id() {
		return this.CA_Id;
	}

	public void setCA_Id(int value) {
		this.CA_Id = value;
	}

	@Column (insertable = false, updatable = false)
	private int A_Id;

	public int getA_Id() {
		return this.A_Id;
	}

	public void setA_Id(int value) {
		this.A_Id = value;
	}

	@Column
	private int CART_Quantity;

	public int getCART_Quantity() {
		return this.CART_Quantity;
	}

	public void setCART_Quantity(int value) {
		this.CART_Quantity = value;
	}

	@Column
	private java.sql.Timestamp CART_CreateDate;

	public java.sql.Timestamp getCART_CreateDate() {
		return this.CART_CreateDate;
	}

	public void setCART_CreateDate(java.sql.Timestamp value) {
		this.CART_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp CART_UpdateDate;

	public java.sql.Timestamp getCART_UpdateDate() {
		return this.CART_UpdateDate;
	}

	public void setCART_UpdateDate(java.sql.Timestamp value) {
		this.CART_UpdateDate = value;
	}

	@OneToMany(mappedBy = "cart")
	private List<OrderTable> ordertables;

	public List<OrderTable> getOrdertables() {
		return ordertables;
	}

	public void setOrdertables(List<OrderTable> ordertables) {
		this.ordertables = ordertables;
	}

	@OneToMany(mappedBy = "cart")
	private List<Inquiry> inquiries;

	public List<Inquiry> getInquiries() {
		return inquiries;
	}

	public void setInquiries(List<Inquiry> inquiries) {
		this.inquiries = inquiries;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "A_Id")
	private Article article;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CA_Id")
	private Customeraccount customeraccount;

	public Customeraccount getCustomeraccount() {
		return customeraccount;
	}

	public void setCustomeraccount(Customeraccount customeraccount) {
		this.customeraccount = customeraccount;
	}

	public Cart(int CART_Id_, int CA_Id_, int A_Id_, int CART_Quantity_, java.sql.Timestamp CART_CreateDate_,
			java.sql.Timestamp CART_UpdateDate_, Article article, Customeraccount customeraccount) {
		this.CART_Id = CART_Id_;
		this.CA_Id = CA_Id_;
		this.A_Id = A_Id_;
		this.CART_Quantity = CART_Quantity_;
		this.CART_CreateDate = CART_CreateDate_;
		this.CART_UpdateDate = CART_UpdateDate_;
		this.article = article;
		this.customeraccount = customeraccount;
	}

	public Cart() {
	}

	@Override
	public String toString() {
		return "" + CART_Quantity;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Cart cart = (Cart) o;
		return Objects.equals(CART_Id, cart.CART_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(CART_Id, CART_Quantity, CART_CreateDate, CART_UpdateDate);
	}
}
