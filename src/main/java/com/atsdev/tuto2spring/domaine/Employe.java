package com.atsdev.tuto2spring.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Employe implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String fistName;
    private String lastName;
    private String phoneNumer;
    private int age;

    public Employe() {
    }

    public Employe(String fistName, String lastName, String phoneNumer, int age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.phoneNumer = phoneNumer;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employe{");
        sb.append("id=").append(id);
        sb.append(", fistName='").append(fistName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", phoneNumer='").append(phoneNumer).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
