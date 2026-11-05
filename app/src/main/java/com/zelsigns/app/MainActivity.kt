package com.zelsigns.app

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.View
import android.view.animation.AlphaAnimation
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity.kt
 * Synthesized by Sign Zel AI Cloud APK Builder
 * App: Hill Dash
 * Package: com.zelsigns.app
 */
class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var splashOverlay: LinearLayout

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rootFrame = FrameLayout(this).apply {
            setBackgroundColor(Color.parseColor("#0B0F17"))
        }

        // 1. Hardware-Accelerated App WebView Container
        webView = WebView(this).apply {
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.allowFileAccess = true
            settings.allowContentAccess = true
            settings.mediaPlaybackRequiresUserGesture = false
            settings.cacheMode = WebSettings.LOAD_DEFAULT
            webViewClient = WebViewClient()
            webChromeClient = WebChromeClient()
            setBackgroundColor(Color.parseColor("#0B0F17"))
        }

        webView.loadUrl("file:///android_asset/index.html")

        rootFrame.addView(
            webView,
            FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        )

        // 2. Starting Splash Screen (AI-Synthesized)
        splashOverlay = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#0B0F17"))
            setPadding(64, 64, 64, 64)

            val badgeText = TextView(context).apply {
                text = "Z"
                textSize = 44f
                typeface = Typeface.create("sans-serif-black", Typeface.BOLD)
                setTextColor(Color.parseColor("#6366F1"))
                gravity = Gravity.CENTER
            }

            val titleView = TextView(context).apply {
                text = "Ride the Rolling Hills!"
                textSize = 26f
                typeface = Typeface.DEFAULT_BOLD
                setTextColor(Color.WHITE)
                gravity = Gravity.CENTER
                setPadding(0, 24, 0, 12)
            }

            val subtitleView = TextView(context).apply {
                text = "Conquer the terrain and climb to the top!"
                textSize = 14f
                setTextColor(Color.parseColor("#94A3B8"))
                gravity = Gravity.CENTER
                setPadding(0, 0, 0, 40)
            }

            val progress = ProgressBar(context).apply {
                isIndeterminate = true
            }

            addView(badgeText)
            addView(titleView)
            addView(subtitleView)
            addView(progress)
        }

        if (true) {
            rootFrame.addView(
                splashOverlay,
                FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT,
                    FrameLayout.LayoutParams.MATCH_PARENT
                )
            )

            Handler(Looper.getMainLooper()).postDelayed({
                val fadeOut = AlphaAnimation(1f, 0f).apply {
                    duration = 400
                    fillAfter = true
                }
                splashOverlay.startAnimation(fadeOut)
                splashOverlay.visibility = View.GONE
            }, 1800L)
        }

        setContentView(rootFrame)
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (this::webView.isInitialized && webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }

    companion object {
        private const val DEFAULT_SIGN_ZEL_PORTAL_HTML = """
            <!DOCTYPE html>
            <html>
            <head>
              <meta name="viewport" content="width=device-width, initial-scale=1.0">
              <style>
                body { background: #0B0F17; color: #F8FAFC; font-family: system-ui, sans-serif; display: flex; align-items: center; justify-content: center; height: 100vh; margin: 0; text-align: center; }
                .card { padding: 28px; border-radius: 16px; background: #131B2E; border: 1px solid #26334D; max-width: 340px; }
                h1 { color: #6366F1; margin-bottom: 8px; }
                p { color: #94A3B8; font-size: 14px; line-height: 1.5; }
              </style>
            </head>
            <body>
              <div class="card">
                <h1>Hill Dash</h1>
                <p>Built &amp; Compiled with Sign Zel AI Android Workflow Studio.</p>
              </div>
            </body>
            </html>
        """
    }
}
