package android.client.zveronics_android_client

import android.os.AsyncTask
import java.net.URL

class WebThread(textProcessor: TextProcessor): AsyncTask<URL, Void, String>() {
    private val outputer = textProcessor

    override fun doInBackground(vararg p0: URL?): String? {
        return (p0[0])?.readText()
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        if (result != null) {
            outputer.process(result)
        } else {
            throw NullPointerException("no text processor specified")
        }
    }

}