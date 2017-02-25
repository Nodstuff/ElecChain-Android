package nodstuff.xyz.elecchain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String URL = getIntent().getStringExtra("PAGE_URL");

        WebView webview = (WebView) findViewById(R.id.webview);
        webview.loadUrl(URL);
        finish();
    }

}
