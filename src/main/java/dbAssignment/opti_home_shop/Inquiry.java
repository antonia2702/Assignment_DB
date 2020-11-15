package dbAssignment.opti_home_shop;

import java.util.Objects;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@javax.persistence.Entity
@Table(name = "inquiry")
public class Inquiry {
	@Id
	@Column(name = "I_Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int I_Id;

	public int getI_Id() {
		return this.I_Id;
	}

	public void setI_Id(int value) {
		this.I_Id = value;
	}

	@Column(nullable = false)
	private String I_Description;

	public String getI_Description() {
		return this.I_Description;
	}

	public void setI_Description(String value) {
		this.I_Description = value;
	}

	@CreationTimestamp
	@Column(nullable = false)
	private java.sql.Timestamp I_CreateDate;

	public java.sql.Timestamp getI_CreateDate() {
		return this.I_CreateDate;
	}

	public void setI_CreateDate(java.sql.Timestamp value) {
		this.I_CreateDate = value;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "CART_Id", nullable = false)
	private Cart cart;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Inquiry(String I_Description_, Cart cart) {
		this.I_Description = I_Description_;
		this.cart = cart;
	}

	public Inquiry() {

	}

	@Override
	public String toString() {
		return I_Description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Inquiry inquiry = (Inquiry) o;
		return Objects.equals(I_Id, inquiry.I_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(I_Id, I_Description, I_CreateDate);
	}
}
