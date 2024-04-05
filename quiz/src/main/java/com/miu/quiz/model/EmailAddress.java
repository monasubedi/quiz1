package com.miu.quiz.model;

public class EmailAddress {
    private String emailAddress;
    private String label;

    public EmailAddress(){

    }
    public EmailAddress(String emailAddress,String label){
        this.emailAddress = emailAddress;
        this.label = label;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String getLabel(){
        return label;
    }

}
