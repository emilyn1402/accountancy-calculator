package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ebit extends Activity {

	EditText editrev;
	EditText editoe;
	Button btncal;
	TextView txtans;
	
	double revenue, oexpenses, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ebit);
		
		editrev = (EditText) findViewById(R.id.editrev);
		editoe = (EditText) findViewById(R.id.editoe);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if (editrev.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (editoe.getText().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (editoe.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

				} else {

					revenue = Double.parseDouble(editrev.getText()
							.toString());
					oexpenses = Double
							.parseDouble(editoe.getText().toString());

					answer = revenue + oexpenses;

					txtans.setText(answer + "");

				}

			}
				
			});
	}
}
