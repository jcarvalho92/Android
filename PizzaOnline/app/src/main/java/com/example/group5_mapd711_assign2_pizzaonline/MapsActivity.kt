package com.example.group5_mapd711_assign2_pizzaonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        // Add a marker in Toronto
        val toronto = LatLng(43.6550156,-79.3853865)
        mMap.addMarker(MarkerOptions().position(toronto).title("MAPD Pizza in Toronto").snippet("Dundas St West At Yonge St"))

        // Add a marker in Mississauga
        val mississauga = LatLng(43.5772409, -79.63443)
        mMap.addMarker(MarkerOptions().position(mississauga).title("MAPD Pizza in Mississauga"))
        // Add a marker in Mississauga

        val scarborough = LatLng(43.7756056, -79.2600572)
        mMap.addMarker(MarkerOptions().position(scarborough).title("MAPD Pizza in Scarborough"))

        // Add a marker in Oakville
        val oakville = LatLng(43.4616012, -79.6891012)
        mMap.addMarker(MarkerOptions().position(oakville).title("MAPD Pizza in Oakville"))

        // Add a marker in North York
        val northYork = LatLng(43.748956, -79.3977647)
        mMap.addMarker(MarkerOptions().position(northYork).title("MAPD Pizza in North York"))

        val builder = LatLngBounds.Builder()

        //the include method will calculate the min and max bound.
        builder.include(toronto)
        builder.include(mississauga)
        builder.include(scarborough)
        builder.include(oakville)
        builder.include(northYork)


        val bounds = builder.build();

        val padding = 150; // offset from edges of the map in pixels
        val cam = CameraUpdateFactory.newLatLngBounds(bounds, padding)
        googleMap.moveCamera(cam);
    }
}