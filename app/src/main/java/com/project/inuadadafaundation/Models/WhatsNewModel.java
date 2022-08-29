package com.project.inuadadafaundation.Models;

public class WhatsNewModel {
    String date;
    int image;
    String heading;
    String description;

    public WhatsNewModel(String date, int image, String heading, String description) {
        this.date = date;
        this.image = image;
        this.heading = heading;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
