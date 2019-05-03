package com.java.demoPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//Serialization Testing using serialVersionUID
public class Employee implements Serializable
{
    private static final long serialVersionUID = 1L; 
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;
 
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {

    }
    
    public static void main (String args[]) {

       Employee employee = new Employee();
       employee.setFirstname("wall street");
       employee.setLastName("united states");

       try{

       FileOutputStream fout = new FileOutputStream("c:\\emp.ser");
       ObjectOutputStream oos = new ObjectOutputStream(fout);
       oos.writeObject(employee);
       oos.close();
       System.out.println("Done");

       }catch(Exception ex){
          ex.printStackTrace();
       }
       
       try{

          FileInputStream fin = new FileInputStream("c:\\emp.ser");
          ObjectInputStream ois = new ObjectInputStream(fin);
          employee = (Employee) ois.readObject();
          ois.close();

          System.out.println(employee.getFirstname()+ "-" +employee.getLastName());

       }catch(Exception ex){
          ex.printStackTrace();
       }
    }
   
}