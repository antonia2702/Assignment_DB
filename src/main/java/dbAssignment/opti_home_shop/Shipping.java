package dbAssignment.opti_home_shop;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "shipping")
public class Shipping {
	@Id
	@Column(name = "SHIP_Id")
	private int SHIP_Id;

	public int getSHIP_Id() {
		return this.SHIP_Id;
	}

	public void setSHIP_Id(int value) {
		this.SHIP_Id = value;
	}

	@Column
	private float SHIP_Costs;

	public float getSHIP_Costs() {
		return this.SHIP_Costs;
	}

	public void setSHIP_Costs(float value) {
		this.SHIP_Costs = value;
	}

	@Column
	private java.sql.Timestamp SHIP_CreateDate;

	public java.sql.Timestamp getSHIP_CreateDate() {
		return this.SHIP_CreateDate;
	}

	public void setSHIP_CreateDate(java.sql.Timestamp value) {
		this.SHIP_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp SHIP_UpdateDate;

	public java.sql.Timestamp getSHIP_UpdateDate() {
		return this.SHIP_UpdateDate;
	}

	public void setSHIP_UpdateDate(java.sql.Timestamp value) {
		this.SHIP_UpdateDate = value;
	}

	public Shipping(int SHIP_Id_, float SHIP_Costs_, java.sql.Timestamp SHIP_CreateDate_,
			java.sql.Timestamp SHIP_UpdateDate_) {
		this.SHIP_Id = SHIP_Id_;
		this.SHIP_Costs = SHIP_Costs_;
		this.SHIP_CreateDate = SHIP_CreateDate_;
		this.SHIP_UpdateDate = SHIP_UpdateDate_;
	}
}
