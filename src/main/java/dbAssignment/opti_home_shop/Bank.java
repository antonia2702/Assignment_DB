package dbAssignment.opti_home_shop;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="bank")
public class Bank
{
	
	public Bank() {
		
	}
	@Id
	@Column (name = "BANK_Id")
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
	private String BANK_Name;
	public String getBANK_Name()
	{
		return this.BANK_Name;
	}
	public void setBANK_Name(String value)
	{
		this.BANK_Name = value;
	}

	@Column
	private java.sql.Timestamp BANK_CreateDate;
	public java.sql.Timestamp getBANK_CreateDate()
	{
		return this.BANK_CreateDate;
	}
	public void setBANK_CreateDate(java.sql.Timestamp value)
	{
		this.BANK_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp BANK_UpdateDate;
	public java.sql.Timestamp getBANK_UpdateDate()
	{
		return this.BANK_UpdateDate;
	}
	public void setBANK_UpdateDate(java.sql.Timestamp value)
	{
		this.BANK_UpdateDate = value;
	}


	public Bank(int BANK_Id_,String BANK_Name_,java.sql.Timestamp BANK_CreateDate_,java.sql.Timestamp BANK_UpdateDate_)
	{
		this.BANK_Id = BANK_Id_;
		this.BANK_Name = BANK_Name_;
		this.BANK_CreateDate = BANK_CreateDate_;
		this.BANK_UpdateDate = BANK_UpdateDate_;
	}
	
	@Override 
	public String toString() {
		return BANK_Name;
	}
	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        Bank bank = (Bank) o;
        return Objects.equals( BANK_Id, bank.BANK_Id );
    }


    @Override
    public int hashCode() {
        return Objects.hash( BANK_Id, BANK_Name, BANK_CreateDate, BANK_UpdateDate);
    }
}
