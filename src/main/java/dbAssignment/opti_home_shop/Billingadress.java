package dbAssignment.opti_home_shop;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="billingadress")
public class Billingadress
{
	@Id
	@Column (name = "BA_Id")
	private int BA_Id;
	public int getBA_Id()
	{
		return this.BA_Id;
	}
	public void setBA_Id(int value)
	{
		this.BA_Id = value;
	}

	@Column
	private String BA_FirstName;
	public String getBA_FirstName()
	{
		return this.BA_FirstName;
	}
	public void setBA_FirstName(String value)
	{
		this.BA_FirstName = value;
	}

	@Column
	private String BA_LastName;
	public String getBA_LastName()
	{
		return this.BA_LastName;
	}
	public void setBA_LastName(String value)
	{
		this.BA_LastName = value;
	}

	@Column
	private String BA_Street;
	public String getBA_Street()
	{
		return this.BA_Street;
	}
	public void setBA_Street(String value)
	{
		this.BA_Street = value;
	}

	@Column
	private String BA_StreetNo;
	public String getBA_StreetNo()
	{
		return this.BA_StreetNo;
	}
	public void setBA_StreetNo(String value)
	{
		this.BA_StreetNo = value;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PC_Id")
	private Postalcode PC;
	public Postalcode getPC()
	{
		return this.PC;
	}
	public void setPC(Postalcode value)
	{
		this.PC = value;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COUNTRY_Id")
	private Countries COUNTRY;
	public Countries getCOUNTRY()
	{
		return this.COUNTRY;
	}
	public void setCOUNTRY(Countries value)
	{
		this.COUNTRY = value;
	}

	@Column
	private java.sql.Timestamp BA_CreateDate;
	public java.sql.Timestamp getBA_CreateDate()
	{
		return this.BA_CreateDate;
	}
	public void setBA_CreateDate(java.sql.Timestamp value)
	{
		this.BA_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp BA_UpdateDate;
	public java.sql.Timestamp getBA_UpdateDate()
	{
		return this.BA_UpdateDate;
	}
	public void setBA_UpdateDate(java.sql.Timestamp value)
	{
		this.BA_UpdateDate = value;
	}

	@OneToMany(mappedBy = "BA")
	private List<Customeraccount> customeraccounts;
	public List<Customeraccount> getCustomeraccounts() {
		return customeraccounts;
	}
	public void setCustomeraccounts(List<Customeraccount> customeraccounts) {
		this.customeraccounts = customeraccounts;
	}

	public Billingadress(int BA_Id_,String BA_FirstName_,String BA_LastName_,String BA_Street_,String BA_StreetNo_,Postalcode PC_Id_,Countries COUNTRY_Id_,java.sql.Timestamp BA_CreateDate_,java.sql.Timestamp BA_UpdateDate_)
	{
		this.BA_Id = BA_Id_;
		this.BA_FirstName = BA_FirstName_;
		this.BA_LastName = BA_LastName_;
		this.BA_Street = BA_Street_;
		this.BA_StreetNo = BA_StreetNo_;
		this.PC = PC_Id_;
		this.COUNTRY = COUNTRY_Id_;
		this.BA_CreateDate = BA_CreateDate_;
		this.BA_UpdateDate = BA_UpdateDate_;
	}
	
	public Billingadress() {}
	
	@Override 
	public String toString() {
		return BA_Street+" "+BA_StreetNo;
	}
	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        Billingadress billingadress = (Billingadress) o;
        return Objects.equals( BA_Id, billingadress.BA_Id );
    }


    @Override
    public int hashCode() {
        return Objects.hash (BA_Id, BA_FirstName, BA_LastName, BA_Street);
    }
}