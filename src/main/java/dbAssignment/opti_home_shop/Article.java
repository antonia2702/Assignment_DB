package dbAssignment.opti_home_shop;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="article")
public class Article{
	@Column
	private String A_ArticleNo;
	@Column
	private String A_ManufacturerArtNo;
	@Column
	private String A_Name;
	@Column
	private String A_DeliveryTime;
	@Column
	private double A_PurchasingPrice;
	@Column
	private double A_SellingPrice;
	@Id
	@Column (name = "A_Id")
	private int A_Id;
	@Column
	private int AI_Id;
	@Column
	private int AG_Id;
	@Column
	private int SUP_Id;
	@Column
	private int STOR_Id;
	@Column
	private int DG_Id;
	@Column
	private int CTN_Id;
	@Column
	private java.util.Date A_CreateDate;
	@Column
	private java.util.Date A_UpdateDate;

	public int getA_Id() {
		return A_Id;
	}

	public void setA_Id(int a_Id) {
		A_Id = a_Id;
	}
	
	public String getA_articleno(){
		return A_ArticleNo;
	}

	public void setA_articleno(String A_ArticleNo){
		this.A_ArticleNo=A_ArticleNo;
	}

	public String getA_manufacturerartno(){
		return A_ManufacturerArtNo;
	}

	public void setA_manufacturerartno(String A_ManufacturerArtNo){
		this.A_ManufacturerArtNo=A_ManufacturerArtNo;
	}

	public String getA_name(){
		return A_Name;
	}

	public void setA_name(String A_Name){
		this.A_Name=A_Name;
	}

	public String getA_deliverytime(){
		return A_DeliveryTime;
	}

	public void setA_deliverytime(String A_DeliveryTime){
		this.A_DeliveryTime=A_DeliveryTime;
	}

	public double getA_purchasingprice(){
		return A_PurchasingPrice;
	}

	public void setA_purchasingprice(double A_PurchasingPrice){
		this.A_PurchasingPrice=A_PurchasingPrice;
	}

	public double getA_sellingprice(){
		return A_SellingPrice;
	}

	public void setA_sellingprice(double A_SellingPrice){
		this.A_SellingPrice=A_SellingPrice;
	}

	public int getAi_id(){
		return AI_Id;
	}

	public void setAi_id(int AI_Id){
		this.AI_Id=AI_Id;
	}

	public int getAg_id(){
		return AG_Id;
	}

	public void setAg_id(int AG_Id){
		this.AG_Id=AG_Id;
	}

	public int getSup_id(){
		return SUP_Id;
	}

	public void setSup_id(int SUP_Id){
		this.SUP_Id=SUP_Id;
	}

	public int getStor_id(){
		return STOR_Id;
	}

	public void setStor_id(int STOR_Id){
		this.STOR_Id=STOR_Id;
	}

	public int getDg_id(){
		return DG_Id;
	}

	public void setDg_id(int DG_Id){
		this.DG_Id=DG_Id;
	}

	public int getCtn_id(){
		return CTN_Id;
	}

	public void setCtn_id(int CTN_Id){
		this.CTN_Id=CTN_Id;
	}

	public java.util.Date getA_createdate(){
		return A_CreateDate;
	}

	public void setA_createdate(java.util.Date A_CreateDate){
		this.A_CreateDate=A_CreateDate;
	}

	public java.util.Date getA_updatedate(){
		return A_UpdateDate;
	}

	public void setA_updatedate(java.util.Date A_UpdateDate){
		this.A_UpdateDate=A_UpdateDate;
	}
}
