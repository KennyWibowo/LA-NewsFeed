package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import android.os.AsyncTask;

public class RSSReader {

	public ArrayList<Article> reader(typeLink l) {
		try {
			ArrayList<Article> articles = new ArrayList<Article>();
			URL url = new URL(l.url);
			BufferedReader e = new BufferedReader(new InputStreamReader(
					url.openStream()));
			String input;
			String store1 = "";
			String store2 = "";
			String store3 = "";
			boolean titleExists = false;
			boolean linkExists = false;
			boolean descriptionExists = false;
			while ((input = e.readLine()) != null) {

				if (input.contains("<title>")) {
					int beg = input.indexOf("<title>");
					int end = input.indexOf("</title>");
					store1 = input.substring(beg + 7, end);

					titleExists = true;
				} else if (input.contains("<link>")) {
					int beg = input.indexOf("<link>");
					int end = input.indexOf("</link>");
					store2 = input.substring(beg + 6, end);

					linkExists = true;
				} else if (input.contains("<description>")) {
					int beg = input.indexOf("<description>");
					if (input.contains("</description>")) {
						int end = input.indexOf("</description>");
						store3 = input.substring(beg + 13, end);
					} else {
						store3 = input.substring(beg + 13);
					}

					descriptionExists = true;
				}

				if (titleExists && linkExists) {
					if (descriptionExists) {
						Article article = new Article(store1, store3, store2,
								l.sourceName);
						articles.add(article);
					}
					titleExists = false;
					linkExists = false;
					descriptionExists = false;

				}
			}
			return articles;
		} catch (MalformedURLException error) {
			System.out.println("Check the URL");
		} catch (IOException problem) {
			System.out.println("OOPS! Something went wrong");
		}
		return null;
	}

}