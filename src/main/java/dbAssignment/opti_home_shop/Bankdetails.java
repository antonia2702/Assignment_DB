package dbAssignment.opti_home_shop;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="bankdetails")
public class Bankdetails
{
	@Id
	@Column (name = "BD_Id")
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
	private String BD_CartholderFirstName;
	public String getBD_CartholderFirstName()
	{
		return this.BD_CartholderFirstName;
	}
	public void setBD_CartholderFirstName(String value)
	{
		this.BD_CartholderFirstName = value;
	}

	@Column
	private String BD_CartholderLastName;
	public String getBD_CartholderLastName()
	{
		return this.BD_CartholderLastName;
	}
	public void setBD_CartholderLastName(String value)
	{
		this.BD_CartholderLastName = value;
	}

	@Column
	private String BD_Bic;
	public String getBD_Bic()
	{
		return this.BD_Bic;
	}
	public void setBD_Bic(String value)
	{
		this.BD_Bic = value;
	}

	@Column
	private String BD_Iban;
	public String getBD_Iban()
	{
		return this.BD_Iban;
	}
	public void setBD_Iban(String value)
	{
		this.BD_Iban = value;
	}

	@Column
	private java.sql.Date BD_CartValidDate;
	public java.sql.Date getBD_CartValidDate()
	{
		return this.BD_CartValidDate;
	}
	public void setBD_CartValidDate(java.sql.Date value)
	{
		this.BD_CartValidDate = value;
	}

	@Column
	private java.sql.Timestamp BD_CreateDate;
	public java.sql.Timestamp getBD_CreateDate()
	{
		return this.BD_CreateDate;
	}
	public void setBD_CreateDate(java.sql.Timestamp value)
	{
		this.BD_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp BD_UpdateDate;
	public java.sql.Timestamp getBD_UpdateDate()
	{
		return this.BD_UpdateDate;
	}
	public void setBD_UpdateDate(java.sql.Timestamp value)
	{
		this.BD_UpdateDate = value;
	}


	public Bankdetails(int BD_Id_,int BANK_Id_,String BD_CartholderFirstName_,String BD_CartholderLastName_,String BD_Bic_,String BD_Iban_,java.sql.Date BD_CartValidDate_,java.sql.Timestamp BD_CreateDate_,java.sql.Timestamp BD_UpdateDate_)
	{
		this.BD_Id = BD_Id_;
		this.BANK_Id = BANK_Id_;
		this.BD_CartholderFirstName = BD_CartholderFirstName_;
		this.BD_CartholderLastName = BD_CartholderLastName_;
		this.BD_Bic = BD_Bic_;
		this.BD_Iban = BD_Iban_;
		this.BD_CartValidDate = BD_CartValidDate_;
		this.BD_CreateDate = BD_CreateDate_;
		this.BD_UpdateDate = BD_UpdateDate_;
	}
	
	public Bankdetails() {
		
	}
	
	@Override 
	public String toString() {
		return BD_CartholderFirstName+" "+BD_CartholderLastName+": "+BD_Iban;
	}
	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        Bankdetails bankdetails = (Bankdetails) o;
        return Objects.equals( BD_Id, bankdetails.BD_Id );
    }


    @Override
    public int hashCode() {
        return Objects.hash(BD_Id, BANK_Id, BD_CartholderFirstName, BD_CartholderLastName, BD_Bic, BD_Iban, BD_CartValidDate, BD_CreateDate, BD_UpdateDate);
    }
}
