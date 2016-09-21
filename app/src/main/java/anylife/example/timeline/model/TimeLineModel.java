package anylife.example.timeline.model;

/**
 * 时间轴的事件定义
 *
 */
public class TimeLineModel {
    private String event;
    private String time;

    public TimeLineModel(String event, String time) {
        this.event = event;
        this.time = time;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
