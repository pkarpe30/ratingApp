package com.codingpee.teacher_assessment;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.RatingBar;
import android.widget.VideoView;

public class Teacher3 extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher3);

        MediaController mediaController = new MediaController(this);

        videoView = findViewById(R.id.videoView2);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video2;
        Uri videoUri = Uri.parse(videoPath);
        videoView.setVideoURI(videoUri);
        videoView.start();
        RatingBar rt = (RatingBar) findViewById(R.id.rt2);
        float value1 = rt.getRating();


    }
    private void playVideo() {
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video2;
        Uri videoUri = Uri.parse(videoPath);

        videoView.setVideoURI(videoUri);
        videoView.start();

    }



}
