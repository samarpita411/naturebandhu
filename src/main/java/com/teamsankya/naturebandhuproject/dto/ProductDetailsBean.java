package com.teamsankya.naturebandhuproject.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product_Details")
public class ProductDetailsBean implements Serializable {
	
	
	@Id
	@Column(name="product_id ")
	private int productId;
	@Column(name="product_name",nullable=false)
	private String productName;
	@Column(name="product_cost",precision=10,scale=0,nullable=false)
	private long productCost;
	@Column(name="product_color",nullable=false)
	private String productColor;
	@Column(name="product_brand",nullable=false)
	private String productBrand;
	@Column(name="product_warranty")
	private int warranty;
	@ManyToOne
	@JoinColumn(name="category_id",referencedColumnName="category_id",nullable=false)
	private ProductCategoryBean productCategoryBean;
	@Override
	public String toString() {
		return "ProductDetailsBean [productId=" + productId + ", productName=" + productName + ", productCost="
				+ productCost + ", productColor=" + productColor + ", productBrand=" + productBrand + ", warranty="
				+ warranty + ", productCategoryBean=" + productCategoryBean + "]";
	
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductCost() {
		return productCost;
	}
	public void setProductCost(long productCost) {
		this.productCost = productCost;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public ProductCategoryBean getProductCategoryBean() {
		return productCategoryBean;
	}
	public void setProductCategoryBean(ProductCategoryBean productCategoryBean) {
		this.productCategoryBean = productCategoryBean;
	}
	
	
	
}
