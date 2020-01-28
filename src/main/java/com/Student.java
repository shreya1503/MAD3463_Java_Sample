package com;

import java.util.Date;

enum Gender
{
    MALE,
    FEMALE,
    OTHERS
}

public class Student
{

    private int studentId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Gender gender;
    private float totalMarks;
    private float percentage;
    private String result;
    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int m5;


    public void setData(int studentId, String firstName, String lastName, Date birthDate, Gender gender, float totalMarks, int m1, int m2, int m3, int m4, int m5)
    {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.totalMarks = totalMarks;
        this.percentage = percentage;
        this.result = result;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;



    }

    public void printData()
    {
        System.out.println("Student id : " + studentId);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Birth Date : " + birthDate);
        System.out.println("Gender : " + gender);
        System.out.println("Subject 1 Marks : " +m1);
        System.out.println("Subject 2 Marks : " +m2);
        System.out.println("Subject 3 Marks : " +m3);
        System.out.println("Subject 4 Marks : " +m4);
        System.out.println("Subject 5 Marks : " +m5);
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Percentage : " +percentage + " %");
        System.out.println("Result : " +result);

    }

    public void calculateMarks() {
        totalMarks = m1 + m2 + m3 + m4 + m5;
        //System.out.println("Total Marks = " +totalMarks);

    }

    public void percentage()
    {
        this.percentage = (totalMarks * 100) / 500;
        // System.out.println("Percentage = " +percentage);
    }

    public void result()
    {
        if(percentage < 50 )
        {
            result = "Fail";
        }
        else
        {
            // System.out.println("Student is PASSED");
            result = "Fail";
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


}
