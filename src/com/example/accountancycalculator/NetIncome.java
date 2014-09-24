package com.example.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NetIncome extends Activity {
	
	EditText editgross;
	EditText editoe;
	EditText edittax;
	EditText editinterest;
	Button btncal;
	TextView txtans;
	
	double gp, oe, tax, interest, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_net_income);
		
		editgross = (EditText) findViewById(R.id.editgross);
		editoe = (EditText) findViewById(R.id.editoe);
		edittax = (EditText) findViewById(R.id.edittax);
		editinterest = (EditText) findViewById(R.id.editinterest);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				

				gp = Double.parseDouble(editgross.getText().toString());
				oe = Double.parseDouble(editoe.getText().toString());
				tax = Double.parseDouble(edittax.getText().toString());
				interest = Double.parseDouble(editinterest.getText().toString());
				
				answer = gp - oe - tax - interest;
				
				txtans.setText(answer + "");
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.net_income, menu);
		return true;
	}

}
