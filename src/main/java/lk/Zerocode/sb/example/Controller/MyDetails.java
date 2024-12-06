package lk.Zerocode.sb.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MyDetails {

    String name;
    String email;

    //constructor
    public MyDetails(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }







}
