package dbAssignment.opti_home_shop;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="billingadress")
public class Billingadress
{
	@Id
	@NotNull
	@Column (name = "BA_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
	private String BA_StreetNo;
	public String getBA_StreetNo()
	{
		return this.BA_StreetNo;
	}
	public void setBA_StreetNo(String value)
	{
		this.BA_StreetNo = value;
	}

	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name="PC_Id")
	@NotNull
	private Postalcode PC;
	public Postalcode getPC()
	{
		return this.PC;
	}
	public void setPC(Postalcode value)
	{
		this.PC = value;
	}

	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name="COUNTRY_Id")
	@NotNull
	private Countries COUNTRY;
	public Countries getCOUNTRY()
	{
		return this.COUNTRY;
	}
	public void setCOUNTRY(Countries value)
	{
		this.COUNTRY = value;
	}

	@CreationTimestamp
	@NotNull
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

	@UpdateTimestamp
	@NotNull
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

	@OneToMany(mappedBy = "BA", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Customeraccount> customeraccounts;
	public List<Customeraccount> getCustomeraccounts() {
		return customeraccounts;
	}
	public void setCustomeraccounts(List<Customeraccount> customeraccounts) {
		this.customeraccounts = customeraccounts;
	}

	public Billingadress(String BA_FirstName_,String BA_LastName_,String BA_Street_,String BA_StreetNo_,Postalcode PC_Id_,Countries COUNTRY_Id_)
	{
		this.BA_FirstName = BA_FirstName_;
		this.BA_LastName = BA_LastName_;
		this.BA_Street = BA_Street_;
		this.BA_StreetNo = BA_StreetNo_;
		this.PC = PC_Id_;
		this.COUNTRY = COUNTRY_Id_;
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
