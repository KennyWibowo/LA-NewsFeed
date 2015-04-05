package com.util;

import java.util.*;

import net.billylieurance.azuresearch.AbstractAzureSearchQuery.AZURESEARCH_QUERYTYPE;
import net.billylieurance.azuresearch.AbstractAzureSearchResult;
import net.billylieurance.azuresearch.AzureSearchCompositeQuery;
import net.billylieurance.azuresearch.AzureSearchResultSet;


public class ImportanceSetter {

	private final String API_KEY = "B1rIpd+rFK8Rd3St15JWSGF7Kbq8vhlE5u20z1Iu7SQ";
	private final int UPPER_LIMIT = 1500000;
          public ImportanceSetter()
          {

          }
	
	public  void setImportance(ArrayList<Article> a) {
            for(int i = 0;  i < a.size(); i++)
            {
               a.get(i).setPriority(searchImportance(a.get(i).getTitle()));
            }

	}
	
	private int searchImportance(String sentence) {
		
		AzureSearchCompositeQuery  aq = new AzureSearchCompositeQuery();

		aq.setAppid(API_KEY);
		aq.setQuery(sentence);
		aq.setSources( new AZURESEARCH_QUERYTYPE[] { AZURESEARCH_QUERYTYPE.WEB } );
		aq.doQuery();
		
		AzureSearchResultSet<AbstractAzureSearchResult> ars = aq.getQueryResult();

		return (int)ars.getWebTotal();
			
	}
}
