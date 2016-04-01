package com.example.rowrowapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EventsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);
        setTitle(R.string.title_activity_event_list);
    }
}
