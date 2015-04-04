package com.util;

public class Article{
   private String title, description, link, source;
   private int priority;

   public Article( String t, String d, String l, String s, int p)
   {
      title = t;
      description = d;
      link = l;
      priority = p;
      source = s;
   }

   public Article( String t, String d, String l, String s)
   {
      title = t;
      description = d;
      link = l;
      source = s;
   }

   public String getTitle()
   {
      return title;
   }

   public String getDescription()
   {
      return description;
   }

   public String getLink()
   {
      return link;
   }

   public int getPriority()
   {
      return priority;
   }

   public void setPriority(int p)
   {
      priority = p;
   }
   public String toString()
   {
       return source + " - " + title ;
   }
}