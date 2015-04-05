package com.util;

import java.util.ArrayList;

public class NewsGetter{
   public Links link;
   public RSSReader reader;
   public ArrayList<Article> articles;
   public ArrayList<Article> readerArticles;
   public ArrayList<Integer> articlesPerSource;
 
   public NewsGetter(){
      link = new Links();
      reader = new RSSReader();
      articles = new ArrayList<Article>();
      articlesPerSource = new ArrayList<Integer>();
   }

   public ArrayList<Article> getNews()
   {

       articles.clear();
      for(int i = 0;  i < link.links.size(); i++)
      {
         readerArticles = reader.reader(link.links.get(i));
         if(i >= articlesPerSource.size())
         {
            articlesPerSource.add(readerArticles.size());
         }
         else
         {
            articlesPerSource.add(i, readerArticles.size());
         }

         for(int j = 0; j<readerArticles.size(); j++)
         {
                articles.add(readerArticles.get(j));
            
         }
      }
      return articles;
   }
   
   public ArrayList<Article> getNews(int number)
   {

       articles.clear();
      for(int i = 0;  i < link.links.size(); i++)
      {
         readerArticles = reader.reader(link.links.get(i));
         if(i >= articlesPerSource.size())
         {
            articlesPerSource.add(readerArticles.size());
         }
         else
         {
            articlesPerSource.add(i, readerArticles.size());
         }

         for(int j = 0; j<number; j++)
         {
            if(j < readerArticles.size())
            {
                articles.add(readerArticles.get(j));
                
            }
         }
      }
      return articles;
   }
}