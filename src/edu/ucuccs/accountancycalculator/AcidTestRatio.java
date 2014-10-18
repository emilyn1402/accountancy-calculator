package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AcidTestRatio extends Activity {
	
	EditText editcass;
	EditText editinvent;
	EditText editclia;
	Button btncal;
	TextView txtans;
	TextView txtmain;
	TextView txtdecs;
	
	Double ass, invent, lia, sub, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_acid_test_ratio);
		
		editcass = (EditText) findViewById(R.id.editcass);
		editinvent = (EditText) findViewById(R.id.editinvent);
		editclia = (EditText) findViewById(R.id.editclia);
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

					if (editinvent.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();
						
						if (editclia.getText().toString().equals(0)) {

							Toast.makeText(getApplicationContext(),
									"Please Fill up all!", Toast.LENGTH_LONG)
									.show();

						}

					}

				} else if (editinvent.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();
					
					if (editclia.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}
				

				} else if (editclia.getText().toString().equals(0)) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG)
							.show();

				}  else {

					ass = Double.parseDouble(editcass.getText().toString());
					invent = Double.parseDouble(editinvent.getText().toString());
					lia = Double.parseDouble(editclia.getText().toString());
					
					sub = ass - invent;
					answer = sub / lia;
					
					txtans.setText(answer + "");

				}
				
			}});
	}
}
