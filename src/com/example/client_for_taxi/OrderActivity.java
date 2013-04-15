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
	TextView txtOrder;
	Intent intentMainMenu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order);
		intentMainMenu = new Intent(this, MainMenuActivity.class);
        btnTake = (Button) findViewById(R.id.btnTake);
        btnTake.setOnClickListener(this);
        txtOrder = (TextView) findViewById(R.id.txtOrder);
	}

	@Override
	public void onClick(View v) {
		 switch (v.getId()) {
	        	// Отмена заказа, нажимается в то случае если клиент отменил заказ
	        	// или не пришел на назначенное место
	        	// также идет запрос к БД
	        case R.id.btnTake:
	        	// Выбор заказа!
	        	finish();
	    	    startActivity(intentMainMenu);
	        	break;
		 }
	}
}
