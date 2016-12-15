package org.tyk.android.artstudy;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    private MyCircleImageView myCircleImageView;
    private ImageView img;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        init();
    }

    private void init() {
        myCircleImageView = (MyCircleImageView) findViewById(R.id.my_circle_img);
        img = (ImageView) findViewById(R.id.second_img);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bitmap bitmap = ((BitmapDrawable) myCircleImageView.getDrawable()).getBitmap();
                Log.e("log", "宽" + bitmap.getWidth() + "高" + bitmap.getHeight());
                Matrix matrix = new Matrix();
                float size = Math.min(bitmap.getWidth(), bitmap.getHeight());
                //x缩放比例
                float x = size / bitmap.getWidth();
                //y缩放比例
                float y = size / bitmap.getHeight();
                matrix.setScale(x, y);
                Bitmap newBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                Log.e("log", "宽:" + newBitmap.getWidth() + "高:" + newBitmap.getHeight());
                img.setImageBitmap(newBitmap);
            }
        });
    }
}
