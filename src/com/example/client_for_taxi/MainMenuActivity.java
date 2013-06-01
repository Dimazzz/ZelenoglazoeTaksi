package com.example.client_for_taxi;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
/*
 * id   	 запрос				что отправлять 		принимаю
 * 1 	Логирование 			(2 стринга)
 * 2	запрос таблицы 				 2(int)			(List <>)
 * 3 	взял заказ                   3(int)
 * 4 	выполнил заказ "свободен"    4(int)
 * 5	клиент отменил заказ		 5(int)
 *        (типо не пришел)(статус свободен)
 */

public class MainMenuActivity extends ListActivity{
	Menu myMenu;  
	 
	public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        //При каждом создании окна или нажатии кнопки рефрешь примаем данные
        //тут будут записанный данные полученные от запроса к серверу
        String[] values = new String[] { "Order 1" , "Order 2" , "Order 3",
                "Order 4", "Order 5", "Order 6" , "Order 7", "Order 8",
                "Order 9", "Order 10" };
        // Использование шаблона
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.activity_main_menu, R.id.txtView, values);
        setListAdapter(adapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
		Intent intentOrder = new Intent(this, OrderActivity.class);
	    startActivity(intentOrder);
        finish();
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {        
        myMenu = menu;    
        menu.add (Menu.FIRST, 1, 1, "refresh");    
        return true;  
    }
    
    public boolean onOptionsItemSelected (MenuItem item) {                
        if (item.getItemId() == 1) {   
            //рефрешуем таблицу!
        }               
        return true;  
    }
}
