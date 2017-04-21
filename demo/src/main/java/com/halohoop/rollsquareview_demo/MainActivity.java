package com.halohoop.rollsquareview_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.halohoop.rollsquareview.widgets.RollSquareView;

public class MainActivity extends AppCompatActivity {

    private RollSquareView rollSquareView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollSquareView1 = (RollSquareView) findViewById(R.id.rollSquareView1);
    }

    public void startRoll(View view) {
        rollSquareView1.setVisibility(View.VISIBLE);
        rollSquareView1.startRoll();
    }

    public void stopRoll(View view) {
//        rollSquareView1.stopRoll();
        rollSquareView1.setVisibility(View.GONE);
    }
    public void resetRoll(View view) {
        rollSquareView1.resetRoll();
    }
}
