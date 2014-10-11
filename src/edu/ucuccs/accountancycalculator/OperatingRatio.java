package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OperatingRatio extends Activity {
	
	EditText editoperation;
	EditText edittotaldebt;
	Button btncal;
	TextView txtans;

	double operation, tdebt, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_operating_ratio);
		editoperation = (EditText) findViewById(R.id.editoperation);
		edittotaldebt = (EditText) findViewById(R.id.edittotaldebt);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if (editoperation.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (edittotaldebt.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (edittotaldebt.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

				} else {

					operation = Double.parseDouble(editoperation.getText()
							.toString());
					tdebt = Double
							.parseDouble(edittotaldebt.getText().toString());

					answer = operation / tdebt;

					txtans.setText(answer + "");

				}

				
			}});
	}
}
