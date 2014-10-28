package com.example.intentfilter;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.drm.DrmStore.Action;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText et;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText) findViewById(R.id.editText1);
        bt=(Button) findViewById(R.id.button1);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Uri myU=Uri.parse(et.getText().toString());
				Intent myIt=new Intent(Intent.ACTION_VIEW,myU);
				startActivity(myIt);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
