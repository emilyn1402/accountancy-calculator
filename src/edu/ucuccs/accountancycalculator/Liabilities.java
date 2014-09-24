package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Liabilities extends Activity {
	
	EditText editass;
	EditText editequity;
	Button btncal;
	TextView txtans;
	
	double assets, equity, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liabilities);
		
		editass = (EditText) findViewById(R.id.editass);
		editequity = (EditText) findViewById(R.id.editequity);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				

				assets = Double.parseDouble(editass.getText().toString());
				equity = Double.parseDouble(editequity.getText().toString());
				
				answer = assets - equity;
				
				txtans.setText(answer + "");
				
			}});
	}
}
