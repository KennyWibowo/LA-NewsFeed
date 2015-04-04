package com.util;

public class typeLink{
   public String url;
   public String sourceName;

   public typeLink(String u, String n)
   {
      url = u;
      sourceName = n;
   }

   public boolean equals(Object o)
   {
      if(o instanceof typeLink)
      {
         if(((typeLink)o).url == url && ((typeLink)o).sourceName == sourceName)
         {
            return true;
         }
      }
      return false;
   }
}