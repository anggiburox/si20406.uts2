package com.example.aplikasitodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url = "file:///android_asset/index.html"; //Pendefinisian URL
        WebView view = (WebView) this.findViewById(R.id.webview); //sinkronisasi object berdasarkan id
        view.getSettings().setJavaScriptEnabled(true); //untuk mengaktifkan javascript
        view.loadUrl(url); //agar URL terload saat dibuka aplikasi
        view.setWebViewClient(new MyBrowser());
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}