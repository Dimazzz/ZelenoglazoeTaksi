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
 * id   	 ������				��� ���������� 		��������
 * 1 	����������� 			(2 �������)
 * 2	������ ������� 				 2(int)			(List <>)
 * 3 	���� �����                   3(int)
 * 4 	�������� ����� "��������"    4(int)
 * 5	������ ������� �����		 5(int)
 *        (���� �� ������)(������ ��������)
 */

public class MainMenuActivity extends ListActivity{
	Menu myMenu;  
	 
	public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        //��� ������ �������� ���� ��� ������� ������ ������� ������� ������
        //��� ����� ���������� ������ ���������� �� ������� � �������
        String[] values = new String[] { "Order 1" , "Order 2" , "Order 3",
                "Order 4", "Order 5", "Order 6" , "Order 7", "Order 8",
                "Order 9", "Order 10" };
        // ������������� �������
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
            //��������� �������!
        }               
        return true;  
    }
}
