package com.teamsankya.naturebandhuproject.dto;


	import java.io.Serializable;
	import java.util.List;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;

	@Entity
	@Table(name="Product_Category")
	public class ProductCategoryBean implements Serializable {

		@Id
		@Column(name="category_id",nullable=false)
		private int categoryId;
		@Column(name="category_name",nullable=false)
		private String categoryName;
		@OneToMany(cascade=CascadeType.ALL,mappedBy="productCategoryBean")
		private List<ProductDetailsBean> productDetailsBean;
		@Override
		public String toString() {
			return "ProductCategoryBean [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
		}
		public int getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public List<ProductDetailsBean> getProductDetailsBean() {
			return productDetailsBean;
		}
		public void setProductDetailsBean(List<ProductDetailsBean> productDetailsBean) {
			this.productDetailsBean = productDetailsBean;
		}
		
	}

