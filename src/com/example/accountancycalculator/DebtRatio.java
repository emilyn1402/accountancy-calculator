package com.example.accountancycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DebtRatio extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_debt_ratio);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.debt_ratio, menu);
		return true;
	}

}
