package com.project.inuadadafaundation.Models;

public class ProgramsModel {
    int image;
    String  header;
    int information;

    public ProgramsModel(int image, String header, int information) {
        this.image = image;
        this.header = header;
        this.information = information;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public int getInformation() {
        return information;
    }

    public void setInformation(int information) {
        this.information = information;
    }
}
