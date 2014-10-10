package com.example.hadeesekisa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 

public class MainActivity extends ActionBarActivity { 
	   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        
        /*
         * Displaying hadees e kisa, when click on Hadees e kisa button
         */
        Button kisa_button = (Button) findViewById(R.id.activity_main_hadees_e_kisa);
        kisa_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub 
				startActivity(new Intent(MainActivity.this, Show_Kisa.class));
			}
		});
        
        /*
         * Displaying Islamic Quotes
         */
        Button quotes_b = (Button) findViewById(R.id.quotes);
        quotes_b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this, Quotes.class));
			}
		});
        
        /*
         * Displaying About Page
         */
        Button about_b = (Button) findViewById(R.id.activity_main_about_us);
        about_b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this, About_Us.class));
			}
		});
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.menu_item_share) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    } 
}
