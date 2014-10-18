package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NetIncome extends Activity {
	
	EditText editgross;
	EditText editoe;
	EditText edittax;
	EditText editinterest;
	Button btncal;
	TextView txtans;
	TextView txtmain;
	TextView txtdecs;
	
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
		txtdecs = (TextView) findViewById(R.id.txtdecs);
		txtmain = (TextView) findViewById(R.id.txtmain);
		
		txtmain.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				txtdecs.setVisibility(View.VISIBLE);
				
			}});
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if (editgross.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (editoe.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();
						
						if (edittax.getText().toString().equals(0)) {

							Toast.makeText(getApplicationContext(),
									"Please Fill up all!", Toast.LENGTH_LONG)
									.show();
							
							if (editinterest.getText().toString().equals(0)) {

								Toast.makeText(getApplicationContext(),
										"Please Fill up all!", Toast.LENGTH_LONG)
										.show();

							}

						}

					}

				} else if (editoe.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();
					
					if (edittax.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();
						
						if (editinterest.getText().toString().equals(0)) {

							Toast.makeText(getApplicationContext(),
									"Please Fill up all!", Toast.LENGTH_LONG)
									.show();

						}

					}
				

				} else if (edittax.getText().toString().equals(0)) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG)
							.show();
					
					if (editinterest.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (editinterest.getText().toString().equals(0)) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG)
							.show();

				} else {

					gp = Double.parseDouble(editgross.getText().toString());
					oe = Double.parseDouble(editoe.getText().toString());
					tax = Double.parseDouble(edittax.getText().toString());
					interest = Double.parseDouble(editinterest.getText().toString());
					
					answer = gp - oe - tax - interest;
					
					txtans.setText(answer + "");

				}
				
			}});
	}
}
