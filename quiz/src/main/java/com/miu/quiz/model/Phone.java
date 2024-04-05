package com.miu.quiz.model;

public class Phone {
    private Number phoneNumber;
    private String label;

    public Phone(){

    }
    public Phone(Number phoneNumber,String label){
        this.phoneNumber = phoneNumber;
        this.label = label;
    }
    public void setPhoneNumber(Number phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public Number getPhoneNumber(){
        return phoneNumber;
    }
    public String getLabel(){
        return label;
    }
}
