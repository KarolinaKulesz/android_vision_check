/**
 * 
 */
package com.example.visioncheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author karolina
 *
 */

public class Screen4 extends Activity implements OnClickListener{
	RadioGroup radioGroup;
	RadioButton radioButton1;
	RadioButton radioButton2;
	RadioButton radioButton3;
	RadioButton radioButton4;
	String [] generatedStrings=new String[4];
	
		/**
		 * Called when the Activity is first created.
		 * @return 
		 */

		@Override
		public void onCreate(Bundle klebek){
		super.onCreate(klebek);
		setContentView(R.layout.screen4);
		generatedStrings[3]=Screen3.alphabetStr;
		for (int i = 0; i < 3; i++) {
			generatedStrings[i]=Character.toString(MainActivity.alphabet.charAt(Screen3.r.nextInt(MainActivity.N)));
	    }
		;
		List<String> generatedList=new ArrayList<String>(Arrays.asList(generatedStrings));
		Collections.shuffle(generatedList);
		String [] shuffledStrings=new String[4];
		generatedList.toArray(shuffledStrings);
		int size=45;
	    ((TextView)findViewById (R.id.textView1)).setText(shuffledStrings[0]);
	    ((TextView)findViewById (R.id.textView1)).setTextSize(size);
	    ((TextView)findViewById (R.id.textView2)).setText(shuffledStrings[1]);
	    ((TextView)findViewById (R.id.textView2)).setTextSize(size);
	    ((TextView)findViewById (R.id.textView3)).setText(shuffledStrings[2]);
	    ((TextView)findViewById (R.id.textView3)).setTextSize(size);
	    ((TextView)findViewById (R.id.textView4)).setText(shuffledStrings[3]);
	    ((TextView)findViewById (R.id.textView4)).setTextSize(size);
		radioGroup=(RadioGroup)findViewById(R.id.myRadioGroup);
		radioButton1=(RadioButton)findViewById(R.id.radioButton1);
		radioButton2=(RadioButton)findViewById(R.id.radioButton2);
		radioButton3=(RadioButton)findViewById(R.id.radioButton3);
		radioButton4=(RadioButton)findViewById(R.id.radioButton4);
		((RadioButton)findViewById (R.id.radioButton1)).setText(shuffledStrings[0]);
		((RadioButton)findViewById (R.id.radioButton2)).setText(shuffledStrings[1]);
		((RadioButton)findViewById (R.id.radioButton3)).setText(shuffledStrings[2]);
		((RadioButton)findViewById (R.id.radioButton4)).setText(shuffledStrings[3]);
		radioButton1.setOnClickListener(this);
		radioButton2.setOnClickListener(this);
		radioButton3.setOnClickListener(this);
		radioButton4.setOnClickListener(this);

		}
		
		@Override
		public void onClick(View v) {
			if(radioGroup.getCheckedRadioButtonId()!=-1){
			    int id= radioGroup.getCheckedRadioButtonId();
			    View radioButton = radioGroup.findViewById(id);
			    int radioId = radioGroup.indexOfChild(radioButton);
			    RadioButton btn = (RadioButton) radioGroup.getChildAt(radioId);
			    String selection = (String) btn.getText();
			    Screen3.info="RIGHT"+selection+Screen3.alphabetStr;
			    if(selection!=Screen3.alphabetStr){
			    	Screen3.info=selection+Screen3.alphabetStr;
			    	Screen3.n =Screen3.n;
			    	Screen3.m=Screen3.m+5;
			    }
			    else{
			    	Screen3.info="Correct!"+selection+Screen3.alphabetStr;
			    	Screen3.n =Screen3.n+5;
			    	Screen3.m=Screen3.m+5;
			    }		    
			}
			
			else{
			Screen3.info="WRONG";
			}
			if(Screen3.m<33){ 
				startActivityForResult(new Intent("com.example.vision.Screen3"), 0);}
			else{
				startActivityForResult(new Intent("com.example.vision.Screen5"), 0);}	
			}
		}
		
	

