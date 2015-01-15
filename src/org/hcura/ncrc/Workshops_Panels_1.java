package org.hcura.ncrc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Workshops_Panels_1 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_workshops_panels_1);
		setTitle("Workshops and Panels I");
	    TextView myTextView = (TextView) findViewById(R.id.workshops_panels_1_textview);
		myTextView.setText(Html.fromHtml("<h3>Workshops</h3><p><b>Research and Government Policy - Northwest Labs B106</b></p><p>Scientists today are a valuable resource not only in academia and research, but also in shaping public policy to influence the world at large. Learn more about this growing intersection between science research and policy design.</p><p><b>Entrepreneurship in Science - Northwest Labs B105</b></p><p>Startups are everywhere, and discoveries that begin in the laboratory often have wide-ranging applications to improve people's quality of life. Learn about the journey of an idea from the lab to a business.</p><p><b>Research Publishing - Northwest Labs B104</b></p><p>As any graduate student knows, publishing papers is an important component of one\'s career in the sciences. Learn more about this essential, but often confusing, process.</p><h3>Panels</h3><p><b>Medical School - Northwest Labs B101</b></p><p>A panel representing diverse perspectives, from administrative to student roles, will discuss medical school and its application process.</p><p><b>Industry vs. Academia - Northwest Labs B103</b></p><p>Panelists with experience as professors, venture capitalists, and entrepreneurs will discuss the merits and details of each path.</p><p><b>Environmental Research - Northwest Labs B108</b></p><p>Climate and environmental change are some of the most important challenges we face in the coming decades, and panelists will discuss their varied approaches to addressing these concerns.</p>"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.workshops_panels_1, menu);
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
