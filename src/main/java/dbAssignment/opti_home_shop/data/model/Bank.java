package dbAssignment.opti_home_shop.data.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "bank")
public class Bank {

	@Id
	@Column(name = "BANK_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int BANK_Id;

	public int getBANK_Id() {
		return this.BANK_Id;
	}

	@Column
	@NotNull
	private String BANK_Name;

	public String getBANK_Name() {
		return this.BANK_Name;
	}

	public void setBANK_Name(String value) {
		this.BANK_Name = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp BANK_CreateDate;

	public java.sql.Timestamp getBANK_CreateDate() {
		return this.BANK_CreateDate;
	}

	@Column
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp BANK_UpdateDate;

	public java.sql.Timestamp getBANK_UpdateDate() {
		return this.BANK_UpdateDate;
	}

	@OneToMany(mappedBy = "BANK", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Bankdetails> bankdetails;

	public List<Bankdetails> getBankdetails() {
		return bankdetails;
	}

	public void setBankdetails(List<Bankdetails> bankdetails) {
		this.bankdetails = bankdetails;
	}

	@OneToMany(mappedBy = "BANK", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Supplier> suppliers;

	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public Bank(String BANK_Name_) {
		this.BANK_Name = BANK_Name_;
	}

	public Bank() {

	}

	@Override
	public String toString() {
		return BANK_Name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Bank bank = (Bank) o;
		return Objects.equals(BANK_Id, bank.BANK_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(BANK_Id, BANK_Name, BANK_CreateDate, BANK_UpdateDate);
	}
}
