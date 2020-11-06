package dbAssignment.opti_home_shop;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Countries
{
	@Id
	@Column (name = "COUNTRY_Id")
	private int COUNTRY_Id;
	public int getCOUNTRY_Id()
	{
		return this.COUNTRY_Id;
	}
	public void setCOUNTRY_Id(int value)
	{
		this.COUNTRY_Id = value;
	}

	@Column
	private String COUNTRY_Name;
	public String getCOUNTRY_Name()
	{
		return this.COUNTRY_Name;
	}
	public void setCOUNTRY_Name(String value)
	{
		this.COUNTRY_Name = value;
	}

	@Column
	private java.sql.Timestamp COUNTRY_CreateDate;
	public java.sql.Timestamp getCOUNTRY_CreateDate()
	{
		return this.COUNTRY_CreateDate;
	}
	public void setCOUNTRY_CreateDate(java.sql.Timestamp value)
	{
		this.COUNTRY_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp COUNTRY_UpdateDate;
	public java.sql.Timestamp getCOUNTRY_UpdateDate()
	{
		return this.COUNTRY_UpdateDate;
	}
	public void setCOUNTRY_UpdateDate(java.sql.Timestamp value)
	{
		this.COUNTRY_UpdateDate = value;
	}

	@OneToMany(mappedBy = "COUNTRY")
	private List<Billingadress> billingadresses;
	public List<Billingadress> getBillingadresses() {
		return billingadresses;
	}
	public void setBillingadresses(List<Billingadress> billingadresses) {
		this.billingadresses = billingadresses;
	}
	
	@OneToMany(mappedBy = "COUNTRY")
	private List<Supplier> suppliers;
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	
	@OneToMany(mappedBy = "COUNTRY")
	private List<Deliveryadress> deliveryadresses;
	public List<Deliveryadress> getDeliveryadresses() {
		return deliveryadresses;
	}
	public void setDeliveryadresses(List<Deliveryadress> deliveryadresses) {
		this.deliveryadresses = deliveryadresses;
	}

	public Countries(int COUNTRY_Id_,String COUNTRY_Name_,java.sql.Timestamp COUNTRY_CreateDate_,java.sql.Timestamp COUNTRY_UpdateDate_)
	{
		this.COUNTRY_Id = COUNTRY_Id_;
		this.COUNTRY_Name = COUNTRY_Name_;
		this.COUNTRY_CreateDate = COUNTRY_CreateDate_;
		this.COUNTRY_UpdateDate = COUNTRY_UpdateDate_;
	}
	
	public Countries() {}
	
	@Override 
	public String toString() {
		return COUNTRY_Name;
	}
	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        Countries countries = (Countries) o;
        return Objects.equals( COUNTRY_Id, countries.COUNTRY_Id );
    }


    @Override
    public int hashCode() {
        return Objects.hash (COUNTRY_Id, COUNTRY_Name, COUNTRY_CreateDate, COUNTRY_UpdateDate);
    }
}