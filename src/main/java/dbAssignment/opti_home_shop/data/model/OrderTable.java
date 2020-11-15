package dbAssignment.opti_home_shop.data.model;

import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

@javax.persistence.Entity
@Table(name = "ordertable")
public class OrderTable {
	@Id
	@Column(name = "OT_Id")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OT_Id;

	public int getOT_Id() {
		return this.OT_Id;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp O_CreateDate;

	public java.sql.Timestamp getO_CreateDate() {
		return this.O_CreateDate;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "CART_Id")
	@NotNull
	private Cart cart;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "SHIP_Id")
	@NotNull
	private Shipping shipping;

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public OrderTable(Cart cart, Shipping shipping) {
		this.shipping = shipping;
		this.cart = cart;
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
