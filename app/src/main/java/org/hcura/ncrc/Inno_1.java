package org.hcura.ncrc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Inno_1 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inno_1);
		setTitle("Innovation Challenge");
	    TextView myTextView = (TextView) findViewById(R.id.inno_challenge_textview);
		myTextView.setText(Html.fromHtml("The <span class=\"il\">innovation</span> <span class=\"il\">challenge</span> was first created as a part of NCRC 2014 so that undergraduates across the country could utilize their diverse backgrounds to think of solutions to the pressing problems of our generation. At NCRC 2015, we will be tackling the issue of:<p dir=\"ltr\" style=\"text-align: center;\"><b>Technological Discovery: Catalyzing Interdisciplinary Progress</b></p>Though these issues are complex, we believe that the creativity of the nation’s brightest undergraduate researchers guided by the mentoring of experts in the field can spark new avenues of problem-solving which can have an incredibly lasting impact. So, prepare to dream big, hear new perspectives, and add your own! This year, we will be exploring the following issues:<p style=\"text-align: left;\"><b>ENGINEERING</b></p>The field of scientific engineering has arisen rapidly in recent decades, and its practitioners often seek to apply their work to a wide range of disciplines. What is the most fascinating material or process that you can imagine and how could it be used to fulfill an unmet need?<p style=\"text-align: left;\"><b>GOVERNMENT, TECHNOLOGY, SOCIOECONOMIC INEQUALITY</b></p>Consider how the decisions and priorities of government have been affected by the development of technologies that have introduced new possibilities and expanding potential. What policies or programs  have become feasible with the help of modern technology and can be implemented to help alleviate socioeconomic inequality in the United States?<p style=\"text-align: left;\"><b>CLIMATE CHANGE</b></p>Climate change promises to be one of the defining issues of the 21st century, yet it seems to attract much less research attention and public support than medical initiatives.  Describe a novel approach to climate change research, or a creative way to raise public engagement in addressing its challenges.<p style=\"text-align: left;\"><b>GLOBAL RIGHTS TO EDUCATION: WOMEN AND GIRLS</b></p>Even as we pass new frontiers in scientific discovery and economic prosperity, these advantages are not experienced by the millions of people around the world who are subject to unequal treatment and barred from educational opportunities. How can we use our knowledge and skills to advance and champion the global right to education, especially for women and girls?"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inno_1, menu);
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
