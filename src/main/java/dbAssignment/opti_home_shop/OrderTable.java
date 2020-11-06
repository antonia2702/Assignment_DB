package dbAssignment.opti_home_shop;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "ordertable")
public class OrderTable {
	@Id
	@Column(name = "OT_Id")
	private int OT_Id;

	public int getOT_Id() {
		return this.OT_Id;
	}

	public void setOT_Id(int value) {
		this.OT_Id = value;
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
	private int SHIP_Id;

	public int getSHIP_Id() {
		return this.SHIP_Id;
	}

	public void setSHIP_Id(int value) {
		this.SHIP_Id = value;
	}

	@Column
	private java.sql.Timestamp O_CreateDate;

	public java.sql.Timestamp getO_CreateDate() {
		return this.O_CreateDate;
	}

	public void setO_CreateDate(java.sql.Timestamp value) {
		this.O_CreateDate = value;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CART_Id")
	private Cart cart;
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="SHIP_Id")
	private Shipping shipping;

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public OrderTable(int OT_Id_, int CART_Id_, int SHIP_Id_, java.sql.Timestamp O_CreateDate_) {
		this.OT_Id = OT_Id_;
		this.CART_Id = CART_Id_;
		this.SHIP_Id = SHIP_Id_;
		this.O_CreateDate = O_CreateDate_;
	}
	
	public OrderTable() {
		
	}
	
	@Override
	public String toString() {
		return "" + OT_Id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		OrderTable orderTable = (OrderTable) o;
		return Objects.equals(OT_Id, orderTable.OT_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(OT_Id);
	}
}
