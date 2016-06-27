package com.example.ab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Logon2 extends Activity {

	private Button btnDO;
	private TextView school,dept,schoolnum,name,buildingnum,chambernum,password;
	private EditText SchoolNum,Name,ChamberNum,Password;
    private Spinner spnSchool,spnDept,spnBuilding;
    String[] Schools=new String[] {"鲁东大学","清华大学","哈佛大学","加理敦大学"};
    String[] Depts=new String[] {"商学院","信息与电气工程学院","土木工程学院","马克思主义学院","金融学院"};
    String[] Buildings=new String[] {"北十三","北十五","北十","南五"};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
    		     WindowManager.LayoutParams.FLAG_FULLSCREEN);  

        super.onCreate(savedInstanceState);
        setContentView(R.layout.logon2);
        
// 2.通过findViewById的方法获取控件组件
        btnDO = (Button) findViewById(R.id.logon);
        
        schoolnum = (TextView) findViewById(R.id.schoolnum);
        name = (TextView) findViewById(R.id.name);
        school = (TextView) findViewById(R.id.school);
        dept = (TextView) findViewById(R.id.dept);
        buildingnum = (TextView) findViewById(R.id.buildingnum);
        chambernum = (TextView) findViewById(R.id.chambernum);
        password = (TextView) findViewById(R.id.password);
        
        SchoolNum = (EditText) findViewById(R.id.SchoolNum);
        Name = (EditText) findViewById(R.id.Name);
        ChamberNum = (EditText) findViewById(R.id.ChamberNum);
        Password = (EditText) findViewById(R.id.Password);
        
        spnSchool=(Spinner) findViewById(R.id.spnSchool);
        spnDept=(Spinner) findViewById(R.id.spnDept);
        spnBuilding=(Spinner) findViewById(R.id.spnBuilding);
        
        ArrayAdapter<String> adapterSchools = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Schools);//格式
        spnSchool.setAdapter(adapterSchools);//设置数据源
        spnSchool.setOnItemSelectedListener(spnSchoolListener);
        
        ArrayAdapter<String> adapterDepts = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Depts);
        spnDept.setAdapter(adapterDepts);
        spnDept.setOnItemSelectedListener(spnDeptListener);
        
        ArrayAdapter<String> adapterBuildings = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Buildings);
        spnBuilding.setAdapter(adapterBuildings);
        spnBuilding.setOnItemSelectedListener(spnBuildingListener);
        
 // 3.为button组件加入click事件的监听，触发时执行定义方法
     		btnDO.setOnClickListener(btnDoListener);
    }
    
 // 实现button的监听函数
     	private Button.OnClickListener btnDoListener = new Button.OnClickListener() {
     			public void onClick(View v) {
     				Intent intent=new Intent();
     	    		intent.setClass(Logon2.this, Login1.class);
     	    		startActivity(intent);
     	}
     	};
    
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
     	private Spinner.OnItemSelectedListener spnDeptListener = new Spinner.OnItemSelectedListener() {
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
     	private Spinner.OnItemSelectedListener spnBuildingListener = new Spinner.OnItemSelectedListener() {
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
     	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }		
     		}