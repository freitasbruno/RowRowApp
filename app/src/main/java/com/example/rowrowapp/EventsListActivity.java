package com.example.rowrowapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);
        setTitle(R.string.title_activity_event_list);

        // 1. pass context and data to the custom adapter
        EventListArrayAdapter adapter = new EventListArrayAdapter(this, generateData());

        // 2. Get ListView from activity_main.xml
        ListView listView = (ListView) findViewById(R.id.listview);

        // 3. setListAdapter
        if (listView != null) {
            listView.setAdapter(adapter);
            listView.getFirstVisiblePosition();
        }
    }

    private ArrayList<Event> generateData(){
        ArrayList<Event> events = new ArrayList<>();
        for (int i = 1; i <= 10; i++ ){
            events.add(new Event(i, "Event " + i, "Event " + i + " description" ));
        }

        return events;
    }
}
