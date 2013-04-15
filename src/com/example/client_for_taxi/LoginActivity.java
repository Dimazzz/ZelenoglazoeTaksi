package com.example.client_for_taxi;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity implements OnClickListener {

	
	Button btnLogin;
	Button btnExit;
	EditText edtLogin;
	EditText edtPass;	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(this);
        edtLogin = (EditText) findViewById(R.id.edtLogin);
        edtLogin.setOnClickListener(this);
        edtPass = (EditText) findViewById(R.id.edtPass);
        edtPass.setOnClickListener(this);
    }
    @Override
	public void onClick(View v) {
        switch (v.getId()) {
        case R.id.btnLogin:
        	if (edtLogin.getText().toString().equals("")){
        		Toast.makeText(getApplicationContext(), "write name", Toast.LENGTH_SHORT).show();       	
        	//} else if (edtPass.getText().toString().equals("")){
        	//    	 Toast.makeText(getApplicationContext(), "Введите пароль", Toast.LENGTH_SHORT).show();
        	} else {
        		// идет запрос, Есливсе совпадает тогда логинимся 
        		Intent intent = new Intent(this, MainMenuActivity.class);
        		finish();
      	    	startActivity(intent);
        	}
      	    break;
        case R.id.btnExit:
        	finish();
        	break;
        }
      }
}
