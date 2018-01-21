package vn.edu.uit.ctghithucdon;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btndangnhap;
    Button btnthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        tv.setTextColor(Color.RED);

        btndangnhap = (Button) findViewById(R.id.btndangnhap);
        btndangnhap.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intentLogin = new Intent(MainActivity.this,MainLogin.class);
                startActivity(intentLogin);
            }
        });
        btnthoat = (Button) findViewById(R.id.btnthoat);
        btnthoat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }

}
