package dbAssignment.opti_home_shop;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "customtariffnumbers")
public class CustomTariffNumbers {
	@Id
	@Column(name = "CTN_Id")
	private int CTN_Id;

	public int getCTN_Id() {
		return this.CTN_Id;
	}

	public void setCTN_Id(int value) {
		this.CTN_Id = value;
	}

	@Column
	private String CTN_Code;

	public String getCTN_Code() {
		return this.CTN_Code;
	}

	public void setCTN_Code(String value) {
		this.CTN_Code = value;
	}

	@Column
	private String CTN_Description;

	public String getCTN_Description() {
		return this.CTN_Description;
	}

	public void setCTN_Description(String value) {
		this.CTN_Description = value;
	}

	@Column
	private java.sql.Timestamp CTN_CreateDate;

	public java.sql.Timestamp getCTN_CreateDate() {
		return this.CTN_CreateDate;
	}

	public void setCTN_CreateDate(java.sql.Timestamp value) {
		this.CTN_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp CTN_UpdateDate;

	public java.sql.Timestamp getCTN_UpdateDate() {
		return this.CTN_UpdateDate;
	}

	public void setCTN_UpdateDate(java.sql.Timestamp value) {
		this.CTN_UpdateDate = value;
	}

	@OneToMany(mappedBy = "customTariffNumber")
	private List<Article> article;

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}

	public CustomTariffNumbers(int CTN_Id_, String CTN_Code_, String CTN_Description_,
			java.sql.Timestamp CTN_CreateDate_, java.sql.Timestamp CTN_UpdateDate_) {
		this.CTN_Id = CTN_Id_;
		this.CTN_Code = CTN_Code_;
		this.CTN_Description = CTN_Description_;
		this.CTN_CreateDate = CTN_CreateDate_;
		this.CTN_UpdateDate = CTN_UpdateDate_;
	}

	public CustomTariffNumbers() {

	}
	
	@Override
	public String toString() {
		return CTN_Code;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		CustomTariffNumbers customTariffNumbers = (CustomTariffNumbers) o;
		return Objects.equals(CTN_Id, customTariffNumbers.CTN_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(CTN_Id, CTN_Code, CTN_Description, CTN_CreateDate);
	}
}
