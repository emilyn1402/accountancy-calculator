package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UnitProduction extends Activity {
	
	EditText editcass;
	EditText editrvalue;
	EditText editetp;
	EditText editap;
	Button btncal;
	TextView txtans;
	TextView txtmain;
	TextView txtdecs;
	
	double cass, rvalue, etp, ap, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_unit_production);
		
		editcass = (EditText) findViewById(R.id.editcass);
		editrvalue = (EditText) findViewById(R.id.editrvalue);
		editetp = (EditText) findViewById(R.id.editetp);
		editap = (EditText) findViewById(R.id.editap);
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
				
				if (editcass.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (editrvalue.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();
						
						if (editetp.getText().toString().equals(0)) {

							Toast.makeText(getApplicationContext(),
									"Please Fill up all!", Toast.LENGTH_LONG)
									.show();
							
							if (editap.getText().toString().equals(0)) {

								Toast.makeText(getApplicationContext(),
										"Please Fill up all!", Toast.LENGTH_LONG)
										.show();

							}

						}

					}

				} else if (editrvalue.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();
					
					if (editetp.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();
						
						if (editap.getText().toString().equals(0)) {

							Toast.makeText(getApplicationContext(),
									"Please Fill up all!", Toast.LENGTH_LONG)
									.show();

						}

					}
				

				} else if (editetp.getText().toString().equals(0)) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG)
							.show();
					
					if (editap.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (editap.getText().toString().equals(0)) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG)
							.show();

				} else {

					cass = Double.parseDouble(editcass.getText().toString());
					rvalue = Double.parseDouble(editrvalue.getText().toString());
					etp = Double.parseDouble(editetp.getText().toString());
					ap = Double.parseDouble(editap.getText().toString());
					
					answer = cass - rvalue;
					answer = answer / etp;
					answer = answer * ap;
					
					txtans.setText(answer + "");

				}
				
			}});
	}
}
