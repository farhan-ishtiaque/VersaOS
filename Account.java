package com.mycompany.project;

import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Account extends User implements Serializable {

    private static final long serialVersionUID = -5082004514139633001L;
    private int age;
    private String DOB;
    private String gender;
    private String phone;
    private String userID;
    private String question;

    public Account(int age, String DOB, String gender, String phone) {
        this.age = age;
        this.DOB = DOB;
        this.gender = gender;
        this.phone = phone;
    }

    public Account(int age, String DOB, String gender, String phone, String firstName, String lastName, String email, String password,String question) {
        super(firstName, lastName, email, password);
        this.age = age;
        this.DOB = DOB;
        this.gender = gender;
        this.phone = phone;
        this.userID = userIDgenerator();
        this.question = question;

    }

    private String userIDgenerator() {
        Random random = new Random();

        int min = 1000;
        int max = 9999;

        int ID = random.nextInt(max - min + 1) + min;
        String userID = Integer.toString(ID);
        return userID;
    }

    public String getDOB() {
        return DOB;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getUserID() {
        return userID;
    }

    public static int getAge(String DOB) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            LocalDate dob = new SimpleDateFormat("yyyy-MM-dd").parse(DOB).toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            LocalDate current = LocalDate.now();
            Period agePeriod = Period.between(dob, current);
            int age = agePeriod.getYears();
            return age;
        } catch (ParseException ex) {
            System.out.println("Parse Exception: " + ex.getMessage());
            return 0;
        }
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return Integer.toString(age);
    }

    public void setAge(String DOB) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            LocalDate dob = new SimpleDateFormat("yyyy-MM-dd").parse(DOB).toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            LocalDate current = LocalDate.now();
            Period agePeriod = Period.between(dob, current);
            this.age = agePeriod.getYears();

        } catch (ParseException ex) {
            System.out.println("Parse Exception: " + ex.getMessage());
        }
    }

    public String getQuestion() {
        return question;
    }
    
    

}
