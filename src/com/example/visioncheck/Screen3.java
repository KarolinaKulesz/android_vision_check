/**
 * 
 */
package com.example.visioncheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import android.R.string;
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
public class Screen3 extends Activity implements View.OnClickListener{
	Button button3;
    static Random r = new Random();
    static char alphabetChar;
    static String alphabetStr;
	static String info="TAK";
	static int n =2;
	static int m=2;
		/**
		 * Called when the Activity is first created.
		 */
		@Override
		public void onCreate(Bundle klebek){
		super.onCreate(klebek);
		setContentView(R.layout.screen3);
		int SignSize=(int) Math.floor((double)360/(double)n);
		alphabetChar=MainActivity.alphabet.charAt(r.nextInt(MainActivity.N));
		alphabetStr=Character.toString(alphabetChar);
	    ((TextView)findViewById (R.id.textView1)).setText(alphabetStr);
	    ((TextView)findViewById (R.id.textView1)).setTextSize(SignSize);
	    ((TextView)findViewById (R.id.textView2)).setText(info);
	    ((TextView)findViewById (R.id.textView2)).setTextSize(50);
		button3=(Button)findViewById(R.id.button1);
		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		button3.setOnClickListener(this);
		
		}
		@Override
		public void onClick(View v) {
			startActivityForResult(new Intent("com.example.vision.Screen4"), 0);
		}
}


