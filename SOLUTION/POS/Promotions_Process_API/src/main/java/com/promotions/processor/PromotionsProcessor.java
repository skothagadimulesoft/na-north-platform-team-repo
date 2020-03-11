package com.promotions.processor;

import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

import com.promotions.model.*;
import com.promotions.util.Utils;

/**
 * This is a sample class to launch a rule.
 */
public class PromotionsProcessor {
	
	private static boolean initialized =false;
	private static PromotionsProcessor processor;
	private static KieSession kSession;
	private static ArrayList respList = new ArrayList();

	
	public PromotionsProcessor()
	{
		init();
	}
	public PromotionsProcessor(ArrayList offers)
	{
		OffersList _list = Utils.getInstance().transformIntoOffersList(offers);
		init(_list);
	}
	
	public static void initPromotionsEngine(ArrayList offers)
	{
		OffersList _list = Utils.getInstance().transformIntoOffersList(offers);
		init(_list);
	}
	
	private static void init(OffersList pList)
	{
		if(!initialized)
		{
			System.out.println("-----Initializing Promotions Engine-------");
			/*
			 KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(); 
			 kbuilder.add(ResourceFactory.newClassPathResource("rules/Promotions.drl"), ResourceType.DRL);
		     KieServices kieServices = KieServices.Factory.get();
		     KieContainer kContainer = kieServices.getKieClasspathContainer();
		     KieSession kSession = kContainer.newKieSession("ksession-rules-promotions");
		     //KieSession kSession = kContainer.newKieSession();
		     */
			
			
			KieServices ks = KieServices.Factory.get();
	 	    KieContainer kContainer = ks.getKieClasspathContainer();
	 	    //KieContainer kContainer = ks.newKieClasspathContainer();
	     	kSession = kContainer.newKieSession("ksession-rules-promotions");
	     
	     	
	     	kSession.setGlobal("GlobalResponseList", respList);
	     	System.out.println("---initializing Offer List ----");
	     	kSession.insert(pList);
	     	
	     	initialized=true;
		}
		else
			System.out.println("-----Promotions Engine already Initialized !-------");
	}
	
	private static void init()
	{
		KieServices ks = KieServices.Factory.get();
 	    KieContainer kContainer = ks.getKieClasspathContainer();
     	kSession = kContainer.newKieSession("ksession-rules-promotions");
     	
     	kSession.setGlobal("GlobalResponseList", respList);
     	System.out.println("---initializing Offer List ----");
     	Utils _utils = Utils.getInstance();
     	OffersList _offersList = _utils.getOffersList();
     	kSession.insert(_offersList);
     	
     	initialized=true;
	}
	

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	    KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules-promotions");
        	
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    
    public static PromotionResponse getPromotionSingleProduct(PromotionRequest pReq)
    {
    	
    		PromotionResponse resp=null;
    		
    		try {
    			
    			if(!initialized)
    				init();
    		    
    				System.out.println("-----Asserting values ------");
    				System.out.println("-StationID:"+pReq.getStationID());
    				System.out.println("-CustomerID:"+pReq.getCustomerID());
    				System.out.println("-ProductType:"+pReq.getProductType());
    				System.out.println("-ProductName:"+pReq.getProductName());
    				System.out.println("-ProductType:"+pReq.getProductType());
    	         
				 kSession.insert(pReq);
	             kSession.fireAllRules();
    		            
	             
	             //-----getGlobal Variables------
	             System.out.println("--RespList siae ="+ respList.size());
	             resp = (PromotionResponse) respList.get(0);
	             respList.remove(0);
    		             
    		             
    		            // kSession.dispose();
    			    } 
    					catch (Throwable t) {
    					t.printStackTrace();
    					}
    		
    		return resp;
        	
	             
    }
    
    public static PromotionResponse getPromotionMulitpleProduct(PromotionRequest pReq)
    {
    		PromotionResponse resp=null;
    		
    		try {
    			
		    		if(!initialized)
		    			init();
    		} 
		catch (Throwable t) {
		t.printStackTrace();
		}
    		
    		
    		return resp;
    }

}
