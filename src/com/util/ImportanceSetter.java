package com.util;

import java.util.*;

import net.billylieurance.azuresearch.AbstractAzureSearchQuery.AZURESEARCH_QUERYTYPE;
import net.billylieurance.azuresearch.AbstractAzureSearchResult;
import net.billylieurance.azuresearch.AzureSearchCompositeQuery;
import net.billylieurance.azuresearch.AzureSearchResultSet;


public class ImportanceSetter {

	private final String API_KEY = "B1rIpd+rFK8Rd3St15JWSGF7Kbq8vhlE5u20z1Iu7SQ";
	private final int UPPER_LIMIT = 550000;
	
	public ImportanceSetter() {

	}
/*	
	public static int ImportanceGenerator( Article ar ){
		StringTokenizer st = new StringTokenizer( ar.getTitle(), "!.?,;'\"/* " );
		int importance = 0;
		
		ArrayList<String> keywords = new ArrayList<String>();
		
		
		while( st.hasMoreTokens()) {
			String word = st.nextToken();
			
			if(keywords.contains())z
		}
			
		return importance; [
	}*/
	
	private long searchImportance(String sentence) {
		
		AzureSearchCompositeQuery  aq = new AzureSearchCompositeQuery();

		aq.setAppid(API_KEY);
		aq.setQuery(sentence);
		aq.setSources( new AZURESEARCH_QUERYTYPE[] { AZURESEARCH_QUERYTYPE.WEB } );
		aq.doQuery();
		
		AzureSearchResultSet<AbstractAzureSearchResult> ars = aq.getQueryResult();

		return ars.getWebTotal();
			
	}
}
