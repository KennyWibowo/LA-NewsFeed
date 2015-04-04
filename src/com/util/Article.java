package com.util;

public class Article{
   public String title, description, link;
   public int priority;

   public Article( String t, String d, String l, int p)
   {
      title = t;
      description = d;
      link = l;
      priority = p;
   }

   public Article( String t, String d, String l)
   {
      title = t;
      description = d;
      link = l;
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
}