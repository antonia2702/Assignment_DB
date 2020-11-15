package dbAssignment.opti_home_shop.data.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@javax.persistence.Entity
@Table(name = "shipping")
public class Shipping {
	@Id
	@Column(name = "SHIP_Id")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SHIP_Id;

	public int getSHIP_Id() {
		return this.SHIP_Id;
	}

	@Column
	@NotNull
	private float SHIP_Costs;

	public float getSHIP_Costs() {
		return this.SHIP_Costs;
	}

	public void setSHIP_Costs(float value) {
		this.SHIP_Costs = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp SHIP_CreateDate;

	public java.sql.Timestamp getSHIP_CreateDate() {
		return this.SHIP_CreateDate;
	}

	@Column
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp SHIP_UpdateDate;

	public java.sql.Timestamp getSHIP_UpdateDate() {
		return this.SHIP_UpdateDate;
	}

	@OneToMany(mappedBy = "shipping", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<OrderTable> orderTables;

	public List<OrderTable> getOrderTables() {
		return orderTables;
	}

	public void setOrderTables(List<OrderTable> orderTables) {
		this.orderTables = orderTables;
	}

	public Shipping(float SHIP_Costs_) {
		this.SHIP_Costs = SHIP_Costs_;
	}

	public Shipping() {

	}

	@Override
	public String toString() {
		return "" + SHIP_Costs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Shipping shipping = (Shipping) o;
		return Objects.equals(SHIP_Id, shipping.SHIP_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(SHIP_Id, SHIP_Costs, SHIP_CreateDate, SHIP_UpdateDate);
	}
}
