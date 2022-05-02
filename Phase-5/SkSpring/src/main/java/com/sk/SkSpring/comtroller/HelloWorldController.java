package com.sk.SkSpring.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
 
 @GetMapping(path="/")
 public String sayHello() {
  return "Hello!! This is Sai Krishna Creating Spring demo.";
 }

}