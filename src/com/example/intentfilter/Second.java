package com.example.intentfilter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends Activity {
    TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		tv=(TextView) findViewById(R.id.textView1);
		tv.setText("成功过滤，让我来处理吧！");
	}

}
