package edu.ucuccs.accountancycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DebtServiceCourage extends Activity {
	
	EditText editnetoincome;
	EditText editdebtservice;
	Button btncal;
	TextView txtans;

	double netoincome, debtservice, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_debt_service_courage);
		
		editnetoincome = (EditText) findViewById(R.id.editnetoincome);
		editdebtservice = (EditText) findViewById(R.id.editdebtservice);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				netoincome = Double.parseDouble(editnetoincome.getText()
						.toString());
				debtservice = Double
						.parseDouble(editdebtservice.getText().toString());

				answer = netoincome / debtservice;

				txtans.setText(answer + "");
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.debt_service_courage, menu);
		return true;
	}

}
