package com.example.ab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class SignIn3 extends Activity {
	
		private Button btnAskoff;
		private TextView num1,num2;
		
	   
		
	@Override
	 protected void onCreate(Bundle savedInstanceState) {
		
	    	requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏全屏
	    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
	    		     WindowManager.LayoutParams.FLAG_FULLSCREEN);  
		
		 btnAskoff = (Button) findViewById(R.id.btnAskoff);
		 
		 num1 = (TextView) findViewById(R.id.num1);
	     num2 = (TextView) findViewById(R.id.num2);
	    	
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.signin3);
	        
	        btnAskoff.setOnClickListener(btnAskoffListener);
	 }
	
	private Button.OnClickListener btnAskoffListener = new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent=new Intent();
	    		intent.setClass(SignIn3.this, AskOff4.class);
	    		startActivity(intent);
	}
	};

	  @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }
}
