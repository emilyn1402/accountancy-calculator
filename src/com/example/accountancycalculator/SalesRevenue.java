package com.example.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SalesRevenue extends Activity {
	
	EditText editgs;
	EditText editsra;
	Button btncal;
	TextView txtans;
	
	double gs, sra, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sales_revenue);
		
		editgs = (EditText) findViewById(R.id.editgs);
		editsra = (EditText) findViewById(R.id.editsra);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				

				gs = Double.parseDouble(editgs.getText().toString());
				sra = Double.parseDouble(editsra.getText().toString());
				
				answer = gs - sra;
				
				txtans.setText(answer + "");
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sales_revenue, menu);
		return true;
	}

}
