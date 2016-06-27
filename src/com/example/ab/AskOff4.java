package com.example.ab;

import java.util.Calendar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract.Calendars;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TextView;
import android.widget.Toast;

public class AskOff4<AndroidDemo5Activity> extends Activity {
	private int year;
	private int month;
	private int day;
	private TextView date,askoff;
	private Button btnAskoff;
	
	@Override
	 protected void onCreate(Bundle savedInstanceState) {
	    	
	    	requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏全屏
	    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
	    		     WindowManager.LayoutParams.FLAG_FULLSCREEN);  
	    	
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.askoff4);
	        
	        DatePicker Chdate = (DatePicker) findViewById(R.id.datePicker1);
	        
	        final TextView date = (TextView) findViewById(R.id.date);
	        
	        TextView askoff = (TextView) findViewById(R.id.askoff);
	        
	        Button btnAskoff = (Button) findViewById(R.id.btnAskoff);
	        
	        Calendar ca = Calendar.getInstance();
	        year = ca.get(Calendar.YEAR);
	        month = ca.get(Calendar.MONTH);
	        day = ca.get(Calendar.DAY_OF_MONTH);
	        
	        OnDateChangedListener onDateChangedListener;
			Chdate.init(year, month, day,new OnDateChangedListener(){
	        	
				@Override
				public void onDateChanged(DatePicker view, int year, int month,
						int day) {
					// TODO Auto-generated method stub
	                 date.setText("                    "+year+"年"+(month+1)+"月"+day+"日");
				}
	        });	
			btnAskoff.setOnClickListener(btnAskoffListener);
	}
	private Button.OnClickListener btnAskoffListener = new Button.OnClickListener() {
		
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(AskOff4.this);
				builder.setTitle("提示");
				builder.setIcon(R.drawable.ic_launcher);
				builder.setMessage("确定提交申请？");
				builder.setPositiveButton("确定", new DialogInterface.OnClickListener()
				{

					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Toast.makeText(AskOff4.this, "申请成功！", Toast.LENGTH_SHORT).show();
					}
					
				});
				builder.setNegativeButton("取消", new DialogInterface.OnClickListener()
				{

					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Toast.makeText(AskOff4.this, "取消申请！", Toast.LENGTH_SHORT).show();
					}
					
				});

			}
	};


	  @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }
	}
	  


