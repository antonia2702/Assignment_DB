package dbAssignment.opti_home_shop;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@javax.persistence.Entity
@Table(name = "article")
public class Article {
	@Id
	@Column(name = "A_Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int A_Id;

	public int getA_Id() {
		return this.A_Id;
	}

	public void setA_Id(int value) {
		this.A_Id = value;
	}

	@Column(nullable = false)
	private String A_ArticleNo;

	public String getA_ArticleNo() {
		return this.A_ArticleNo;
	}

	public void setA_ArticleNo(String value) {
		this.A_ArticleNo = value;
	}

	@Column(nullable = false)
	private String A_ManufacturerArtNo;

	public String getA_ManufacturerArtNo() {
		return this.A_ManufacturerArtNo;
	}

	public void setA_ManufacturerArtNo(String value) {
		this.A_ManufacturerArtNo = value;
	}

	@Column(nullable = false)
	private byte A_Active;

	public byte getA_Active() {
		return this.A_Active;
	}

	public void setA_Active(byte value) {
		this.A_Active = value;
	}

	@Column(nullable = false)
	private String A_Name;

	public String getA_Name() {
		return this.A_Name;
	}

	public void setA_Name(String value) {
		this.A_Name = value;
	}

	@Column(nullable = false)
	private String A_Description;

	public String getA_Description() {
		return this.A_Description;
	}

	public void setA_Description(String value) {
		this.A_Description = value;
	}

	@Column(nullable = false)
	private String A_DeliveryTime;

	public String getA_DeliveryTime() {
		return this.A_DeliveryTime;
	}

	public void setA_DeliveryTime(String value) {
		this.A_DeliveryTime = value;
	}

	@Column(nullable = false)
	private float A_PurchasingPrice;

	public float getA_PurchasingPrice() {
		return this.A_PurchasingPrice;
	}

	public void setA_PurchasingPrice(float value) {
		this.A_PurchasingPrice = value;
	}

	@Column(nullable = false)
	private float A_SellingPrice;

	public float getA_SellingPrice() {
		return this.A_SellingPrice;
	}

	public void setA_SellingPrice(float value) {
		this.A_SellingPrice = value;
	}

	@CreationTimestamp
	@Column(nullable = false)
	private java.sql.Timestamp A_CreateDate;

	public java.sql.Timestamp getA_CreateDate() {
		return this.A_CreateDate;
	}

	public void setA_CreateDate(java.sql.Timestamp value) {
		this.A_CreateDate = value;
	}

	@UpdateTimestamp
	@Column(nullable = false)
	private java.sql.Timestamp A_UpdateDate;

	public java.sql.Timestamp getA_UpdateDate() {
		return this.A_UpdateDate;
	}

	public void setA_UpdateDate(java.sql.Timestamp value) {
		this.A_UpdateDate = value;
	}

	@OneToMany(mappedBy = "article", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<ArticleRating> articleRatings;

	public List<ArticleRating> getArticleRatings() {
		return articleRatings;
	}

	public void setArticleRatings(List<ArticleRating> articleRating) {
		this.articleRatings = articleRating;
	}

	@OneToMany(mappedBy = "article", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Wishlist> wishlists;

	public List<Wishlist> getWishlists() {
		return wishlists;
	}

	public void setWishlists(List<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}

	@OneToMany(mappedBy = "article", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Cart> carts;

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "DG_Id", nullable = false)
	private DangerousGoods dangerousGood;

	public DangerousGoods getDangerousGood() {
		return dangerousGood;
	}

	public void setDangerousGood(DangerousGoods dangerousGood) {
		this.dangerousGood = dangerousGood;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "SUP_Id", nullable = false)
	private Supplier supplier;

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "AI_Id", nullable = false)
	private ArticleInventory articleInventory;

	public ArticleInventory getArticleInventory() {
		return articleInventory;
	}

	public void setArticleInventory(ArticleInventory articleInventory) {
		this.articleInventory = articleInventory;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "AG_Id", nullable = false)
	private ArticleGroup articleGroup;

	public ArticleGroup getArticleGroup() {
		return articleGroup;
	}

	public void setArticleGroup(ArticleGroup articleGroup) {
		this.articleGroup = articleGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "CTN_Id", nullable = false)
	private CustomTariffNumbers customTariffNumber;

	public CustomTariffNumbers getCustomTariffNumber() {
		return customTariffNumber;
	}

	public void setCustomTariffNumber(CustomTariffNumbers customTariffNumber) {
		this.customTariffNumber = customTariffNumber;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "STOR_Id", nullable = false)
	private Storage storage;

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public Article(String A_ArticleNo_, String A_ManufacturerArtNo_, byte A_Active_, String A_Name_,
			String A_Description_, String A_DeliveryTime_, float A_PurchasingPrice_, float A_SellingPrice_,
			DangerousGoods dangerousGood,Supplier supplier, ArticleInventory articleInventory,
			ArticleGroup articleGroup,CustomTariffNumbers customTariffNumber, Storage storage) {
		this.A_ArticleNo = A_ArticleNo_;
		this.A_ManufacturerArtNo = A_ManufacturerArtNo_;
		this.A_Active = A_Active_;
		this.A_Name = A_Name_;
		this.A_Description = A_Description_;
		this.A_DeliveryTime = A_DeliveryTime_;
		this.A_PurchasingPrice = A_PurchasingPrice_;
		this.A_SellingPrice = A_SellingPrice_;
		this.dangerousGood = dangerousGood;
		this.supplier = supplier;
		this.articleInventory = articleInventory;
		this.articleGroup = articleGroup;
		this.customTariffNumber = customTariffNumber;
		this.storage = storage;
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
