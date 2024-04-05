package com.miu.quiz.model;

public class Phone {
    private String phoneNumber;
    private String label;

    public Phone(){

    }
    public Phone(String phoneNumber,String label){
        this.phoneNumber = phoneNumber;
        this.label = label;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getLabel(){
        return label;
    }
}
