package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Category extends Activity {

	Button btnbasic;
	Button btndebt;
	Button btnmarket;
	Button btnliquidity;
	Button btndepre;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category);
		
		btnbasic = (Button) findViewById(R.id.btnbasic);
		btndebt = (Button) findViewById(R.id.btndebt);
		btnmarket = (Button) findViewById(R.id.btnmarket);
		
		
		btnbasic.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotobasic = new Intent (Category.this, BasicEquation.class);
				startActivity(gotobasic);
				
			}});
		
		btndebt.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotodebt = new Intent (Category.this, DebtRatio.class);
				startActivity(gotodebt);
				
			}});
		
		btnmarket.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotomarket = new Intent (Category.this, MarketRatio.class);
				startActivity(gotomarket);
				
			}});
		

		
		btnliquidity.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotomarket = new Intent (Category.this, Liquidity.class);
				startActivity(gotomarket);
				
			}});
		
		btndepre.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotomarket = new Intent (Category.this, Depreciation.class);
				startActivity(gotomarket);
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.category, menu);
		return true;
	}

}
