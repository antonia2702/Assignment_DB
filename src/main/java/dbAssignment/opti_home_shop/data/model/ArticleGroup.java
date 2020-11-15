package dbAssignment.opti_home_shop.data.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@javax.persistence.Entity
@Table(name = "articlegroup")

public class ArticleGroup {
	@Id
	@Column(name = "AG_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int AG_Id;

	public int getAG_Id() {
		return this.AG_Id;
	}

	@Column
	@NotNull
	private String AG_Description;

	public String getAG_Description() {
		return this.AG_Description;
	}

	public void setAG_Description(String value) {
		this.AG_Description = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp AG_CreateDate;

	public java.sql.Timestamp getAG_CreateDate() {
		return this.AG_CreateDate;
	}

	@Column
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp AG_UpdateDate;

	public java.sql.Timestamp getAG_UpdateDate() {
		return this.AG_UpdateDate;
	}

	@OneToMany(mappedBy = "articleGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public ArticleGroup(String AG_Description_) {
		this.AG_Description = AG_Description_;
	}

	public ArticleGroup() {
	}

	@Override
	public String toString() {
		return AG_Description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		ArticleGroup articleGroup = (ArticleGroup) o;
		return Objects.equals(AG_Id, articleGroup.AG_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(AG_Id, AG_Description, AG_CreateDate, AG_UpdateDate);
	}

}
