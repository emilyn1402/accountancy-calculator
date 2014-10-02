package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DividendShare extends Activity {
	
	EditText editpaid;
	EditText editnumshare;
	Button btncal;
	TextView txtans;
	
	double paid, numshare, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dividend_share);
		
		editpaid = (EditText) findViewById(R.id.editpaid);
		editnumshare = (EditText) findViewById(R.id.editnumshare);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if (editpaid.getText().toString().equals("")) {

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

					paid = Double.parseDouble(editpaid.getText()
							.toString());
					numshare = Double
							.parseDouble(editnumshare.getText().toString());

					answer = paid / numshare;

					txtans.setText(answer + "");

				}

			}});
	}
}
