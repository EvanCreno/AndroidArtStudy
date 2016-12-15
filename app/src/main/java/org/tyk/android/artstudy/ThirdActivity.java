package org.tyk.android.artstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    private MyCircleImageView myCircleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        init();
    }

    private void init() {
        myCircleImageView = (MyCircleImageView) findViewById(R.id.my_circle_img);
    }
}
