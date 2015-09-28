package com.example.helloandroid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.EditText;

@SuppressLint("NewApi")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
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

	public void handlerMethod(View clickedButton) {
		String someName = getString(R.string.login);
		Intent intentObj = new Intent(getApplicationContext(), ReportActivity.class);
		EditText email = (EditText) findViewById(R.id.email);
		EditText psw = (EditText) findViewById(R.id.password);

		if (psw.getText().toString().equals("misganu") && email.getText().toString().equals("misdess@gmail.com")) {
			System.out.println("misganu123");
			startActivity(intentObj);
			System.out.println("misganu1");
		}
	}
}
