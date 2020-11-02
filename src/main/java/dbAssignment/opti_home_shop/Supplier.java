package dbAssignment.opti_home_shop;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier
{
	@Id
	@Column (name = "SUP_Id")
	private int SUP_Id;
	public int getSUP_Id()
	{
		return this.SUP_Id;
	}
	public void setSUP_Id(int value)
	{
		this.SUP_Id = value;
	}

	@Column
	private String SUP_Name;
	public String getSUP_Name()
	{
		return this.SUP_Name;
	}
	public void setSUP_Name(String value)
	{
		this.SUP_Name = value;
	}

	@Column
	private String SUP_LegalForm;
	public String getSUP_LegalForm()
	{
		return this.SUP_LegalForm;
	}
	public void setSUP_LegalForm(String value)
	{
		this.SUP_LegalForm = value;
	}

	@Column
	private String SUP_Street;
	public String getSUP_Street()
	{
		return this.SUP_Street;
	}
	public void setSUP_Street(String value)
	{
		this.SUP_Street = value;
	}

	@Column
	private byte SUP_StreetNo;
	public byte getSUP_StreetNo()
	{
		return this.SUP_StreetNo;
	}
	public void setSUP_StreetNo(byte value)
	{
		this.SUP_StreetNo = value;
	}

	@Column
	private int PC_Id;
	public int getPC_Id()
	{
		return this.PC_Id;
	}
	public void setPC_Id(int value)
	{
		this.PC_Id = value;
	}

	@Column
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
	private int BANK_Id;
	public int getBANK_Id()
	{
		return this.BANK_Id;
	}
	public void setBANK_Id(int value)
	{
		this.BANK_Id = value;
	}

	@Column
	private int BD_Id;
	public int getBD_Id()
	{
		return this.BD_Id;
	}
	public void setBD_Id(int value)
	{
		this.BD_Id = value;
	}

	@Column
	private java.sql.Timestamp SUP_CreateDate;
	public java.sql.Timestamp getSUP_CreateDate()
	{
		return this.SUP_CreateDate;
	}
	public void setSUP_CreateDate(java.sql.Timestamp value)
	{
		this.SUP_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp SUP_UpdateDate;
	public java.sql.Timestamp getSUP_UpdateDate()
	{
		return this.SUP_UpdateDate;
	}
	public void setSUP_UpdateDate(java.sql.Timestamp value)
	{
		this.SUP_UpdateDate = value;
	}


	public Supplier(int SUP_Id_,String SUP_Name_,String SUP_LegalForm_,String SUP_Street_,byte SUP_StreetNo_,int PC_Id_,int COUNTRY_Id_,int BANK_Id_,int BD_Id_,java.sql.Timestamp SUP_CreateDate_,java.sql.Timestamp SUP_UpdateDate_)
	{
		this.SUP_Id = SUP_Id_;
		this.SUP_Name = SUP_Name_;
		this.SUP_LegalForm = SUP_LegalForm_;
		this.SUP_Street = SUP_Street_;
		this.SUP_StreetNo = SUP_StreetNo_;
		this.PC_Id = PC_Id_;
		this.COUNTRY_Id = COUNTRY_Id_;
		this.BANK_Id = BANK_Id_;
		this.BD_Id = BD_Id_;
		this.SUP_CreateDate = SUP_CreateDate_;
		this.SUP_UpdateDate = SUP_UpdateDate_;
	}
	
	public Supplier() {}
	
	@Override 
	public String toString() {
		return SUP_Name;
	}
	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        Supplier supplier = (Supplier) o;
        return Objects.equals( SUP_Id, supplier.SUP_Id );
    }


    @Override
    public int hashCode() {
        return Objects.hash (SUP_Id, SUP_Name, SUP_LegalForm, SUP_Street);
    }
}
