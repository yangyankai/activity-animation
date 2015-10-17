package com.zqy.androidswitch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view)
			{
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				startActivity(intent);

				overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
//
//				overridePendingTransition(R.anim.push_up_in2, R.anim.push_up_out2);
			}
		});
	}
}


