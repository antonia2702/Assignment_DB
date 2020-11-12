package dbAssignment.opti_home_shop;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="wishlist")
public class Wishlist
{
	@Id
	@Column (name = "W_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
	@CreationTimestamp
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
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp W_UpdateDate;
	public java.sql.Timestamp getW_UpdateDate()
	{
		return this.W_UpdateDate;
	}
	public void setW_UpdateDate(java.sql.Timestamp value)
	{
		this.W_UpdateDate = value;
	}


	public Wishlist(Customeraccount CA_Id_,Article A_Id_)
	{
		this.customeraccount = CA_Id_;
		this.article = A_Id_;
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
