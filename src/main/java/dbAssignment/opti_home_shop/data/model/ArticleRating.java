package dbAssignment.opti_home_shop.data.model;

import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@javax.persistence.Entity
@Table(name = "articlerating")
public class ArticleRating {
	@Id
	@Column(name = "AR_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int AR_Id;

	public int getAR_Id() {
		return this.AR_Id;
	}

	@Column
	@NotNull
	private String AR_Describtion;

	public String getAR_Describtion() {
		return this.AR_Describtion;
	}

	public void setAR_Describtion(String value) {
		this.AR_Describtion = value;
	}

	@Column
	@NotNull
	private byte AR_Rating;

	public byte getAR_Rating() {
		return this.AR_Rating;
	}

	public void setAR_Rating(byte value) {
		this.AR_Rating = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp AR_CreateDate;

	public java.sql.Timestamp getAR_CreateDate() {
		return this.AR_CreateDate;
	}

	@Column
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp AR_UpdateDate;

	public java.sql.Timestamp getAR_UpdateDate() {
		return this.AR_UpdateDate;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "A_Id")
	@NotNull
	private Article article;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "CA_Id")
	@NotNull
	private Customeraccount customeraccount;

	public Customeraccount getCustomeraccount() {
		return customeraccount;
	}

	public void setCustomeraccount(Customeraccount customeraccount) {
		this.customeraccount = customeraccount;
	}

	public ArticleRating(String AR_Describtion_, byte AR_Rating_, Article article, Customeraccount customeraccount) {
		this.AR_Describtion = AR_Describtion_;
		this.AR_Rating = AR_Rating_;
		this.article = article;
		this.customeraccount = customeraccount;
	}

	public ArticleRating() {

	}

	@Override
	public String toString() {
		return "" + AR_Rating + ", " + AR_Describtion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		ArticleRating articleRating = (ArticleRating) o;
		return Objects.equals(AR_Id, articleRating.AR_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(AR_Id, AR_Describtion, AR_Rating, AR_CreateDate);
	}
}
