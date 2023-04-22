package ru.alexanderklimov.createactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Activity");
        TextView tv = new TextView(this);
        tv.setText("Я - сама активность!");
        tv.setPadding(20, 20, 20, 20);
        setContentView(tv);
    }
}
