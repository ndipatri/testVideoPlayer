package ndipatri.com.testvideoplayer

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoView.setVideoURI(Uri.parse("rtsp://ers.evostream.com:5544/stream2"))
        videoView.setOnErrorListener({mediaPlayer: MediaPlayer, i: Int, i1: Int ->
            Log.d("MainActivity", "Error in MediaPlayer: $mediaPlayer")
        false})
        videoView.start()
    }
}
