package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PriceSales extends Activity {
	
	EditText editps;
	EditText editrs;
	Button btncal;
	TextView txtans;
	TextView txtmain;
	TextView txtdecs;
	
	double ps, rs, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_price_sales);
		
		editps = (EditText) findViewById(R.id.editps);
		editrs = (EditText) findViewById(R.id.editrs);
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
				
				if (editps.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (editrs.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (editrs.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

				} else {

					ps = Double.parseDouble(editps.getText()
							.toString());
					rs = Double
							.parseDouble(editrs.getText().toString());

					answer = ps / rs;

					txtans.setText(answer + "");

				}

			}});
	}
}
