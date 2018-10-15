package com.rikkirun.flappy;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<Event>();
        for(int i = 0; i < 10; ++i) {
            eventData.add(
                    new Event("Event", "860E 500S, Salt Lake City, UT", "This is my home")
            );
        }
        return eventData;
    }
}
