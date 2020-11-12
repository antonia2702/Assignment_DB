package dbAssignment.opti_home_shop;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="bankdetails")
public class Bankdetails
{
	@Id
	@Column (name = "BD_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int BD_Id;
	public int getBD_Id()
	{
		return this.BD_Id;
	}
	public void setBD_Id(int value)
	{
		this.BD_Id = value;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BANK_Id")
	@NotNull
	private Bank BANK;
	public Bank getBANK()
	{
		return this.BANK;
	}
	public void setBANK(Bank value)
	{
		this.BANK = value;
	}
	
	@Column
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
	@CreationTimestamp
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
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp BD_UpdateDate;
	public java.sql.Timestamp getBD_UpdateDate()
	{
		return this.BD_UpdateDate;
	}
	public void setBD_UpdateDate(java.sql.Timestamp value)
	{
		this.BD_UpdateDate = value;
	}

	@OneToMany(mappedBy = "BD")
	private List<Supplier> suppliers;
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	
	@OneToMany(mappedBy = "BD")
	private List<Customeraccount> customeraccounts;
	public List<Customeraccount> getCustomeraccounts() {
		return customeraccounts;
	}
	public void setCustomeraccounts(List<Customeraccount> customeraccounts) {
		this.customeraccounts = customeraccounts;
	}
	
	public Bankdetails(Bank BANK_Id_,String BD_CartholderFirstName_,String BD_CartholderLastName_,String BD_Bic_,String BD_Iban_,java.sql.Date BD_CartValidDate_)
	{
		this.BANK = BANK_Id_;
		this.BD_CartholderFirstName = BD_CartholderFirstName_;
		this.BD_CartholderLastName = BD_CartholderLastName_;
		this.BD_Bic = BD_Bic_;
		this.BD_Iban = BD_Iban_;
		this.BD_CartValidDate = BD_CartValidDate_;
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
        return Objects.hash(BD_Id, BANK, BD_CartholderFirstName, BD_CartholderLastName, BD_Bic, BD_Iban, BD_CartValidDate, BD_CreateDate, BD_UpdateDate);
    }
}
