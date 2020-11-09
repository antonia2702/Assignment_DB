package dbAssignment.opti_home_shop;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class Wishlist
{
	@Id
	@Column (name = "W_Id")
	private int W_Id;
	public int getW_Id()
	{
		return this.W_Id;
	}
	public void setW_Id(int value)
	{
		this.W_Id = value;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CA_Id")
	private Customeraccount customeraccount;
	public Customeraccount getCA()
	{
		return this.customeraccount;
	}
	public void setCA(Customeraccount value)
	{
		this.customeraccount = value;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="A_Id")
	private Article article;
	public Article getArticle()
	{
		return this.article;
	}
	public void setArticle(Article value)
	{
		this.article = value;
	}

	@Column
	private java.sql.Timestamp W_CreateDate;
	public java.sql.Timestamp getW_CreateDate()
	{
		return this.W_CreateDate;
	}
	public void setW_CreateDate(java.sql.Timestamp value)
	{
		this.W_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp W_UpdateDate;
	public java.sql.Timestamp getW_UpdateDate()
	{
		return this.W_UpdateDate;
	}
	public void setW_UpdateDate(java.sql.Timestamp value)
	{
		this.W_UpdateDate = value;
	}


	public Wishlist(int W_Id_,Customeraccount CA_Id_,Article A_Id_,java.sql.Timestamp W_CreateDate_,java.sql.Timestamp W_UpdateDate_)
	{
		this.W_Id = W_Id_;
		this.customeraccount = CA_Id_;
		this.article = A_Id_;
		this.W_CreateDate = W_CreateDate_;
		this.W_UpdateDate = W_UpdateDate_;
	}
	
	public Wishlist() {}
	
	@Override 
	public String toString() {
		return ""+W_Id;
	}
	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        Wishlist wishlist = (Wishlist) o;
        return Objects.equals( W_Id, wishlist.W_Id );
    }


    @Override
    public int hashCode() {
        return Objects.hash (W_Id, W_CreateDate, W_UpdateDate);
    }
}
