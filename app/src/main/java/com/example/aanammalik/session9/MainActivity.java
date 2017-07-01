package com.example.aanammalik.session9;



import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);// txt id
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // using inflater
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.red:
                textView.setTextColor(Color.RED);
                return true;
            case R.id.green:
                textView.setTextColor(Color.GREEN);
                return true;
            case R.id.blue:
                textView.setTextColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}

