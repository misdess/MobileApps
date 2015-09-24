package com.example.helloandroid;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;

@SuppressLint("NewApi")
public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
		String someName=getString(R.string.show_result);
		System.out.println("misganu");
		Intent newActivity=new Intent(getApplicationContext(), secondActivity.class);
		newActivity.putExtra("operand1", 3);
		newActivity.putExtra("operator", "+");
		newActivity.putExtra("operand2", 5);
		startActivity(newActivity);
	}
}
