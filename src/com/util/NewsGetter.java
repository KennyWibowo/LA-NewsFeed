package com.util;

import java.util.ArrayList;

public class NewsGetter{
   public Links link;
   public RSSReaderXML reader;
   public ArrayList<Article> articles;
   public ArrayList<Article> readerArticles;
   public ArrayList<Integer> articlesPerSource;
 
   public NewsGetter(){
      link = new Links();
      reader = new RSSReaderXML();
      articles = new ArrayList<Article>();
      articlesPerSource = new ArrayList<Integer>();
   }

   public ArrayList<Article> getNews()
   {
      for(int i = 0;  i < link.links.size(); i++)
      {

      }
   }
}