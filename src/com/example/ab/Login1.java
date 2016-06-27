
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
		String[] Schools=new String[] {"³����ѧ","�廪��ѧ","�����ѧ","����ش�ѧ"};
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	requestWindowFeature(Window.FEATURE_NO_TITLE);//ȥ��������ȫ��
    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
    		     WindowManager.LayoutParams.FLAG_FULLSCREEN);  
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login1);
        
// 2.ͨ��findViewById�ķ�����ȡ�ؼ����
        btnLogin = (Button) findViewById(R.id.btnLogin);//��¼
       textLogon = (TextView) findViewById(R.id.textLogon);
        
        schoolnum = (TextView) findViewById(R.id.schoolnum);
        school = (TextView) findViewById(R.id.school);
        password = (TextView) findViewById(R.id.password);
        
        SchoolNum = (EditText) findViewById(R.id.SchoolNum);
        Password = (EditText) findViewById(R.id.Password);
        
        spnSchool=(Spinner) findViewById(R.id.spnSchool);
        
        ArrayAdapter<String> adapterSchools = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Schools);//��ʽ
        spnSchool.setAdapter(adapterSchools);//��������Դ
        spnSchool.setOnItemSelectedListener(spnSchoolListener);
        
// 3.Ϊbutton�������click�¼��ļ���������ʱִ�ж��巽��
 		textLogon.setOnClickListener(textLogonListener);
 		btnLogin.setOnClickListener(btnLoginListener);
    }
 
//���ע����ת����    
    private Button.OnClickListener textLogonListener = new Button.OnClickListener() {
    	public void onClick(View v) {
    		Intent intent=new Intent();
    		intent.setClass(Login1.this, Logon2.class);
    		startActivity(intent);
    	}
    };

//�����½��ת��������
    private Button.OnClickListener btnLoginListener = new Button.OnClickListener() {
    	public void onClick(View v) {
    		Intent intent=new Intent();
    		intent.setClass(Login1.this, SignIn3.class);
    		startActivity(intent);
    	}
    };
  
//����    
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
    
