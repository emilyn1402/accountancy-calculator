package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StarightLineMethod extends Activity {
	
	EditText editcfa;
	EditText editula;
	EditText editrv;
	Button btncal;
	TextView txtans;
	TextView txtmain;
	TextView txtdecs;
	
	double cfa, rv, ula, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_staright_line_method);
		
		editcfa = (EditText) findViewById(R.id.editcfa);
		editula = (EditText) findViewById(R.id.editula);
		editrv = (EditText) findViewById(R.id.editrv);
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
				
				if (editcfa.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();

					if (editrv.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();
						
						if (editula.getText().toString().equals(0)) {

							Toast.makeText(getApplicationContext(),
									"Please Fill up all!", Toast.LENGTH_LONG)
									.show();

						}

					}

				} else if (editrv.getText().toString().equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG).show();
					
					if (editula.getText().toString().equals(0)) {

						Toast.makeText(getApplicationContext(),
								"Please Fill up all!", Toast.LENGTH_LONG)
								.show();

					}
				

				} else if (editula.getText().toString().equals(0)) {

					Toast.makeText(getApplicationContext(),
							"Please Fill up all!", Toast.LENGTH_LONG)
							.show();

				} else {

					cfa = Double.parseDouble(editcfa.getText().toString());
					rv = Double.parseDouble(editrv.getText().toString());
					ula = Double.parseDouble(editula.getText().toString());
					
					answer = cfa - rv;
					answer = answer / ula;
					
					txtans.setText(answer + "");

				}
				
			}});
	}
}
