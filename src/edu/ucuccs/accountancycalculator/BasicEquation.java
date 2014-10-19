package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BasicEquation extends Activity {
	
	Button btnasset;
	Button btnebit;
	Button btneq;
	Button btngp;
	Button btnlia;
	Button btnnet;
	Button btnop;
	Button btnsr;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_equation);
		
		btnasset = (Button) findViewById(R.id.btnasset);
		btnebit = (Button) findViewById(R.id.btnebit);
		btneq = (Button) findViewById(R.id.btneq);
		btngp = (Button) findViewById(R.id.btngp);
		btnlia = (Button) findViewById(R.id.btnlia);
		btnnet = (Button) findViewById(R.id.btnnet);
		btnop = (Button) findViewById(R.id.btnop);
		btnsr = (Button) findViewById(R.id.btnsr);
		
		btnasset.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotoasset = new Intent (BasicEquation.this, Assets.class);
				startActivity(gotoasset);
				
			}});
		
		btnebit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotoebit = new Intent (BasicEquation.this, Ebit.class);
				startActivity(gotoebit);
				
			}});
		
		btneq.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotoequity = new Intent (BasicEquation.this, Equity.class);
				startActivity(gotoequity);
				
			}});
		
		btngp.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotogrossprofit = new Intent (BasicEquation.this, GrossProfit.class);
				startActivity(gotogrossprofit);
				
			}});
		

		
		btnlia.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotoliabilities = new Intent (BasicEquation.this, Liabilities.class);
				startActivity(gotoliabilities);
				
			}});
		

		
		btnnet.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotonetincome = new Intent (BasicEquation.this, NetIncome.class);
				startActivity(gotonetincome);
				
			}});
		
		btnop.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotoop = new Intent (BasicEquation.this, OperatingProfit.class);
				startActivity(gotoop);
				
			}});
		

		
		btnsr.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotosalesrevenue = new Intent (BasicEquation.this, SalesRevenue.class);
				startActivity(gotosalesrevenue);
				
			}});
		
	}
}
