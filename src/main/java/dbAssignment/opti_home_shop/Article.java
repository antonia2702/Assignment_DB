package dbAssignment.opti_home_shop;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "article")
public class Article {
	@Id
	@Column(name = "A_Id")
	private int A_Id;

	public int getA_Id() {
		return this.A_Id;
	}

	public void setA_Id(int value) {
		this.A_Id = value;
	}

	@Column
	private String A_ArticleNo;

	public String getA_ArticleNo() {
		return this.A_ArticleNo;
	}

	public void setA_ArticleNo(String value) {
		this.A_ArticleNo = value;
	}

	@Column
	private String A_ManufacturerArtNo;

	public String getA_ManufacturerArtNo() {
		return this.A_ManufacturerArtNo;
	}

	public void setA_ManufacturerArtNo(String value) {
		this.A_ManufacturerArtNo = value;
	}

	@Column
	private byte A_Active;

	public byte getA_Active() {
		return this.A_Active;
	}

	public void setA_Active(byte value) {
		this.A_Active = value;
	}

	@Column
	private String A_Name;

	public String getA_Name() {
		return this.A_Name;
	}

	public void setA_Name(String value) {
		this.A_Name = value;
	}

	@Column
	private String A_Description;

	public String getA_Description() {
		return this.A_Description;
	}

	public void setA_Description(String value) {
		this.A_Description = value;
	}

	@Column
	private String A_DeliveryTime;

	public String getA_DeliveryTime() {
		return this.A_DeliveryTime;
	}

	public void setA_DeliveryTime(String value) {
		this.A_DeliveryTime = value;
	}

	@Column
	private float A_PurchasingPrice;

	public float getA_PurchasingPrice() {
		return this.A_PurchasingPrice;
	}

	public void setA_PurchasingPrice(float value) {
		this.A_PurchasingPrice = value;
	}

	@Column
	private float A_SellingPrice;

	public float getA_SellingPrice() {
		return this.A_SellingPrice;
	}

	public void setA_SellingPrice(float value) {
		this.A_SellingPrice = value;
	}

	@Column
	private int AI_Id;

	public int getAI_Id() {
		return this.AI_Id;
	}

	public void setAI_Id(int value) {
		this.AI_Id = value;
	}

	@Column
	private int AG_Id;

	public int getAG_Id() {
		return this.AG_Id;
	}

	public void setAG_Id(int value) {
		this.AG_Id = value;
	}

	@Column
	private int SUP_Id;

	public int getSUP_Id() {
		return this.SUP_Id;
	}

	public void setSUP_Id(int value) {
		this.SUP_Id = value;
	}

	@Column
	private int STOR_Id;

	public int getSTOR_Id() {
		return this.STOR_Id;
	}

	public void setSTOR_Id(int value) {
		this.STOR_Id = value;
	}

	@Column
	private int DG_Id;

	public int getDG_Id() {
		return this.DG_Id;
	}

	public void setDG_Id(int value) {
		this.DG_Id = value;
	}

	@Column
	private int CTN_Id;

	public int getCTN_Id() {
		return this.CTN_Id;
	}

	public void setCTN_Id(int value) {
		this.CTN_Id = value;
	}

	@Column
	private java.sql.Timestamp A_CreateDate;

	public java.sql.Timestamp getA_CreateDate() {
		return this.A_CreateDate;
	}

	public void setA_CreateDate(java.sql.Timestamp value) {
		this.A_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp A_UpdateDate;

	public java.sql.Timestamp getA_UpdateDate() {
		return this.A_UpdateDate;
	}

	public void setA_UpdateDate(java.sql.Timestamp value) {
		this.A_UpdateDate = value;
	}

	@OneToMany(mappedBy = "article")
	private List<ArticleRating> articleRatings;

	public List<ArticleRating> getArticleRatings() {
		return articleRatings;
	}

	public void setArticleRatings(List<ArticleRating> articleRating) {
		this.articleRatings = articleRating;
	}

	@OneToMany(mappedBy = "article")
	private List<Wishlist> wishlists;

	public List<Wishlist> getWishlists() {
		return wishlists;
	}

	public void setWishlists(List<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}

	@OneToMany(mappedBy = "article")
	private List<Cart> carts;

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DG_Id")
	private DangerousGoods dangerousGood;

	public DangerousGoods getDangerousGood() {
		return dangerousGood;
	}

	public void setDangerousGood(DangerousGoods dangerousGood) {
		this.dangerousGood = dangerousGood;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUP_Id")
	private Supplier supplier;

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AI_Id")
	private ArticleInventory articleInventory;

	public ArticleInventory getArticleInventory() {
		return articleInventory;
	}

	public void setArticleInventory(ArticleInventory articleInventory) {
		this.articleInventory = articleInventory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AG_Id")
	private ArticleGroup articleGroup;

	public ArticleGroup getArticleGroup() {
		return articleGroup;
	}

	public void setArticleGroup(ArticleGroup articleGroup) {
		this.articleGroup = articleGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTN_Id")
	private CustomTariffNumbers customTariffNumber;

	public CustomTariffNumbers getCustomTariffNumber() {
		return customTariffNumber;
	}

	public void setCustomTariffNumber(CustomTariffNumbers customTariffNumber) {
		this.customTariffNumber = customTariffNumber;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STOR_Id")
	private Storage storage;

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public Article(int A_Id_, String A_ArticleNo_, String A_ManufacturerArtNo_, byte A_Active_, String A_Name_,
			String A_Description_, String A_DeliveryTime_, float A_PurchasingPrice_, float A_SellingPrice_, int AI_Id_,
			int AG_Id_, int SUP_Id_, int STOR_Id_, int DG_Id_, int CTN_Id_, java.sql.Timestamp A_CreateDate_,
			java.sql.Timestamp A_UpdateDate_) {
		this.A_Id = A_Id_;
		this.A_ArticleNo = A_ArticleNo_;
		this.A_ManufacturerArtNo = A_ManufacturerArtNo_;
		this.A_Active = A_Active_;
		this.A_Name = A_Name_;
		this.A_Description = A_Description_;
		this.A_DeliveryTime = A_DeliveryTime_;
		this.A_PurchasingPrice = A_PurchasingPrice_;
		this.A_SellingPrice = A_SellingPrice_;
		this.AI_Id = AI_Id_;
		this.AG_Id = AG_Id_;
		this.SUP_Id = SUP_Id_;
		this.STOR_Id = STOR_Id_;
		this.DG_Id = DG_Id_;
		this.CTN_Id = CTN_Id_;
		this.A_CreateDate = A_CreateDate_;
		this.A_UpdateDate = A_UpdateDate_;
	}

	public Article() {
	}

	@Override
	public String toString() {
		return A_Name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Article article = (Article) o;
		return Objects.equals(A_Id, article.A_Id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(A_Id, A_Name, A_CreateDate, A_UpdateDate);
	}
}
