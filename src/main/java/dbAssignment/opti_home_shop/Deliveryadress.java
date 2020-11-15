package dbAssignment.opti_home_shop;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="deliveryadress")
public class Deliveryadress
{
	@Id
	@Column (name = "DA_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
	private byte DA_StreetNo;
	public byte getDA_StreetNo()
	{
		return this.DA_StreetNo;
	}
	public void setDA_StreetNo(byte value)
	{
		this.DA_StreetNo = value;
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
	public Countries getCOUNTRY_Id()
	{
		return this.COUNTRY;
	}
	public void setCOUNTRY_Id(Countries value)
	{
		this.COUNTRY = value;
	}
	
	@Column
	@NotNull
	@CreationTimestamp
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
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp DA_UpdateDate;
	public java.sql.Timestamp getDA_UpdateDate()
	{
		return this.DA_UpdateDate;
	}
	public void setDA_UpdateDate(java.sql.Timestamp value)
	{
		this.DA_UpdateDate = value;
	}
	
	@OneToMany(mappedBy = "DA", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Customeraccount> customeraccounts;

	public Deliveryadress(String DA_FirstName_,String DA_LastName_,String DA_Street_,byte DA_StreetNo_,Postalcode PC_Id_,Countries COUNTRY_Id_)
	{
		this.DA_FirstName = DA_FirstName_;
		this.DA_LastName = DA_LastName_;
		this.DA_Street = DA_Street_;
		this.DA_StreetNo = DA_StreetNo_;
		this.PC = PC_Id_;
		this.COUNTRY = COUNTRY_Id_;
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
