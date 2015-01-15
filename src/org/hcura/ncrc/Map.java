package org.hcura.ncrc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        // Get a handle to the Map Fragment
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        LatLng nwlabs = new LatLng(42.380031, -71.115544);
        LatLng qhead = new LatLng (42.375979, -71.115444);
        LatLng pfoho = new LatLng (42.382364, -71.125013);
        LatLng cabot = new LatLng (42.381857, -71.123908);
        LatLng currier = new LatLng (42.381726, -71.125678);
        LatLng adams = new LatLng (42.372013, -71.117092);
        LatLng quincy = new LatLng (42.370830, -71.116716);
        LatLng lowell = new LatLng (42.371080, -71.118449);
        LatLng kirkland = new LatLng (42.370887, -71.120588);
        LatLng eliot = new LatLng (42.370110, -71.121077);
        LatLng winthrop = new LatLng (42.370379, -71.119248);
        LatLng dunster = new LatLng (42.371897, -71.114875);
        LatLng mather = new LatLng (42.368548, -71.115155);
        LatLng leverett = new LatLng (42.369840, -71.117118);
        LatLng tstop = new LatLng (42.373656, -71.118921);

        map.addMarker(new MarkerOptions()
            .title("Northwest Labs")
            .position(nwlabs));
        map.addMarker(new MarkerOptions()
     		.title("Queen's Head Pub")
     		.position(qhead));
        map.addMarker(new MarkerOptions()
			.title("Pforzheimer House")
			.position(pfoho));
        map.addMarker(new MarkerOptions()
			.title("Cabot House")
			.position(cabot));
        map.addMarker(new MarkerOptions()
			.title("Currier House")
			.position(currier));
        map.addMarker(new MarkerOptions()
			.title("Adams House")
			.position(adams));
        map.addMarker(new MarkerOptions()
			.title("Quincy House")
			.position(quincy));
        map.addMarker(new MarkerOptions()
        	.title("Lowell House")
			.position(lowell));
        map.addMarker(new MarkerOptions()
			.title("Eliot House")
			.position(eliot));
        map.addMarker(new MarkerOptions()
			.title("Kirkland House")
			.position(kirkland));
        map.addMarker(new MarkerOptions()
			.title("Mather House")
			.position(mather));
        map.addMarker(new MarkerOptions()
			.title("Dunster House")
			.position(dunster));
        map.addMarker(new MarkerOptions()
			.title("Leverett House")
			.position(leverett));
        map.addMarker(new MarkerOptions()
			.title("Winthrop House")
			.position(winthrop));
        map.addMarker(new MarkerOptions()
			.title("Harvard Square T Stop")
			.position(tstop));        
        
    }
 
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
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
	

	
