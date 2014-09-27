package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DividendCover extends Activity {

	EditText editearning;
	EditText editdividen;
	Button btncal;
	TextView txtans;
	
	double earning, dividend, answer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dividend_cover);
		
		editearning = (EditText) findViewById(R.id.editearning);
		editdividen = (EditText) findViewById(R.id.editdividen);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if (editearning.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (editdividen.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (editdividen.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

				} else {

					earning = Double.parseDouble(editearning.getText()
							.toString());
					dividend = Double
							.parseDouble(editdividen.getText().toString());

					answer = earning + dividend;

					txtans.setText(answer + "");

				}

			}});
	}

}
