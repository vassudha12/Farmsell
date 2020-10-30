package com.e.farmsell;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Farmerlogin<savedInstanceState> extends AppCompatActivity /*implements OnMapReadyCallback*/ implements AdapterView.OnItemClickListener{

/*private MapView mMapView;

private static final String MAPVIEW_BUNDLE_KEY = "MapViewBundleKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmerlogin);

        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar) ;
*/
    Spinner category;
    Spinner state;
    Spinner produce;

    String datastate[]={"Select State", "UttarPradesh", "Bihar","Maharastra","Jammu&Kashmir"};
    String datacategory[]={"Select Category", "Grains", "Vegetable","Fruit","Pulses","Cereal"};
    String dataproduce[]={"Select Product", "Onion", "Potato","Carrort","Apple"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmerlogin);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Spinner category = (Spinner) findViewById(R.id.spinner);
        Spinner state = (Spinner) findViewById(R.id.spinner1);
        Spinner produce = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<CharSequence> adapter1;
        ArrayAdapter<CharSequence> adapter2;
        ArrayAdapter<CharSequence> adapter3;

        adapter1 = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_spinner_item, datacategory);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        category.setAdapter(adapter1);

     /*   Bundle mapViewBundle = null;
        if (savedInstanceState!=null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY);
        }
        mMapView = (MapView) findViewById(R.id.map);
        mMapView.onCreate(mapViewBundle);

        mMapView.getMapAsync(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Bundle mapViewBundle = outState.getBundle(MAPVIEW_BUNDLE_KEY);
        if (mapViewBundle == null) {
            mapViewBundle = new Bundle();
            outState.putBundle(MAPVIEW_BUNDLE_KEY, mapViewBundle);
        }

        mMapView.onSaveInstanceState(mapViewBundle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mMapView.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mMapView.onStop();
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
    }

    @Override
    protected void onPause() {
        mMapView.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        mMapView.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu ){
        getMenuInflater().inflate(R.menu.farmermenu,menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Toast", Toast.LENGTH_SHORT).show();
    }
}



