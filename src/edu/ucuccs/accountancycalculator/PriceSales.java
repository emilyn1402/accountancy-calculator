package edu.ucuccs.accountancycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PriceSales extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_price_sales);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.price_sales, menu);
		return true;
	}

}
