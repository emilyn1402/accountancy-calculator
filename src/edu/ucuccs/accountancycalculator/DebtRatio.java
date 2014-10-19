package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DebtRatio extends Activity {
	
	Button btnder;
	Button btndebtratio;
	Button btndscr;
	Button btnlder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_debt_ratio);
		
		btnder = (Button) findViewById(R.id.btnder);
		btndebtratio = (Button) findViewById(R.id.btndebtratio);
		btndscr = (Button) findViewById(R.id.btndscr);
		btnlder = (Button) findViewById(R.id.btnlder);
		
		btnder.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotodebtequity = new Intent (DebtRatio.this, DeptEquityRatio.class);
				startActivity(gotodebtequity);
				
			}});
		
		
		btndebtratio.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotodebtratio = new Intent (DebtRatio.this, DebtRatios.class);
				startActivity(gotodebtratio);
				
			}});
		
		btndscr.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotodebtservice = new Intent (DebtRatio.this, DebtServiceCourage.class);
				startActivity(gotodebtservice);
				
			}});
		
		btnlder.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotolongterm = new Intent (DebtRatio.this, LongTermDebtEquity.class);
				startActivity(gotolongterm);
				
			}});
	}
	
}
