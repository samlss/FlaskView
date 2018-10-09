package me.samlss.flask_sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import me.samlss.view.FlaskView;

public class MainActivity extends AppCompatActivity {
    private FlaskView flaskView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flaskView = findViewById(R.id.fv);

        getSupportActionBar().setHomeActionContentDescription("More");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_more){
            startActivity(new Intent(this, MoreActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        flaskView.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (isFinishing()){
            flaskView.release();
        }else{
            flaskView.stop();
        }

    }


    public void onStart(View view) {
        flaskView.start();
    }

    public void onStop(View view) {
        flaskView.stop();
    }
}
