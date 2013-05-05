package com.example.client_for_taxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class OrderActivity extends Activity implements OnClickListener {
	Button btnTake;
	Button btnCancel;
	TextView txtOrder;
	TextView txtPhone;
	Intent intentMainMenu;
	boolean take = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order);
		intentMainMenu = new Intent(this, MainMenuActivity.class);
        btnTake = (Button) findViewById(R.id.btnTake);
        btnTake.setOnClickListener(this);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(this);
        txtOrder = (TextView) findViewById(R.id.txtOrder);
        txtPhone = (TextView) findViewById(R.id.txtPhone);
	}

	@Override
	public void onClick(View v) {
		 switch (v.getId()) {
	        	// Подтверждение выбора заказа (Отправка Бд)
	        case R.id.btnTake:
	        	if (!take){
	        		take = true;
	        		btnTake.setText("Complite");
	        		btnCancel.setVisibility(1);
	        		txtPhone.setVisibility(1);
	        	} else {
	        		// Заказ выполнен (отправка бд на выполнение)
	        		finish();
	    	    	startActivity(intentMainMenu);
	        	}
	        	break;
	        case R.id.btnCancel:
	        	if (take){
	        	//Выплняет при случаях если Клиент отменил заказ, или не пришел на него
	        		finish();
	        		startActivity(intentMainMenu);
	        	}
	        	break;
		 }
	}
}
