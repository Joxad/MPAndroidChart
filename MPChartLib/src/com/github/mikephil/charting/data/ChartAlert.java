package com.github.mikephil.charting.data;

/**
 * Created by josh on 10/12/15.
 */
public class ChartAlert {
    public String title;
    public String message;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ChartAlert(String title, String message) {

        this.title = title;
        this.message = message;
    }

    public ChartAlert(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

