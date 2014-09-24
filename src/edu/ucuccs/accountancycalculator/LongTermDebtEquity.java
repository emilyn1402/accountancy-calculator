package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
				
				if (editltlia.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (editequity.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (editequity.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

				} else {

					ltlia = Double.parseDouble(editltlia.getText()
							.toString());
					equity = Double
							.parseDouble(editequity.getText().toString());

					answer = ltlia + equity;

					txtans.setText(answer + "");

				}

				
			}});
	}

}
