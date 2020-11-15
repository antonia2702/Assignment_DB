package dbAssignment.opti_home_shop.data.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@javax.persistence.Entity
@Table(name = "dangerousgoods")
public class DangerousGoods {
	@Id
	@Column(name = "DG_Id")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int DG_Id;

	public int getDG_Id() {
		return this.DG_Id;
	}

	@Column
	@NotNull
	private String DG_Code;

	public String getDG_Code() {
		return this.DG_Code;
	}

	public void setDG_Code(String value) {
		this.DG_Code = value;
	}

	@Column
	@NotNull
	private String DG_Description;

	public String getDG_Description() {
		return this.DG_Description;
	}

	public void setDG_Description(String value) {
		this.DG_Description = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp DG_CreateDate;

	public java.sql.Timestamp getDG_CreateDate() {
		return this.DG_CreateDate;
	}

	@Column
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp DG_UpdateDate;

	public java.sql.Timestamp getDG_UpdateDate() {
		return this.DG_UpdateDate;
	}
	
	@OneToMany(mappedBy = "dangerousGood", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List <Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public DangerousGoods(String DG_Code_, String DG_Description_) {
		this.DG_Code = DG_Code_;
		this.DG_Description = DG_Description_;
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
