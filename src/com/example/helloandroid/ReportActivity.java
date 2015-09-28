package com.example.helloandroid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;

@SuppressLint("NewApi")
public class ReportActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
//		Intent intentObj =getIntent();
//		String op1=intentObj.getStringExtra("operand1");
//		String operator=intentObj.getStringExtra("operator");
//		String op2=intentObj.getStringExtra("operand2");
		System.out.println("misganu from second activity");
		
		setContentView(R.layout.fill_report_form);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void handlerMethod(View clickedButton){
		Intent intentObj= new Intent(getApplicationContext(), SubmitSuccessfulActivity.class);
		
		startActivity(intentObj);
	}
}
