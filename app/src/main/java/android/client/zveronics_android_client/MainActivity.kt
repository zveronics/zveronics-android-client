package android.client.zveronics_android_client

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.net.URL

class MainActivity : AppCompatActivity(), TextProcessor {
    private val viewOut: TextView
        get() = findViewById(R.id.text_view)

    override fun process(text: String) {
        viewOut.text = text
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wt = WebThread(this)
        wt.execute(URL("https:/pornhub.com"))
    }
}
