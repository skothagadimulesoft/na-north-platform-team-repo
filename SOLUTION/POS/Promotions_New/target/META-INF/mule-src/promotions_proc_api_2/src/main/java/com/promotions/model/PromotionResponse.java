package com.promotions.model;

import com.promotions.util.*;

public class PromotionResponse {
	
	private String promotionName;
	private String productName;
    private String productID;
    private String offer;
    private String offerType ;
	private String offerValue;
    
    public String getOfferValue() {
		return offerValue;
	}

	public void setOfferValue(String offerValue) {
		this.offerValue = offerValue;
	}

	public PromotionResponse()
    {
    	
    }
	
    public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public String getPromotionName() {
		return promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	

}
