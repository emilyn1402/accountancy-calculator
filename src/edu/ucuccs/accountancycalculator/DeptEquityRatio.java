package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DeptEquityRatio extends Activity {
	
	EditText edittotallia;
	EditText editshareequity;
	Button btncal;
	TextView txtans;

	double totallia, shareequity, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dept_equity_ratio);
		
		edittotallia = (EditText) findViewById(R.id.edittotallia);
		editshareequity = (EditText) findViewById(R.id.editshareequity);
		btncal = (Button) findViewById(R.id.btncal);
		txtans = (TextView) findViewById(R.id.txtans);
		
		btncal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				totallia = Double.parseDouble(edittotallia.getText()
						.toString());
				shareequity = Double
						.parseDouble(editshareequity.getText().toString());

				answer = totallia / shareequity;

				txtans.setText(answer + "");
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dept_equity_ratio, menu);
		return true;
	}

}
