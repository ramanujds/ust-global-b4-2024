package com.ust.app.model;
public class Trainee {

    // fields/state/properties
    private int id;
    private String name;
    private String email;
    private String city;
    private String college;
    private static String company;




    public Trainee(int id, String name, String email, String city, String college) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.city = city;
        this.college = college;
    }

    public Trainee(){

    }

    public Trainee(int id){
        this.id=id;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Trainee.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    // behaviour/methods
    public void joinSession(){
        System.out.println(name+" has joined session");
    }

   void leaveSession(){
        System.out.println(name+" has left the session");
    }

  public void displayTrainee(){
        System.out.println("Details of Trainee : "+name);
        System.out.println("-".repeat(100));
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("City : "+city);
        System.out.println("College : "+college);
        System.out.println("Company : "+company);
        System.out.println();
    }

}
