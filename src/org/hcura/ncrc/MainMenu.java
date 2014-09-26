package org.hcura.ncrc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainMenu extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		/*if (id == R.id.action_settings) {
			return true;
		} */
		return super.onOptionsItemSelected(item);
	}
	public void goToNCRCWebsite(View view) {
        Uri uriUrl = Uri.parse("http://ncrc.hcura.org");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
	}
	
	public void openSchedule(View view) {
	    Intent intent = new Intent(this, Schedule.class);
	    startActivity(intent);
	}
	
	public void openContacts(View view) {
	    Intent intent = new Intent(this, Contacts.class);
	    startActivity(intent);
	}


public void openMap(View view) {
    Intent intent = new Intent(this, Map.class);
    startActivity(intent);
}
}
