package com.example.generalinfo;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	 public static String EXTRA_MESSAGE = "";
     public static int arrayValue = 0;
     
     @Override
     protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_main);
             
             SpellDatabase.makeSpellDatabase();

             
             final TextView display1 = (TextView)findViewById(R.id.textView1);

             
             ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                               this, R.array.champion_array, android.R.layout.simple_spinner_item );
                             adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
             
                             Spinner s = (Spinner) findViewById( R.id.spinner1 );
                             s.setAdapter( adapter );
                             s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
                                      

                                     
                                     @Override
                                     public void onItemSelected(AdapterView adapter, View v, int i, long lng) {
                                             display1.setText(adapter.getItemAtPosition(i).toString());
                                             EXTRA_MESSAGE = adapter.getItemAtPosition(i).toString();
                                            
                                     }
                                      
                                     @Override
                                     public void onNothingSelected(AdapterView arg0) {
                                     //do something else
                                     }
                                     });}
     
     public void viewchampions(View view) {
         Intent intent = new Intent(this, ViewChampions.class);
         intent.putExtra(EXTRA_MESSAGE, EXTRA_MESSAGE);
         startActivity(intent);
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	

}
