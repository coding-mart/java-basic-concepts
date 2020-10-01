/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

import java.util.Date;

/**
 *
 * @author QasimAli
 */
class  Person{
     public String name;
     public String address;
     public long  phonenum;
     public String email;
     
     public Person(){
         name=null;
         address=null;
         phonenum=0;
         email=null;
     }
     
     public Person(String name,String address,long phonenum,String email){
         this.name=name;
         this.address=address;
         this.phonenum=phonenum;
         this.email=email;
     }
     
     public void display(){
         System.out.println("Name: "+name+"\naddress: "+address+"\nPhone Number: "+phonenum+"\nEmail: "+email);
     }    
}
class Student extends Person{
    public String status;
    public Student(){
        super();
        status=null;
    }
    public Student(String name,String address,long phonenum,String email,String status){
        super(name,address,phonenum,email);
        this.status=status;
    }
   public void display(){
       super.display();
       System.out.println("status is: "+status);
   }
}

class Employee extends Person{
    public String Office;
    public int Salary;
    Date date_hired;
    public Employee(){
         super();
         Office=null;
         Salary=0;
         date_hired=null; 
    }
    
    public Employee(String name,String address,long phonenum,String email,String status,int Salary){
        super(name,address,phonenum,email);
        Office=status;
        this.Salary=Salary;
        date_hired=new Date();
    }
    
    public void display(){
       super.display();
       System.out.println("Office is: "+Office+"\nSalary is : "+Salary+"\nhiring date: "+date_hired);
   }   
}

   class Faculty extends Employee{
       public int office_hours;
       public String rank;
       public Faculty(){
           super();
           office_hours=0;
           rank=null;
       }
       
       public Faculty(String name,String address,long phonenum,String email,String status,int Salary,int office_hours,String rank){
           super(name,address,phonenum,email,status,Salary);
           this.office_hours=office_hours;
           this.rank=rank;
       }
       public void display(){
       super.display();
       System.out.println("Office Hours: "+office_hours+"\nRank is : "+rank);
   }   
   }

 class Staff extends Employee{
     public String title;
     public Staff(){
         super();
         title=null;
     }
     public Staff(String name,String address,long phonenum,String email,String status,int Salary,String title){
         super(name,address,phonenum,email,status,Salary);
         this.title=title;
     }
     public void display(){
       super.display();
       System.out.println("Title of Staff member is : "+title);
   }   
     
 }

public class Activity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Faculty f=new Faculty("Wajid khan","islamabad",034050234,"wajid643@gmail.com","B6",70000,6,"HOD");
        System.out.println("Faculty member\n");
        f.display();
        System.out.println("");
        Staff s =new Staff("Qasim Ali","islamabad",0333456334,"qa42346@gmail.com","A3",80000,"Teacher");
        System.out.println("Staff member\n");
        s.display();

    }
    
}
