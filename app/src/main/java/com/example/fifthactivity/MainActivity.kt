package com.example.fifthactivity

import android.content.Context
import android.net.Uri
import android.net.Uri.parse
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView: VideoView = findViewById(R.id.video_view)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val uri: Uri = parse("android.resource://" + getPackageName() + "/" + R.raw.zimablue)

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }

    fun onStartClick(view: View?) {
        val videoView: VideoView = findViewById(R.id.video_view)
        videoView.start()
    }

    fun onPauseClick(view: View?) {
        val videoView: VideoView = findViewById(R.id.video_view)
        videoView.pause()
    }

    fun onStopClick(view: View?) {
        val videoView: VideoView = findViewById(R.id.video_view)
        videoView.stopPlayback()
        videoView.resume()
    }
}

