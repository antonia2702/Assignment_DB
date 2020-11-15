package dbAssignment.opti_home_shop.data.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@javax.persistence.Entity
@Table(name = "cart")
public class Cart {
	@Id
	@Column(name = "CART_Id")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CART_Id;

	public int getCART_Id() {
		return this.CART_Id;
	}

	@Column
	@NotNull
	private int CART_Quantity;

	public int getCART_Quantity() {
		return this.CART_Quantity;
	}

	public void setCART_Quantity(int value) {
		this.CART_Quantity = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp CART_CreateDate;

	public java.sql.Timestamp getCART_CreateDate() {
		return this.CART_CreateDate;
	}

	@Column
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp CART_UpdateDate;

	public java.sql.Timestamp getCART_UpdateDate() {
		return this.CART_UpdateDate;
	}

	@OneToMany(mappedBy = "cart", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<OrderTable> ordertables;

	public List<OrderTable> getOrdertables() {
		return ordertables;
	}

	public void setOrdertables(List<OrderTable> ordertables) {
		this.ordertables = ordertables;
	}

	@OneToMany(mappedBy = "cart", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Inquiry> inquiries;

	public List<Inquiry> getInquiries() {
		return inquiries;
	}

	public void setInquiries(List<Inquiry> inquiries) {
		this.inquiries = inquiries;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "A_Id")
	@NotNull
	private Article article;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "CA_Id")
	@NotNull
	private Customeraccount customeraccount;

	public Customeraccount getCustomeraccount() {
		return customeraccount;
	}

	public void setCustomeraccount(Customeraccount customeraccount) {
		this.customeraccount = customeraccount;
	}

	public Cart(int CART_Quantity_, Article article, Customeraccount customeraccount) {
		this.CART_Quantity = CART_Quantity_;
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
