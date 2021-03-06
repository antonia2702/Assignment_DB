package dbAssignment.opti_home_shop.data.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@javax.persistence.Entity
@Table(name = "articleinventory")

public class ArticleInventory {
	@Id
	@Column(name = "AI_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int AI_Id;

	public int getAI_Id() {
		return this.AI_Id;
	}

	@Column
	@NotNull
	private int AI_Quantity;

	public int getAI_Quantity() {
		return this.AI_Quantity;
	}

	public void setAI_Quantity(int value) {
		this.AI_Quantity = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp AI_CreateDate;

	public java.sql.Timestamp getAI_CreateDate() {
		return this.AI_CreateDate;
	}

	@Column
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp AI_UpdateDate;

	public java.sql.Timestamp getAI_UpdateDate() {
		return this.AI_UpdateDate;
	}

	@OneToMany(mappedBy = "articleInventory", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public ArticleInventory(int AI_Quantity_) {
		this.AI_Quantity = AI_Quantity_;
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
