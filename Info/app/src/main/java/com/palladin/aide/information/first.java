package com.palladin.aide.information;

import android.app.*;
import android.os.*;
import android.view.*;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;




public class first extends Activity 
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	}@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.item1:
				Intent inten2t = new Intent(getApplicationContext(),setting.class);
				startActivity(inten2t); 

				return true;
			case R.id.item2:
				Intent intent = new Intent(getApplicationContext(), info.class);
				startActivity(intent); 

				return true;


		}
		return false;

    }

}

