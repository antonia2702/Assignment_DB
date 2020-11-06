package dbAssignment.opti_home_shop;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "articlegroup")

public class ArticleGroup {
	@Id
	@Column(name = "AG_Id")
	private int AG_Id;

	public int getAG_Id() {
		return this.AG_Id;
	}

	public void setAG_Id(int value) {
		this.AG_Id = value;
	}

	@Column
	private String AG_Description;

	public String getAG_Description() {
		return this.AG_Description;
	}

	public void setAG_Description(String value) {
		this.AG_Description = value;
	}

	@Column
	private java.sql.Timestamp AG_CreateDate;

	public java.sql.Timestamp getAG_CreateDate() {
		return this.AG_CreateDate;
	}

	public void setAG_CreateDate(java.sql.Timestamp value) {
		this.AG_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp AG_UpdateDate;

	public java.sql.Timestamp getAG_UpdateDate() {
		return this.AG_UpdateDate;
	}

	public void setAG_UpdateDate(java.sql.Timestamp value) {
		this.AG_UpdateDate = value;
	}
	
	@OneToMany(mappedBy = "articlegroup")
	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public ArticleGroup(int AG_Id_, String AG_Description_, java.sql.Timestamp AG_CreateDate_,
			java.sql.Timestamp AG_UpdateDate_) {
		this.AG_Id = AG_Id_;
		this.AG_Description = AG_Description_;
		this.AG_CreateDate = AG_CreateDate_;
		this.AG_UpdateDate = AG_UpdateDate_;
	}
	
	public ArticleGroup() {
	}

	@Override
	public String toString() {
		return AG_Description;
	}

	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        ArticleGroup articleGroup = (ArticleGroup) o;
        return Objects.equals( AG_Id, articleGroup.AG_Id );
    }


    @Override
    public int hashCode() {
		return Objects.hash(AG_Id, AG_Description, AG_CreateDate, AG_UpdateDate);
	}

	
}
