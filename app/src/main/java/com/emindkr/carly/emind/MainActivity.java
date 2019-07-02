package com.emindkr.carly.emind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); //새창열기 없이 웹뷰내에서 다시 열기
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); //자바스크립트 허용
        webSettings.setAppCacheEnabled(true);
        webView.clearCache(true);
        webView.loadUrl("http://emind.kr");

    }
}
