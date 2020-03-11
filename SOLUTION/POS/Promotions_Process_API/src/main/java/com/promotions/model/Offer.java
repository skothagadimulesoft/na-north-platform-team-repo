package com.promotions.model;

import java.util.ArrayList;
import java.util.List;

public class Offer 
{
	private String productID;
	private String productName;
	private String offerType;
	private String offerAction;
	private String discountValue;
	private List <RelatedProductOffer> relatedProducts;
	
	
	public Offer()
	{
		
	}
	
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public String getOfferAction() {
		return offerAction;
	}
	public void setOfferAction(String offerAction) {
		this.offerAction = offerAction;
	}
	public String getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}
	public List<RelatedProductOffer> getRelatedProducts() {
		return relatedProducts;
	}
	public void setRelatedProducts(List<RelatedProductOffer> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}
	

}
