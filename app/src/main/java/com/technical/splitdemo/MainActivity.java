package com.technical.splitdemo;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


        @Override
        public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
                super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
        }

        @Override
        public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
                super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


                if(isInMultiWindowMode()){

                        //the user is in mulltimedia mode
                }

                if(isInPictureInPictureMode()){


                        // the user is in picture in picture mode
                }



        }
}
