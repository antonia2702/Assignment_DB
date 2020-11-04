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
@Table(name="deliveryadress")
public class Deliveryadress
{
	@Id
	@Column (name = "DA_Id")
	private int DA_Id;
	public int getDA_Id()
	{
		return this.DA_Id;
	}
	public void setDA_Id(int value)
	{
		this.DA_Id = value;
	}

	@Column
	private String DA_FirstName;
	public String getDA_FirstName()
	{
		return this.DA_FirstName;
	}
	public void setDA_FirstName(String value)
	{
		this.DA_FirstName = value;
	}

	@Column
	private String DA_LastName;
	public String getDA_LastName()
	{
		return this.DA_LastName;
	}
	public void setDA_LastName(String value)
	{
		this.DA_LastName = value;
	}

	@Column
	private String DA_Street;
	public String getDA_Street()
	{
		return this.DA_Street;
	}
	public void setDA_Street(String value)
	{
		this.DA_Street = value;
	}

	@Column
	private byte DA_StreetNo;
	public byte getDA_StreetNo()
	{
		return this.DA_StreetNo;
	}
	public void setDA_StreetNo(byte value)
	{
		this.DA_StreetNo = value;
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
	public Countries getCOUNTRY_Id()
	{
		return this.COUNTRY;
	}
	public void setCOUNTRY_Id(Countries value)
	{
		this.COUNTRY = value;
	}
	
	@Column
	private java.sql.Timestamp DA_CreateDate;
	public java.sql.Timestamp getDA_CreateDate()
	{
		return this.DA_CreateDate;
	}
	public void setDA_CreateDate(java.sql.Timestamp value)
	{
		this.DA_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp DA_UpdateDate;
	public java.sql.Timestamp getDA_UpdateDate()
	{
		return this.DA_UpdateDate;
	}
	public void setDA_UpdateDate(java.sql.Timestamp value)
	{
		this.DA_UpdateDate = value;
	}
	
	@OneToMany(mappedBy = "DA")
	private List<Customeraccount> customeraccounts;

	public Deliveryadress(int DA_Id_,String DA_FirstName_,String DA_LastName_,String DA_Street_,byte DA_StreetNo_,Postalcode PC_Id_,Countries COUNTRY_Id_,java.sql.Timestamp DA_CreateDate_,java.sql.Timestamp DA_UpdateDate_)
	{
		this.DA_Id = DA_Id_;
		this.DA_FirstName = DA_FirstName_;
		this.DA_LastName = DA_LastName_;
		this.DA_Street = DA_Street_;
		this.DA_StreetNo = DA_StreetNo_;
		this.PC = PC_Id_;
		this.COUNTRY = COUNTRY_Id_;
		this.DA_CreateDate = DA_CreateDate_;
		this.DA_UpdateDate = DA_UpdateDate_;
	}
	public Deliveryadress() {}
	
	@Override 
	public String toString() {
		return DA_Street+" "+DA_StreetNo;
	}
	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        Deliveryadress deliveryadress = (Deliveryadress) o;
        return Objects.equals( DA_Id, deliveryadress.DA_Id );
    }


    @Override
    public int hashCode() {
        return Objects.hash (DA_Id, DA_FirstName, DA_LastName, DA_Street);
    }
}
