package com.demo1.productservices.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class SampleController {
    @GetMapping("/hello/{name}/{times}")
      public String sayHello(@PathVariable("name") String name, @PathVariable("times") int count) {
          String output ="";
          for(int i =0; i<count; i++) {
              output = output + "Hello " + name;
          }
         return output;
      }

      @GetMapping("/bye/{name}")
    public String sayBye(@PathVariable("name") String name) {
        return "Bye "+ name;
      }
}
