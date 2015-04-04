package com.util;

public class Links{
   public static ArrayList<typeLink> links;

   public Links()
   {
      if(links == null)
      {
         links = new ArrayList<typeLink>;
      }
   }
   public addLink(String l, String name)
   {
      if(!links.contains(new typeLink(i,name)))
      {
         links.add(new typeLink(i,name));
      }
   }
   public removeLink(String l);
   {
      if(links.contains(new typeLink(i,name)))
      {
         links.remove(new typeLink(i,name));
      }
   }
}