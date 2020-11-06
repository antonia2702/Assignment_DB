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

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="R_Id")
	private Role R;
	public Role getR()
	{
		return this.R;
	}
	public void setR(Role value)
	{
		this.R = value;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DA_Id")
	private Deliveryadress DA;
	public Deliveryadress getDA()
	{
		return this.DA;
	}
	public void setDA(Deliveryadress value)
	{
		this.DA = value;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BA_Id")
	private Billingadress BA;
	public Billingadress getBA()
	{
		return this.BA;
	}
	public void setBA(Billingadress value)
	{
		this.BA = value;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BD_Id")
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
	
	@OneToMany(mappedBy = "customeraccount")
	private List<ArticleRating> articleratings;
	public List<ArticleRating> getArticleratings() {
		return articleratings;
	}
	public void setArticleratings(List<ArticleRating> articleratings) {
		this.articleratings = articleratings;
	}
	
	@OneToMany(mappedBy = "CA")
	private List<Wishlist> wishlists;
	public List<Wishlist> getWishlists() {
		return wishlists;
	}
	public void setWishlists(List<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}
	
	@OneToMany(mappedBy = "CART")
	private List<Cart> carts;
	public List<Cart> getCarts() {
		return carts;
	}
	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
	
	public Customeraccount(int CA_Id_,String CA_UserName_,String CA_Password_,Role R_Id_,Deliveryadress DA_Id_,Billingadress BA_Id_,Bankdetails BD_Id_,java.sql.Timestamp CA_CreateDate_,java.sql.Timestamp CA_UpdateDate_)
	{
		this.CA_Id = CA_Id_;
		this.CA_UserName = CA_UserName_;
		this.CA_Password = CA_Password_;
		this.R = R_Id_;
		this.DA = DA_Id_;
		this.BA = BA_Id_;
		this.BD = BD_Id_;
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