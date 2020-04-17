package com.example.bytesizec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class FileInOut extends AppCompatActivity {
    Button clk;
    VideoView videov;
    MediaController mediaC;

    public Button quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_in_out);
        clk = (Button) findViewById(R.id.playbutton);
        videov = (VideoView) findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        quiz = (Button) findViewById(R.id.quizButton);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FileInOut.this,InOutQuiz.class);
                startActivity(intent);
            }
        });
    }

    public void videoplay (View v){
        String videopath = "android.resource://com.example.bytesizec/"+ R.raw.zoom_0;
        Uri uri= Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();
    }

}
