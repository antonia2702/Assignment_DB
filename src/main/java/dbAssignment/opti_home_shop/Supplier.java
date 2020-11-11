package dbAssignment.opti_home_shop;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="supplier")
public class Supplier
{
	@Id
	@Column (name = "SUP_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
	private byte SUP_StreetNo;
	public byte getSUP_StreetNo()
	{
		return this.SUP_StreetNo;
	}
	public void setSUP_StreetNo(byte value)
	{
		this.SUP_StreetNo = value;
	}

	@ManyToOne(fetch=FetchType.LAZY)
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

	@ManyToOne(fetch=FetchType.LAZY)
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

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BD_Id")
	@NotNull
	private Bankdetails BD;
	public Bankdetails getBD()
	{
		return this.BD;
	}
	public void setBD(Bankdetails value)
	{
		this.BD = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
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
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp SUP_UpdateDate;
	public java.sql.Timestamp getSUP_UpdateDate()
	{
		return this.SUP_UpdateDate;
	}
	public void setSUP_UpdateDate(java.sql.Timestamp value)
	{
		this.SUP_UpdateDate = value;
	}
	
	@OneToMany(mappedBy = "supplier")
	private List<Article> articles;
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	public Supplier(String SUP_Name_,String SUP_LegalForm_,String SUP_Street_,byte SUP_StreetNo_,Postalcode PC_Id_,Countries COUNTRY_Id_,Bank BANK_Id_,Bankdetails BD_Id_)
	{
		this.SUP_Name = SUP_Name_;
		this.SUP_LegalForm = SUP_LegalForm_;
		this.SUP_Street = SUP_Street_;
		this.SUP_StreetNo = SUP_StreetNo_;
		this.PC = PC_Id_;
		this.COUNTRY = COUNTRY_Id_;
		this.BANK = BANK_Id_;
		this.BD = BD_Id_;
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
