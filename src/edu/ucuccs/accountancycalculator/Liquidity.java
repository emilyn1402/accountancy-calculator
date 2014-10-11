package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Liquidity extends Activity {
	
	Button btnacid;
	Button btncash;
	Button btncurrent;
	Button btnoperation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liquidity);
		
		btnacid = (Button) findViewById(R.id.btnacid);
		btncash = (Button) findViewById(R.id.btncash);
		btncurrent = (Button) findViewById(R.id.btncurrent);
		btnoperation = (Button) findViewById(R.id.btnoperation);
		
		btnacid.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotodebtequity = new Intent (Liquidity.this, AcidTestRatio.class);
				startActivity(gotodebtequity);
				
			}});
		
		
		btncash.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotodebtratio = new Intent (Liquidity.this, CashRatio.class);
				startActivity(gotodebtratio);
				
			}});
		
		btncurrent.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotodebtservice = new Intent (Liquidity.this, CurrentRatio.class);
				startActivity(gotodebtservice);
				
			}});
		
		btnoperation.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotolongterm = new Intent (Liquidity.this, OperatingRatio.class);
				startActivity(gotolongterm);
				
			}});
	}
}
