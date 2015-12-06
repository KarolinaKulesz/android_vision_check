package com.example.visioncheck;

import java.text.BreakIterator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//co jeszcze?przekazywanie odleglosci h przez argnument nowej klasy, obliczanie visus?
public class MainActivity extends Activity implements View.OnClickListener {
EditText one;
Button nextPage;
TextView showres;
static String alphabet = "ABCDEFGHIJKLMNOPRQSTVUWYZ";
static final int N = alphabet.length();
protected Object n1 ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);
	
		one = (EditText)findViewById(R.id.editText1);
		nextPage=(Button)findViewById(R.id.button1);	
		nextPage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					int n1 = Integer.parseInt(one.getText().toString());	}
				catch(Exception e){	
				}	
			}
		});
		
			
		nextPage.setOnClickListener(this);
		
		
		
	}
	
	private void clickButton1(){
		
		startActivity(new Intent("com.example.vision.Screen2"));
	
	}
	/*; 
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
*/
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.button1:
			clickButton1();
			break;
		
		}
		
	}	
}
