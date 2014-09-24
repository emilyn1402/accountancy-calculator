package edu.ucuccs.accountancycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DebtRatios extends Activity {
	
	EditText edittotallia;
	EditText edittotalass;
	Button btncal;
	TextView txtans;

	double totallia, totalass, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_debt_ratios);
		
		edittotallia = (EditText) findViewById(R.id.edittotallia);
		edittotalass = (EditText) findViewById(R.id.edittotalass);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				totallia = Double.parseDouble(edittotallia.getText()
						.toString());
				totalass = Double
						.parseDouble(edittotalass.getText().toString());

				answer = totallia / totalass;

				txtans.setText(answer + "");
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.debt_ratios, menu);
		return true;
	}

}
