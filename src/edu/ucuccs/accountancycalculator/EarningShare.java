package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EarningShare extends Activity {
	
	EditText editnet;
	EditText editnumshare;
	Button btncal;
	TextView txtans;
	
	double net, numshare, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_earning_share);
		
		editnet = (EditText) findViewById(R.id.editnet);
		editnumshare = (EditText) findViewById(R.id.editnumshare);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if (editnet.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (editnumshare.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (editnumshare.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

				} else {

					net = Double.parseDouble(editnet.getText()
							.toString());
					numshare = Double
							.parseDouble(editnumshare.getText().toString());

					answer = net / numshare;

					txtans.setText(answer + "");

				}

			}});
	}
}
