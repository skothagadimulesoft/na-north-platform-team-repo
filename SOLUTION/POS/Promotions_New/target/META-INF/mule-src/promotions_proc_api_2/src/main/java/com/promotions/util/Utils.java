package com.promotions.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.promotions.model.*;
import  com.promotions.util.*;

public class Utils {
	
	private static Utils instance=null;
	
	public static enum PromotionType {
	    DISCOUNT_CURRENT_PRODUCT,
	    DISCOUNT_NEXT_PRODUCT,
	    FREE_RELATED_PRODUCT,
	    DISCOUNT_RELATED_PRODUCT
	   
	  }
	
	public Utils()
	{
		
	}
	
	public static Utils getInstance()
	{
		if(instance==null)
			instance = new Utils();
		
		return instance;
	}
	
	
	public OffersList getOffersList()
	{
		OffersList _offersList = new OffersList();
		_offersList.setOfferListName(Constants.OFFER_LIST_NAME);
		
		Offer _offer1 = new Offer();
		_offer1.setProductID("CK-123");
		_offer1.setProductName("Coke");
		_offer1.setOfferType(Constants.OFFER_TYPE_BUY_ONE_GET_ONE);
		_offer1.setOfferAction(Constants.OFFER_ACTION_DISCOUNT);
		_offer1.setDiscountValue("20");
		
		Offer _offer2 = new Offer();
		_offer2.setProductID("PSP-123");
		_offer2.setProductName("Pepsi");
		_offer2.setOfferType(Constants.OFFER_TYPE_BUY_ONE_GET_ONE);
		_offer2.setOfferAction(Constants.OFFER_ACTION_FREE);
		_offer2.setDiscountValue("0");
		
	
		
		ArrayList _list = new ArrayList();
		_list.add(_offer1);
		_list.add(_offer2);
		
		
		_offersList.setOffers(_list);
		
		return _offersList;
				
		
		/*
		{
			"ProductID":	"HD-123",
			"ProductName": "HotDog",
			"OfferType": "BOGA",
			"RelatedProducts":[
				{
					"ProductID":"FT-123",
					"ProductName":"FrittoLays"
				},
				{
					"ProductID":"DT-123",
					"ProductName":"Dorittos"
				}
				
			],
			"OfferAction":	"DISCOUNT",
			"DiscountValue":	"20"
			
		},
		{
			"ProductID":	"HD-123",
			"ProductName": "HotDog",
			"OfferType": "BOGA",
			"RelatedProducts":[
				{
					"ProductID":"FT-123",
					"ProductName":"FrittoLays"
				},
				{
					"ProductID":"DT-123",
					"ProductName":"Dorittos"
				}
				
			],
			"OfferAction":	"FREE",
			"DiscountValue":	"0"
			
		}
		*/
				
				
	}
	
	
	public static OffersList transformIntoOffersList (ArrayList offers)
	{
		OffersList _list = new OffersList();
		_list.setOfferListName(Constants.OFFER_LIST_NAME);
		_list.setOffers(offers);
		
		return _list;
		
	}
	
	

}
