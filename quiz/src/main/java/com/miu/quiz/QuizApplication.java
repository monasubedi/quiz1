package com.miu.quiz;

import java.util.Arrays;
import java.util.Comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.miu.quiz.model.Contact;
import com.miu.quiz.model.EmailAddress;
import com.miu.quiz.model.Phone;

@SpringBootApplication
public class QuizApplication {

	private static void printInJSON(Contact[] contacts){
		System.out.println("In JSON Format");
		System.out.println("[");
		for(Contact contact: contacts){
			
			System.out.println("{\" First Name\":" + contact.getFirstName() +", "+ "\"Last Name\":" + contact.getLastName()+", " + "\"Comapny\":" + contact.getCompany() + ", " +
				"\"JobTitle\":" + ", " + "\"Phone Number\":" + contact.getPhone().getPhoneNumber() + "\"Email Address\":" + contact.getEmailAddress().getEmailAddress() + "},"
			);
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Contact[] contacts = {
			new Contact("David","Sanger","Argos LLC","Sales Manager",new EmailAddress("dave.sang@gmail.com","Home"), new Phone("240-133-0011","Home")),
			new Contact("Carlos","Jimenez","Zappos","Director",new EmailAddress("",""),new Phone("","")),
			new Contact("Ali","Gafar","BMI Services","HR Manger",new EmailAddress("ali@bmi.com","Work"),new Phone("412-116-9988","Work"))
		};
		Arrays.sort(contacts,Comparator.comparing(Contact::getLastName));
		printInJSON(contacts);
		SpringApplication.run(QuizApplication.class, args);
	}

}
