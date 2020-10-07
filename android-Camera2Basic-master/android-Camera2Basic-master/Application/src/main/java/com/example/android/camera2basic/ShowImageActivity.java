package com.example.android.camera2basic;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;

public class ShowImageActivity extends AppCompatActivity {
    private final String TAG = "ShowImageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);
        Intent intent = getIntent();
        String message = intent.getStringExtra(Camera2BasicFragment.EXTRA_MESSAGE);
        Log.d(TAG, "onCreate: " + message);
        File imgFile = new File(message);
        if (imgFile != null) {
            Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
            myBitmap = rotateBitmap(myBitmap, 90);
            ImageView myImage = (ImageView) findViewById(R.id.imageviewshowimage);
            myImage.setImageBitmap(myBitmap);
        }
    }

    private  Bitmap rotateBitmap (Bitmap source, float angle) {
        Log.d(TAG, "rotateBitmap: ");
        Bitmap rotatededBitmap = null;
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        rotatededBitmap = Bitmap.createBitmap(source,0, 0, source.getWidth(), source.getHeight(),matrix, true);
        return rotatededBitmap;
    }
}