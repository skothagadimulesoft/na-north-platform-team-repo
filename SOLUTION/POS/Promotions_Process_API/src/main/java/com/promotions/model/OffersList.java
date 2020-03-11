package com.promotions.model;

import java.util.List;
import java.util.ArrayList;

public class OffersList 
{
	
	private ArrayList<Offer> offers;
	private String offerListName;
	
	public OffersList()
	{
	}
	
	

	public String getOfferListName() {
		return offerListName;
	}

	public void setOfferListName(String offerListName) {
		this.offerListName = offerListName;
	}

	public ArrayList getOffers() {
		return offers;
	}

	public void setOffers(ArrayList offers) {
		this.offers = offers;
	}
	
}
