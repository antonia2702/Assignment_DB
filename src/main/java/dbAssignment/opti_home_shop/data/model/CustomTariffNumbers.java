package dbAssignment.opti_home_shop.data.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@javax.persistence.Entity
@Table(name = "customtariffnumbers")
public class CustomTariffNumbers {
	@Id
	@Column(name = "CTN_Id")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CTN_Id;

	public int getCTN_Id() {
		return this.CTN_Id;
	}

	@Column
	@NotNull
	private String CTN_Code;

	public String getCTN_Code() {
		return this.CTN_Code;
	}

	public void setCTN_Code(String value) {
		this.CTN_Code = value;
	}

	@Column
	@NotNull
	private String CTN_Description;

	public String getCTN_Description() {
		return this.CTN_Description;
	}

	public void setCTN_Description(String value) {
		this.CTN_Description = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp CTN_CreateDate;

	public java.sql.Timestamp getCTN_CreateDate() {
		return this.CTN_CreateDate;
	}

	@Column
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp CTN_UpdateDate;

	public java.sql.Timestamp getCTN_UpdateDate() {
		return this.CTN_UpdateDate;
	}

	@OneToMany(mappedBy = "customTariffNumber", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Article> article;

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}

	public CustomTariffNumbers(String CTN_Code_, String CTN_Description_) {
		this.CTN_Code = CTN_Code_;
		this.CTN_Description = CTN_Description_;
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
