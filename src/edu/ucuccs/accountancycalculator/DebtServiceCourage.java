package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DebtServiceCourage extends Activity {
	
	EditText editnetoincome;
	EditText editdebtservice;
	Button btncal;
	TextView txtans;
	TextView txtmain;
	TextView txtdecs;

	double netoincome, debtservice, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_debt_service_courage);
		
		editnetoincome = (EditText) findViewById(R.id.editnetoincome);
		editdebtservice = (EditText) findViewById(R.id.editdebtservice);
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
				
				if (editnetoincome.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (editdebtservice.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (editdebtservice.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

				} else {

					netoincome = Double.parseDouble(editnetoincome.getText()
							.toString());
					debtservice = Double
							.parseDouble(editdebtservice.getText().toString());

					answer = netoincome + debtservice;

					txtans.setText(answer + "");

				}

				
			}});
	}

}
