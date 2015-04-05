package com.util;

import com.app.la_newsfeed.R;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

public class DerpyListener implements OnClickListener {
	Activity a;
	String url;
	
	public DerpyListener( Activity a, String url ){
		this.a = a;
		this.url = new String( url );
	}
	
	@Override
	public void onClick(View v) {
		WebView browser = (WebView) a.findViewById(R.id.webview);
		browser.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
		browser.loadUrl(new String( url ));
	}
	
	
}
