
package com.example.ab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Login1 extends Activity {

		private Button btnLogin;
		private TextView textLogon;
		private TextView school,schoolnum,password;
		private EditText SchoolNum,Password;
		private Spinner spnSchool;
		String[] Schools=new String[] {"鲁东大学","清华大学","哈佛大学","加理敦大学"};
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏全屏
    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
    		     WindowManager.LayoutParams.FLAG_FULLSCREEN);  
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login1);
        
// 2.通过findViewById的方法获取控件组件
        btnLogin = (Button) findViewById(R.id.btnLogin);//登录
       textLogon = (TextView) findViewById(R.id.textLogon);
        
        schoolnum = (TextView) findViewById(R.id.schoolnum);
        school = (TextView) findViewById(R.id.school);
        password = (TextView) findViewById(R.id.password);
        
        SchoolNum = (EditText) findViewById(R.id.SchoolNum);
        Password = (EditText) findViewById(R.id.Password);
        
        spnSchool=(Spinner) findViewById(R.id.spnSchool);
        
        ArrayAdapter<String> adapterSchools = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Schools);//格式
        spnSchool.setAdapter(adapterSchools);//设置数据源
        spnSchool.setOnItemSelectedListener(spnSchoolListener);
        
// 3.为button组件加入click事件的监听，触发时执行定义方法
 		textLogon.setOnClickListener(textLogonListener);
 		btnLogin.setOnClickListener(btnLoginListener);
    }
 
//点击注册跳转界面    
    private Button.OnClickListener textLogonListener = new Button.OnClickListener() {
    	public void onClick(View v) {
    		Intent intent=new Intent();
    		intent.setClass(Login1.this, Logon2.class);
    		startActivity(intent);
    	}
    };

//点击登陆跳转到主界面
    private Button.OnClickListener btnLoginListener = new Button.OnClickListener() {
    	public void onClick(View v) {
    		Intent intent=new Intent();
    		intent.setClass(Login1.this, SignIn3.class);
    		startActivity(intent);
    	}
    };
  
//监听    
    private Spinner.OnItemSelectedListener spnSchoolListener = new Spinner.OnItemSelectedListener() {
 		@Override
 		public void onItemSelected(AdapterView<?> parent, View v, int position,
 				long id) {

 			String sel = parent.getSelectedItem().toString();
 		}

 		@Override
 		public void onNothingSelected(AdapterView<?> arg0) {
 			// TODO Auto-generated method stub
 		}
 	};
//
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
}
    
