package com.example.lunger.view.event;

/**
 * Created by Awen on 2015/11/4.
 */
public class MainEvent extends BaseEvent {

    public static final int TYPE_ONE = 1;
    public static final int TYPE_TWO = 2;

    public static MainEvent getInstance(int id){
        MainEvent event = new MainEvent();
        event.setEventId(id);
        return event;
    }

}
