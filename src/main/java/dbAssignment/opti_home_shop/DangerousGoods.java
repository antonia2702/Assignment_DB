package dbAssignment.opti_home_shop;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "dangerousgoods")
public class DangerousGoods {
	@Id
	@Column(name = "DG_Id")
	private int DG_Id;

	public int getDG_Id() {
		return this.DG_Id;
	}

	public void setDG_Id(int value) {
		this.DG_Id = value;
	}

	@Column
	private String DG_Code;

	public String getDG_Code() {
		return this.DG_Code;
	}

	public void setDG_Code(String value) {
		this.DG_Code = value;
	}

	@Column
	private String DG_Description;

	public String getDG_Description() {
		return this.DG_Description;
	}

	public void setDG_Description(String value) {
		this.DG_Description = value;
	}

	@Column
	private java.sql.Timestamp DG_CreateDate;

	public java.sql.Timestamp getDG_CreateDate() {
		return this.DG_CreateDate;
	}

	public void setDG_CreateDate(java.sql.Timestamp value) {
		this.DG_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp DG_UpdateDate;

	public java.sql.Timestamp getDG_UpdateDate() {
		return this.DG_UpdateDate;
	}

	public void setDG_UpdateDate(java.sql.Timestamp value) {
		this.DG_UpdateDate = value;
	}
	
	@OneToMany(mappedBy = "dangerousgoods")
	private List <Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public DangerousGoods(int DG_Id_, String DG_Code_, String DG_Description_, java.sql.Timestamp DG_CreateDate_,
			java.sql.Timestamp DG_UpdateDate_) {
		this.DG_Id = DG_Id_;
		this.DG_Code = DG_Code_;
		this.DG_Description = DG_Description_;
		this.DG_CreateDate = DG_CreateDate_;
		this.DG_UpdateDate = DG_UpdateDate_;
	}
	
	public DangerousGoods() {
		
	}
	
	@Override
	public String toString() {
		return DG_Code + ", " + DG_Description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		DangerousGoods dangerousGood = (DangerousGoods) o;
		return Objects.equals(DG_Id, dangerousGood.DG_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(DG_Id, DG_Code, DG_Description, DG_CreateDate);
	}
}
