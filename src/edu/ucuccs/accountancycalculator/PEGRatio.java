package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PEGRatio extends Activity {
	
	EditText editppe;
	EditText editaeg;
	Button btncal;
	TextView txtans;
	TextView txtmain;
	TextView txtdecs;
	
	double ppe, aeg, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pegratio);
		editppe = (EditText) findViewById(R.id.editppe);
		editaeg = (EditText) findViewById(R.id.editaeg);
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
				
				if (editppe.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (editaeg.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}

				} else if (editaeg.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

				} else {

					ppe = Double.parseDouble(editppe.getText()
							.toString());
					aeg = Double
							.parseDouble(editaeg.getText().toString());

					answer = ppe / aeg;

					txtans.setText(answer + "");

				}

			}});
	}
}
