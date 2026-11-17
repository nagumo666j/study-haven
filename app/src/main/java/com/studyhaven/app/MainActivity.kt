package com.studyhaven.app

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.rgb(16, 19, 33)
        window.navigationBarColor = Color.rgb(16, 19, 33)
        window.decorView.systemUiVisibility = 0

        webView = WebView(this).apply {
            setBackgroundColor(Color.rgb(16, 19, 33))
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.allowFileAccess = true
            settings.javaScriptCanOpenWindowsAutomatically = false
            webChromeClient = WebChromeClient()
            webViewClient = WebViewClient()
        }
        setContentView(webView)
        webView.loadUrl("file:///android_asset/index.html")
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (::webView.isInitialized) {
            webView.evaluateJavascript(
                "(function(){var cinema=document.getElementById('cinema');if(cinema&&cinema.classList.contains('show')){skipCutscene();return true;}var active=document.querySelector('.screen.active');if(active&&active.id!=='home'){go('home');return true;}return false;})()"
            ) { handled ->
                if (handled != "true") super.onBackPressed()
            }
        } else {
            super.onBackPressed()
        }
    }
}
