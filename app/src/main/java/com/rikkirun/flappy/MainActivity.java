package com.rikkirun.flappy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get listView object from xml.
        ListView eventListView = (ListView)findViewById(R.id.event_list);

        //assign adapter to ListView
        EventAdapter adapter = new EventAdapter(this);
        eventListView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Life cycle test", "We are at onStart()");
    }

    @Override
    protected  void onResume() {
        super.onResume();
        Log.e("Life cycle test", "We are at onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Life cycle test", "We are at onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Life cycle test", "We are at onStop()");
    }

    @Override
    protected  void onDestroy() {
        super.onDestroy();
        Log.e("Lift cycle test", "We are at onDestroy()");
    }
}

//https://medium.com/code-yoga/how-to-link-android-studio-with-github-312037a13b99
