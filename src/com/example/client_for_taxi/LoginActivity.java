package com.example.client_for_taxi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity implements OnClickListener {

	EditText edtLogin;
	EditText edtPass;	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtLogin = (EditText) findViewById(R.id.edtLogin);
        edtPass = (EditText) findViewById(R.id.edtPass);
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
        		Intent intentMainMenu = new Intent(this, MainMenuActivity.class);
        		finish();
      	    	startActivity(intentMainMenu);
        	}
      	    break;
        case R.id.btnExit:
        	finish();
        	break;
        }
      }
}
