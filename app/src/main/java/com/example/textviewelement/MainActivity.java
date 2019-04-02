package com.example.textviewelement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t=(TextView)findViewById(R.id.textView2);
        t.setMovementMethod(new ScrollingMovementMethod());
    }
    public void Clickme(View v){
        Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show();
    }
}
