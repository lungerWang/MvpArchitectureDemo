package com.example.lunger.view.event;

/**
 * Created by Lunger on 2017/3/31.
 * EventBus event基类
 */

public class BaseEvent {
    private int eventId;
    private Object data;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
