package com.example.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OperatingProfit extends Activity {
	
	EditText editgp;
	EditText editoe;
	Button btncal;
	TextView txtans;
	
	double gp, oe, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_operating_profit);
		
		editgp = (EditText) findViewById(R.id.editgp);
		editoe = (EditText) findViewById(R.id.editoe);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				

				gp = Double.parseDouble(editgp.getText().toString());
				oe = Double.parseDouble(editoe.getText().toString());
				
				answer = gp - oe;
				
				txtans.setText(answer + "");
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.operating_profit, menu);
		return true;
	}

}
