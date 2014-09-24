package com.example.accountancycalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button btnbasic;
	Button btndebt;
	Button btnmarket;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnbasic = (Button) findViewById(R.id.btnbasic);
		btndebt = (Button) findViewById(R.id.btndebt);
		btnmarket = (Button) findViewById(R.id.btnmarket);
		
		btnbasic.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotobasic = new Intent (MainActivity.this, BasicEquation.class);
				startActivity(gotobasic);
				
			}});
		
		btndebt.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotodebt = new Intent (MainActivity.this, DebtRatio.class);
				startActivity(gotodebt);
				
			}});
		
		btnmarket.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotomarket = new Intent (MainActivity.this, MarketRatio.class);
				startActivity(gotomarket);
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
