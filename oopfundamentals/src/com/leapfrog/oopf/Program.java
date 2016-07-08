package com.leapfrog.oopf;
import com.leapfrog.oopf.Bike.Apache;
import com.leapfrog.oopf.Bike.Glamour;
import com.leapfrog.oopf.Entity.Bike;
import com.leapfrog.oopf.Entity.Fan;
import com.leapfrog.oopf.Entity.Person;
import com.leapfrog.oopf.Fan.CellingFan;
import com.leapfrog.oopf.Fan.TableFan;
import com.leapfrog.oopf.Person.Student;
import com.leapfrog.oopf.Person.Teacher;

/**
 *
 * @author Anonymous
 */
public class Program {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//person info start
        Person s = new Student();
        s.setFirstname("Sajaya");
        s.setLastname("Sapkota");
        s.setAge(17);
        s.setGender("Male");
        System.out.println("================================");
        System.out.println("\t  Student Details");
        System.out.println("================================");
        System.out.println("Full name:" + s.getFullname());
        System.out.println("Age:" + s.getAge());
        System.out.println("Gender:" + s.getGender());
        Person t = new Teacher();
        t.setFirstname("Dixanta");
        t.setLastname("Shrestha");
        t.setAge(35);
        t.setGender("Male");
        System.out.println("================================");
        System.out.println("\t  Teacher Details");
        System.out.println("================================");
        System.out.println("Full name:" + t.getFullname());
        System.out.println("Age:" + t.getAge());
        System.out.println("Gender:" + t.getGender());
//person info end  

        //bike info start      
        Bike g = new Glamour();
        g.setBrandname("Glamour 125");
        g.setColor("Red");
        g.setCompany("Hero");
        g.setNumber("Ba 75 Pa 1234");
        System.out.println("================================");
        System.out.println("\t" + g.getBrandname());
        System.out.println("================================");
        System.out.println("Brand Name:" + g.getBrandname());
        System.out.println("Color:" + g.getColor());
        System.out.println("Company:" + g.getCompany());
        System.out.println("Number:" + g.getNumber());

        Bike a = new Apache();
        a.setBrandname("Apache 160");
        a.setColor("Blue");
        a.setCompany("Tvs");
        a.setNumber("Ba 75 Pa 1234");
        System.out.println("================================");
        System.out.println("\t" + a.getBrandname());
        System.out.println("================================");
        System.out.println("Brand Name:" + a.getBrandname());
        System.out.println("Color:" + a.getColor());
        System.out.println("Company:" + a.getCompany());
        System.out.println("Number:" + a.getNumber());
//bike info end

//Fan info Start           
        Fan tf = new TableFan();
        tf.setBrand("IDK");
        tf.setCompany("Panasonic");
        tf.setPrice(4999.50);
        System.out.println("================================");
        System.out.println("\t" + tf.getBrand());
        System.out.println("================================");
        System.out.println("Brand Name:" + tf.getBrand());
        System.out.println("Company:" + tf.getCompany());
        System.out.println("Price:" + tf.getPrice());

        Fan cf = new CellingFan();
        cf.setBrand("IDK");
        cf.setCompany("bbb");
        cf.setPrice(5999.50);
        System.out.println("================================");
        System.out.println("\t" + cf.getBrand());
        System.out.println("================================");
        System.out.println("Brand Name:" + cf.getBrand());
        System.out.println("Company:" + cf.getCompany());
        System.out.println("Price:" + cf.getPrice());
        System.out.println("================================");
//Fan info end

    }

}
