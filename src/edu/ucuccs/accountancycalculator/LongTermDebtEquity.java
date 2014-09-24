package edu.ucuccs.accountancycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LongTermDebtEquity extends Activity {
	
	EditText editltlia;
	EditText editequity;
	Button btncal;
	TextView txtans;

	double ltlia, equity, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_long_term_debt_equity);
		
		editltlia = (EditText) findViewById(R.id.editltlia);
		editequity = (EditText) findViewById(R.id.editequity);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				ltlia = Double.parseDouble(editltlia.getText()
						.toString());
				equity = Double
						.parseDouble(editequity.getText().toString());

				answer = ltlia / equity;

				txtans.setText(answer + "");
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.long_term_debt_equity, menu);
		return true;
	}

}
