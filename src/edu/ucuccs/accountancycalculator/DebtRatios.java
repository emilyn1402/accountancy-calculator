package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
				
				if (edittotallia.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (edittotalass.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (edittotalass.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

				} else {

					totallia = Double.parseDouble(edittotallia.getText()
							.toString());
					totalass = Double
							.parseDouble(edittotalass.getText().toString());

					answer = totallia + totalass;

					txtans.setText(answer + "");

				}

				
			}});
	}

}
