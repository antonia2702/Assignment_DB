package dbAssignment.opti_home_shop;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "inquiry")
public class Inquiry {
	@Id
	@Column(name = "I_Id")
	private int I_Id;

	public int getI_Id() {
		return this.I_Id;
	}

	public void setI_Id(int value) {
		this.I_Id = value;
	}

	@Column
	private int CART_Id;

	public int getCART_Id() {
		return this.CART_Id;
	}

	public void setCART_Id(int value) {
		this.CART_Id = value;
	}

	@Column
	private String I_Description;

	public String getI_Description() {
		return this.I_Description;
	}

	public void setI_Description(String value) {
		this.I_Description = value;
	}

	@Column
	private java.sql.Timestamp I_CreateDate;

	public java.sql.Timestamp getI_CreateDate() {
		return this.I_CreateDate;
	}

	public void setI_CreateDate(java.sql.Timestamp value) {
		this.I_CreateDate = value;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CART_Id")
	private Cart cart;
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Inquiry(int I_Id_, int CART_Id_, String I_Description_, java.sql.Timestamp I_CreateDate_) {
		this.I_Id = I_Id_;
		this.CART_Id = CART_Id_;
		this.I_Description = I_Description_;
		this.I_CreateDate = I_CreateDate_;
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
