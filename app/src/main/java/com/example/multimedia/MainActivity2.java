package com.example.multimedia;

import static com.example.multimedia.R.id.aa;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    WebView webView;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        VideoView videoView = (VideoView) findViewById(R.id.aa);

        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.coc));
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}