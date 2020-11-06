package dbAssignment.opti_home_shop;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "articlerating")
public class ArticleRating {
	@Id
	@Column(name = "AR_Id")
	private int AR_Id;

	public int getAR_Id() {
		return this.AR_Id;
	}

	public void setAR_Id(int value) {
		this.AR_Id = value;
	}

	@Column
	private int CA_Id;

	public int getCA_Id() {
		return this.CA_Id;
	}

	public void setCA_Id(int value) {
		this.CA_Id = value;
	}

	@Column
	private int A_Id;

	public int getA_Id() {
		return this.A_Id;
	}

	public void setA_Id(int value) {
		this.A_Id = value;
	}

	@Column
	private String AR_Describtion;

	public String getAR_Describtion() {
		return this.AR_Describtion;
	}

	public void setAR_Describtion(String value) {
		this.AR_Describtion = value;
	}

	@Column
	private byte AR_Rating;

	public byte getAR_Rating() {
		return this.AR_Rating;
	}

	public void setAR_Rating(byte value) {
		this.AR_Rating = value;
	}

	@Column
	private java.sql.Timestamp AR_CreateDate;

	public java.sql.Timestamp getAR_CreateDate() {
		return this.AR_CreateDate;
	}

	public void setAR_CreateDate(java.sql.Timestamp value) {
		this.AR_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp AR_UpdateDate;

	public java.sql.Timestamp getAR_UpdateDate() {
		return this.AR_UpdateDate;
	}

	public void setAR_UpdateDate(java.sql.Timestamp value) {
		this.AR_UpdateDate = value;
	}

	public ArticleRating(int AR_Id_, int CA_Id_, int A_Id_, String AR_Describtion_, byte AR_Rating_,
			java.sql.Timestamp AR_CreateDate_, java.sql.Timestamp AR_UpdateDate_) {
		this.AR_Id = AR_Id_;
		this.CA_Id = CA_Id_;
		this.A_Id = A_Id_;
		this.AR_Describtion = AR_Describtion_;
		this.AR_Rating = AR_Rating_;
		this.AR_CreateDate = AR_CreateDate_;
		this.AR_UpdateDate = AR_UpdateDate_;
	}
}
