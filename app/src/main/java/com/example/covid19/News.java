package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class News extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://europarl.europa.eu/news/en/headlines/priorities/eu-response-to-coronavirus?gclid=Cj0KCQjwz4z3BRCgARIsAES_OVfZbL2bzwb5Kgl7yRU9e-zKz4orcuWyxPIYDKmWBA9Cjj9ffLC1YZgaAtg5EALw_wcB#xtor=SEC-77-[covid19]-[news]-[eu-response]-[EN]");


    }
}
