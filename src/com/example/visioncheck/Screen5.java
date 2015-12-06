/**
 * 
 */
package com.example.visioncheck;

import java.math.BigDecimal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler.Value;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
/**
 * @author karolina kulesz
 *
 */
public class Screen5 extends Activity implements OnClickListener{
	Button button2;
	int n=0;
	/**
	 * * Called when the Activity is first created.
	 * */
	@Override
	public void onCreate(Bundle klebek){
		super.onCreate(klebek);
		setContentView(R.layout.screen5);
		double result=(double) 100*Screen3.n/Screen3.m;
		result=Math.round(result);
		((TextView)findViewById (R.id.textView1)).setText("Wynik testu:"+result +"%.");
		button2=(Button)findViewById(R.id.button1);
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		button2.setOnClickListener(this);
		
		}
		@Override
		public void onClick(View v) {
			finishAffinity();
		}	
}
