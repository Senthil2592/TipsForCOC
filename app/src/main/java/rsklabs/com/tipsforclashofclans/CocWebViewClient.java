package rsklabs.com.tipsforclashofclans;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Kumar on 11/15/2015.
 */
public class CocWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return false;
    }



}
