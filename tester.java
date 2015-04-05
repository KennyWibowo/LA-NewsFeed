mport java.util.ArrayList;

public class tester{
   public static void main(String [] args)
   {
       int first = 0;
       int second = 0;
       
       ArrayList<Article> articles = new ArrayList<Article>();
       Links link = new Links();
       NewsGetter news = new NewsGetter();
       link.addLink("http://rss.cnn.com/rss/cnn_topstories.rss", "CNN");
       link.addLink( "http://feeds.bbci.co.uk/news/rss.xml", "BBC" );
       link.addLink( "http://feeds.feedburner.com/techcrunch", "TechCrunch" );
       link.addLink( "http://feeds.feedburner.com/elise/simplyrecipes", "Simply Recipes" );
       
       while(true)
       {
       articles = news.getNews(5);
       System.out.println(articles.size());
       for(int i = 0; i < articles.size(); i++)
       {
               System.out.println(articles.get( i ));
       }
       try
       {
           Thread.sleep( 5000 );
       }
       catch ( InterruptedException e )
       {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
       }
       
   }
}
