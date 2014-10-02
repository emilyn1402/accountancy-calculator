package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MarketRatio extends Activity {
	
	Button btndividendC;
	Button btndividendY;
	Button btndividendS;
	Button btneps;
	Button btnpayoutratio;
	Button btnpeg;
	Button btnprice;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_market_ratio);
		
		btndividendC = (Button) findViewById(R.id.btndividendC);
		btndividendY = (Button) findViewById(R.id.btndividendY);
		btndividendS = (Button) findViewById(R.id.btndividendS);
		btneps = (Button) findViewById(R.id.btneps);
		btnpayoutratio = (Button) findViewById(R.id.btnpayoutratio);
		btnpeg = (Button) findViewById(R.id.btnpeg);
		btnprice = (Button) findViewById(R.id.btnprice);
		
		btndividendC.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotodividend = new Intent (MarketRatio.this, DividendCover.class);
				startActivity(gotodividend);
				
			}});
		
		btndividendY.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotoyield = new Intent (MarketRatio.this, DividendYield.class);
				startActivity(gotoyield);
				
			}});
		
		btndividendS.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotoshare = new Intent (MarketRatio.this, DividendShare.class);
				startActivity(gotoshare);
				
			}});
		
		btneps.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotoearning = new Intent (MarketRatio.this, EarningShare.class);
				startActivity(gotoearning);
				
			}});
		
		btnpayoutratio.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotopayout = new Intent (MarketRatio.this, PayoutRatio.class);
				startActivity(gotopayout);
				
			}});
		
		btnpeg.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotopeg = new Intent (MarketRatio.this, PEGRatio.class);
				startActivity(gotopeg);
				
			}});
		
		btnprice.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotosales = new Intent (MarketRatio.this, PriceSales.class);
				startActivity(gotosales);
				
			}});
	}
}
