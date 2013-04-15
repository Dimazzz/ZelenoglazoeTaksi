package com.example.client_for_taxi;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainMenuActivity extends ListActivity{

    
	public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        //тут будут записанный данные полученные от запроса к серверу
        String[] values = new String[] { "Order 1" , "Order 2" , "Order 3",
                "Order 4", "Order 5", "Order 6" , "Order 7", "Order 8",
                "Order 9", "Order 10" };
        // Использование собственного шаблона
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.activity_main_menu, R.id.txtView, values);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
		Intent intent = new Intent(this, OrderActivity.class);
	    startActivity(intent);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

}
