public class Links{
   public static ArrayList<String> links;

   public Links()
   {
      if(links == null)
      {
         links = new ArrayList<String>;
      }
   }
   public addLink(String l)
   {
      if(!links.contains(l))
      {
         links.add(l);
      }
   }
   public removeLink(String l);
   {
      if(link.contains(l))
      {
         links.remove(l);
      }
   }
}