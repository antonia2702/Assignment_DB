package dbAssignment.opti_home_shop;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "articleinventory")

public class ArticleInventory {
	@Id
	@Column(name = "AI_Id")
	private int AI_Id;

	public int getAI_Id() {
		return this.AI_Id;
	}

	public void setAI_Id(int value) {
		this.AI_Id = value;
	}

	@Column
	private int AI_Quantity;

	public int getAI_Quantity() {
		return this.AI_Quantity;
	}

	public void setAI_Quantity(int value) {
		this.AI_Quantity = value;
	}

	@Column
	private java.sql.Timestamp AI_CreateDate;

	public java.sql.Timestamp getAI_CreateDate() {
		return this.AI_CreateDate;
	}

	public void setAI_CreateDate(java.sql.Timestamp value) {
		this.AI_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp AI_UpdateDate;

	public java.sql.Timestamp getAI_UpdateDate() {
		return this.AI_UpdateDate;
	}

	public void setAI_UpdateDate(java.sql.Timestamp value) {
		this.AI_UpdateDate = value;
	}

	@OneToMany(mappedBy = "articleInventory")
	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public ArticleInventory(int AI_Id_, int AI_Quantity_, java.sql.Timestamp AI_CreateDate_,
			java.sql.Timestamp AI_UpdateDate_) {
		this.AI_Id = AI_Id_;
		this.AI_Quantity = AI_Quantity_;
		this.AI_CreateDate = AI_CreateDate_;
		this.AI_UpdateDate = AI_UpdateDate_;
	}

	public ArticleInventory() {
	}

	@Override
	public String toString() {
		return "" + getAI_Quantity();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		ArticleInventory articleInventory = (ArticleInventory) o;
		return Objects.equals(AI_Id, articleInventory.AI_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(AI_Id, AI_Quantity, AI_CreateDate, AI_UpdateDate);
	}
}
