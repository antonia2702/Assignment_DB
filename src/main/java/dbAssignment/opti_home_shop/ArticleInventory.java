package dbAssignment.opti_home_shop;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "articleinventory")

public class ArticleInventory {
	@Id
	@Column(name = "AI_Id")
	private int AI_Id;

	public int getAI_Id() {
		return this.AI_Id;
	}

	public void setAI_Id(int value) {
		this.AI_Id = value;
	}

	@Column
	private int AI_Quantity;

	public int getAI_Quantity() {
		return this.AI_Quantity;
	}

	public void setAI_Quantity(int value) {
		this.AI_Quantity = value;
	}

	@Column
	private java.sql.Timestamp AI_CreateDate;

	public java.sql.Timestamp getAI_CreateDate() {
		return this.AI_CreateDate;
	}

	public void setAI_CreateDate(java.sql.Timestamp value) {
		this.AI_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp AI_UpdateDate;

	public java.sql.Timestamp getAI_UpdateDate() {
		return this.AI_UpdateDate;
	}

	public void setAI_UpdateDate(java.sql.Timestamp value) {
		this.AI_UpdateDate = value;
	}

	public ArticleInventory(int AI_Id_, int AI_Quantity_, java.sql.Timestamp AI_CreateDate_,
			java.sql.Timestamp AI_UpdateDate_) {
		this.AI_Id = AI_Id_;
		this.AI_Quantity = AI_Quantity_;
		this.AI_CreateDate = AI_CreateDate_;
		this.AI_UpdateDate = AI_UpdateDate_;
	}
}
