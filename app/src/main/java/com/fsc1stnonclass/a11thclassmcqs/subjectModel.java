package com.fsc1stnonclass.a11thclassmcqs;

public class subjectModel {

    private String name;
    private int chapters;
    private String url;

    public subjectModel(){
        //for firebase
    }

    public subjectModel(String name, int chapters, String url) {
        this.name = name;
        this.chapters = chapters;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
