package com.example.shelf;

public class ModelClass_Request {
//declaring private instance variables
    private String title;
    private String useremail;
    private String objectid;
    private String reject;
// A constructor with parameters of type string
    public ModelClass_Request(String title, String useremail, String objectid) {
        this.title = title;
        this.useremail = useremail;
        this.objectid=objectid;
        //this.accept = accept;
        //this.reject = reject;
    }

    public String getTitle() {
        return title;
    }

    public String getUseremail() {
        return useremail;
    }
     public String getObjectid() {
        return objectid;
    }

//    public String getReject() {
//        return reject;
//    }
}