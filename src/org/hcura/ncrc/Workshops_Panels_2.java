package org.hcura.ncrc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Workshops_Panels_2 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_workshops_panels_2);
		setTitle("Workshops and Panels II");
	    TextView myTextView = (TextView) findViewById(R.id.workshops_panels_2_textview);
		myTextView.setText(Html.fromHtml("<h3>Workshops</h3><p><b>Innovative Technology - Northwest Labs B104</b></p><p>Technology continues to advance at an exponential rate, changing the status quo in almost every industry. Learn about some of the newest and most promising technologies being developed today, and how they might affect you.</p><p><b>Brevia - Northwest Labs B105</b></p><p>Brevia is the official publication of the Harvard College Undergraduate Research Association, a forum for science, culture and other big ideas. It is committed to bringing all disciplines of research out of the ivory tower and into the discourse of the interested public. In this workshop, learn more about the publication and how to start a magazine publication at your own school.</p><h3>Panels</h3><p><b>Grad Schol/Fellowships - Northwest Labs B101</b></p><p>A panel representing diverse perspectives, from administrative to student roles, will discuss graduate school, fellowships, and their application processes.</p><p><b>Joint Degree Programs - Northwest Labs B103</b></p><p>Panelists who have pursued joint degrees: MD, PhD, MPH, and MBA will discuss their experiences and joint degree programs.</p><p><b>Research in the Humanities and Social Science - Northwest Labs B108</b></p><p>Learn from distinguished researchers in the humanitites about pursuing an academic career in these subjects.</p>"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.workshops_panels_2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		/*int id = item.getItemId();*/
		return super.onOptionsItemSelected(item);
	}
}
