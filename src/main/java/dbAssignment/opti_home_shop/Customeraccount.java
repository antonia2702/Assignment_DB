package dbAssignment.opti_home_shop;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billingadress")
public class Customeraccount
{
	@Id
	@Column (name = "CA_Id")
	private int CA_Id;
	public int getCA_Id()
	{
		return this.CA_Id;
	}
	public void setCA_Id(int value)
	{
		this.CA_Id = value;
	}

	@Column
	private String CA_UserName;
	public String getCA_UserName()
	{
		return this.CA_UserName;
	}
	public void setCA_UserName(String value)
	{
		this.CA_UserName = value;
	}

	@Column
	private String CA_Password;
	public String getCA_Password()
	{
		return this.CA_Password;
	}
	public void setCA_Password(String value)
	{
		this.CA_Password = value;
	}

	@Column
	private int R_Id;
	public int getR_Id()
	{
		return this.R_Id;
	}
	public void setR_Id(int value)
	{
		this.R_Id = value;
	}

	@Column
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
	private java.sql.Timestamp CA_CreateDate;
	public java.sql.Timestamp getCA_CreateDate()
	{
		return this.CA_CreateDate;
	}
	public void setCA_CreateDate(java.sql.Timestamp value)
	{
		this.CA_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp CA_UpdateDate;
	public java.sql.Timestamp getCA_UpdateDate()
	{
		return this.CA_UpdateDate;
	}
	public void setCA_UpdateDate(java.sql.Timestamp value)
	{
		this.CA_UpdateDate = value;
	}


	public Customeraccount(int CA_Id_,String CA_UserName_,String CA_Password_,int R_Id_,int DA_Id_,int BA_Id_,int BD_Id_,java.sql.Timestamp CA_CreateDate_,java.sql.Timestamp CA_UpdateDate_)
	{
		this.CA_Id = CA_Id_;
		this.CA_UserName = CA_UserName_;
		this.CA_Password = CA_Password_;
		this.R_Id = R_Id_;
		this.DA_Id = DA_Id_;
		this.BA_Id = BA_Id_;
		this.BD_Id = BD_Id_;
		this.CA_CreateDate = CA_CreateDate_;
		this.CA_UpdateDate = CA_UpdateDate_;
	}
	public Customeraccount() {}
	
	@Override 
	public String toString() {
		return CA_UserName;
	}
	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        Customeraccount customeraccount = (Customeraccount) o;
        return Objects.equals( CA_Id, customeraccount.CA_Id );
    }


    @Override
    public int hashCode() {
        return Objects.hash (CA_Id, CA_UserName, CA_CreateDate, CA_UpdateDate);
    }
}