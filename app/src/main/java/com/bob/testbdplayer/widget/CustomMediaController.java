package com.bob.testbdplayer.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bob.testbdplayer.R;

/**
 * Created by dell on 2017/9/8.
 */

public class CustomMediaController extends RelativeLayout implements View.OnClickListener {

    private final  static  String TAG="CustomMediaController";

    private ImageButton playBtn;
    private BDCloudVideoView videoView;
    private TextView tv_position;
    private  TextView  tv_duration;



    public CustomMediaController(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        initUI();
    }

    public  CustomMediaController(Context context){
       super(context);
       initUI();
    }

    public void initUI(){
        LayoutInflater inflater =(LayoutInflater)this.getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View  view=inflater.inflate(R.layout.bar_simple_media_controller,this);
        playBtn=(ImageButton) view.findViewById(R.id.btn_play);
        playBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(videoView==null){
                    Log.d(TAG,"the videoView  is null ");
                }else{
                    if(videoView.isPlaying()){
                        playBtn.setBackgroundResource(R.drawable.toggle_btn_play);
                        videoView.pause();
                    }else{
                        playBtn.setBackgroundResource(R.drawable.toggle_btn_pause);
                        videoView.start();
                    }
                }
            }
        });

    }


    @Override
    public void onClick(View v) {

    }
}
