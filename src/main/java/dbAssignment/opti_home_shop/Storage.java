package dbAssignment.opti_home_shop;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "storage")
public class Storage {
	@Id
	@Column(name = "STOR_Id")
	private int STOR_Id;

	public int getSTOR_Id() {
		return this.STOR_Id;
	}

	public void setSTOR_Id(int value) {
		this.STOR_Id = value;
	}

	@Column
	private String STOR_No;

	public String getSTOR_No() {
		return this.STOR_No;
	}

	public void setSTOR_No(String value) {
		this.STOR_No = value;
	}

	@Column
	private short STOR_Type;

	public short getSTOR_Type() {
		return this.STOR_Type;
	}

	public void setSTOR_Type(short value) {
		this.STOR_Type = value;
	}

	@Column
	private java.sql.Timestamp STOR_CreateDate;

	public java.sql.Timestamp getSTOR_CreateDate() {
		return this.STOR_CreateDate;
	}

	public void setSTOR_CreateDate(java.sql.Timestamp value) {
		this.STOR_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp STOR_UpdateDate;

	public java.sql.Timestamp getSTOR_UpdateDate() {
		return this.STOR_UpdateDate;
	}

	public void setSTOR_UpdateDate(java.sql.Timestamp value) {
		this.STOR_UpdateDate = value;
	}

	public Storage(int STOR_Id_, String STOR_No_, short STOR_Type_, java.sql.Timestamp STOR_CreateDate_,
			java.sql.Timestamp STOR_UpdateDate_) {
		this.STOR_Id = STOR_Id_;
		this.STOR_No = STOR_No_;
		this.STOR_Type = STOR_Type_;
		this.STOR_CreateDate = STOR_CreateDate_;
		this.STOR_UpdateDate = STOR_UpdateDate_;
	}
}
