package com.bob.testbdplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bob.testbdplayer.widget.BDCloudVideoView;

public class MainActivity extends AppCompatActivity {

    private String ak = "00e139f964654c7f8068968d6004e66c"; // 请录入您的AK !!!
    private BDCloudVideoView  videoView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){

        videoView=(BDCloudVideoView)this.findViewById(R.id.bd_videoview);
        BDCloudVideoView.setAK(ak);

        videoView.setVideoPath("http://gslb.miaopai.com/stream/3D~8BM-7CZqjZscVBEYr5g__.mp4");

        videoView.start();
    }

}
