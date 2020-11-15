package dbAssignment.opti_home_shop;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@javax.persistence.Entity
@Table(name = "storage")
public class Storage {
	@Id
	@Column(name = "STOR_Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int STOR_Id;

	public int getSTOR_Id() {
		return this.STOR_Id;
	}

	public void setSTOR_Id(int value) {
		this.STOR_Id = value;
	}

	@Column(nullable = false)
	private String STOR_No;

	public String getSTOR_No() {
		return this.STOR_No;
	}

	public void setSTOR_No(String value) {
		this.STOR_No = value;
	}

	@Column(nullable = false)
	private short STOR_Type;

	public short getSTOR_Type() {
		return this.STOR_Type;
	}

	public void setSTOR_Type(short value) {
		this.STOR_Type = value;
	}

	@CreationTimestamp
	@Column(nullable = false)
	private java.sql.Timestamp STOR_CreateDate;

	public java.sql.Timestamp getSTOR_CreateDate() {
		return this.STOR_CreateDate;
	}

	public void setSTOR_CreateDate(java.sql.Timestamp value) {
		this.STOR_CreateDate = value;
	}

	@UpdateTimestamp
	@Column(nullable = false)
	private java.sql.Timestamp STOR_UpdateDate;

	public java.sql.Timestamp getSTOR_UpdateDate() {
		return this.STOR_UpdateDate;
	}

	public void setSTOR_UpdateDate(java.sql.Timestamp value) {
		this.STOR_UpdateDate = value;
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
