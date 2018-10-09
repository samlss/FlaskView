package me.samlss.flask_sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

import me.samlss.view.FlaskView;

public class MoreActivity extends AppCompatActivity {
    private FlaskView flaskView1;
    private FlaskView flaskView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        flaskView1 = findViewById(R.id.fv1);
        flaskView2 = findViewById(R.id.fv2);

        flaskView1.setBubbleColor(Color.parseColor("#fff36a"));
        flaskView1.setStrokeColor(Color.parseColor("#b9a4a4"));
        flaskView1.setWaterColor(Color.parseColor("#3b537b"));
        flaskView1.setStrokeWidth(10);
        flaskView1.setBubbleCreationInterval(60);
        flaskView1.setWaterHeightPercent(0.6f);
    }

    @Override
    protected void onResume() {
        super.onResume();
        flaskView1.start();
        flaskView2.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (isFinishing()){
            flaskView1.release();
            flaskView2.release();
        }else{
            flaskView1.stop();
            flaskView2.stop();
        }

    }


    public void onStart(View view) {
        flaskView1.start();
        flaskView2.start();
    }

    public void onStop(View view) {
        flaskView1.stop();
        flaskView2.stop();
    }
}
