package dbAssignment.opti_home_shop.data.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@javax.persistence.Entity
@Table(name = "storage")
public class Storage {
	@Id
	@Column(name = "STOR_Id")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int STOR_Id;

	public int getSTOR_Id() {
		return this.STOR_Id;
	}

	@Column
	@NotNull
	private String STOR_No;

	public String getSTOR_No() {
		return this.STOR_No;
	}

	public void setSTOR_No(String value) {
		this.STOR_No = value;
	}

	@Column
	@NotNull
	private short STOR_Type;

	public short getSTOR_Type() {
		return this.STOR_Type;
	}

	public void setSTOR_Type(short value) {
		this.STOR_Type = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp STOR_CreateDate;

	public java.sql.Timestamp getSTOR_CreateDate() {
		return this.STOR_CreateDate;
	}

	@Column(nullable = false)
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp STOR_UpdateDate;

	public java.sql.Timestamp getSTOR_UpdateDate() {
		return this.STOR_UpdateDate;
	}

	@OneToMany(mappedBy = "storage", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Storage(String STOR_No_, short STOR_Type_) {
		this.STOR_No = STOR_No_;
		this.STOR_Type = STOR_Type_;
	}

	public Storage() {

	}

	@Override
	public String toString() {
		return STOR_No;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Storage storage = (Storage) o;
		return Objects.equals(STOR_Id, storage.STOR_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(STOR_Id, STOR_No, STOR_CreateDate, STOR_UpdateDate);
	}
}
