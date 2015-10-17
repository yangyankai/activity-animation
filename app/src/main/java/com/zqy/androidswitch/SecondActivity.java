package com.zqy.androidswitch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_second);
		final Button button=(Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
//				Intent intent = new Intent(SecondActivity.this, MainActivity.class);
//				startActivity(intent);

				//				overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);


			}
		});
	}

	@Override
	public void finish()
	{
		super.finish();
		overridePendingTransition(R.anim.push_up_in2, R.anim.push_up_out2);
	}
}
