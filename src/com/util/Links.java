package com.util;

import java.util.ArrayList;

public class Links{
   public static ArrayList<typeLink> links;

   public Links()
   {
      if(links == null)
      {
         links = new ArrayList<typeLink>();
      }
   }
   public void addLink(String l, String name)
   {
      if(!links.contains(new typeLink(l,name)))
      {
         links.add(new typeLink(l,name));
      }
   }
   public  void removeLink(String l, String name)
   {
      if(links.contains(new typeLink(l,name)))
      {
         links.remove(new typeLink(l,name));
      }
   }
}