package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Equity extends Activity {
	
	EditText editass;
	EditText editlia;
	Button btncal;
	TextView txtans;
	
	double asset, liabilities, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_equity);
		
		editass = (EditText) findViewById(R.id.editass);
		editlia = (EditText) findViewById(R.id.editlia);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				asset = Double.parseDouble(editass.getText().toString());
				liabilities = Double.parseDouble(editlia.getText().toString());
				
				answer = asset - liabilities;
				
				txtans.setText(answer + "");
				
			}});
	}

}
