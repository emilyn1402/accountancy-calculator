package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CurrentRatio extends Activity {
	
	EditText editcass;
	EditText editclia;
	Button btncal;
	TextView txtans;
	TextView txtmain;
	TextView txtdecs;

	double cass, clia, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_current_ratio);
		editcass = (EditText) findViewById(R.id.editcass);
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

					if (editclia.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (editclia.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

				} else {

					cass = Double.parseDouble(editcass.getText()
							.toString());
					clia = Double
							.parseDouble(editclia.getText().toString());

					answer = cass / clia;

					txtans.setText(answer + "");

				}

				
			}});
	}
}
