package lk.Zerocode.sb.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //method
    @PutMapping(value ="/hello")
    public MyDetails getMyDetails(){
        System.out.println("-----");
        return new MyDetails("abcd","abc@gmail.com");

    }
}

