package com.miu.quiz.model;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private EmailAddress email;
    private Phone phone;


    public Contact(){

    }
    public Contact(String firstName,String lastName,String company,String jobTitle,EmailAddress email,Phone phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setEmailAddress(EmailAddress emailAddress){
        this.email = emailAddress;
    }
    public void setPhone(Phone phone){
        this.phone = phone;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCompany(){
        return company;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public EmailAddress getEmailAddress(){
        return email;
    }
    public Phone getPhone(){
        return phone;
    }
}
