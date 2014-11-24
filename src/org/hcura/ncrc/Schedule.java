package org.hcura.ncrc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Schedule extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_schedule);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.schedule, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
	    switch (item.getItemId()) {
        case R.id.thurs_action:
            findViewById(R.id.schedule_scrollview).scrollTo(0, findViewById(R.id.thursday_text).getTop());
            return true;
        case R.id.fri_action:
            findViewById(R.id.schedule_scrollview).scrollTo(0, findViewById(R.id.friday_text).getTop());
            return true;
        case R.id.sat_action:
            findViewById(R.id.schedule_scrollview).scrollTo(0, findViewById(R.id.saturday_text).getTop());
            return true;
        default:
            return super.onOptionsItemSelected(item);
	    }

	}
	
	public void openDetails(View v) {
	    Intent inno_intent = new Intent(this, Inno_1.class);
	    switch (v.getId()) {
	    case (R.id.keynote_button_1):
		    Intent keynote_1_intent = new Intent(this, Keynote_1.class);
		    startActivity(keynote_1_intent);
	    break;
	    case (R.id.keynote_button_2):
		    Intent keynote_2_intent = new Intent(this, Keynote_2.class);
		    startActivity(keynote_2_intent);
	    break;
	    case (R.id.keynote_button_3):
		    Intent keynote_3_intent = new Intent(this, Keynote_3.class);
		    startActivity(keynote_3_intent);
	    break;
	    case (R.id.keynote_button_4):
		    Intent keynote_4_intent = new Intent(this, Keynote_4.class);
		    startActivity(keynote_4_intent);
	    break;
	    case (R.id.keynote_button_5):
		    Intent keynote_5_intent = new Intent(this, Keynote_5.class);
		    startActivity(keynote_5_intent);
	    break;
	    case (R.id.keynote_button_6):
		    Intent keynote_6_intent = new Intent(this, Keynote_6.class);
		    startActivity(keynote_6_intent);
	    break;
	    case (R.id.inno_button_1):
		    startActivity(inno_intent);
	    break;
	    case (R.id.inno_button_2):
		    startActivity(inno_intent);
	    break;	    
	    case (R.id.inno_button_3):
		    startActivity(inno_intent);
	    break;	 
	    case (R.id.inno_button_4):
		    startActivity(inno_intent);
	    break;	

	    }
	}
}
