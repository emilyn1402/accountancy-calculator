package edu.ucuccs.accountancycalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Depreciation extends Activity {
	
	Button btnbook;
	Button btndec;
	Button btnstraight;
	Button btnpro;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_depreciation);
		btnbook = (Button) findViewById(R.id.btnbook);
		btndec = (Button) findViewById(R.id.btndec);
		btnstraight = (Button) findViewById(R.id.btnstraight);
		btnpro = (Button) findViewById(R.id.btnpro);
		
		btnbook.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent gotodebtequity = new Intent (Depreciation.this, BookValue.class);
				startActivity(gotodebtequity);
				
			}});
	}
}
