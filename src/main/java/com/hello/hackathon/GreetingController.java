package com.hello.hackathon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class GreetingController   
{  
@RequestMapping("/")  
public String hello()   
{  
return "Hi Infinity Labs Team !! Successfully deployed...";  
}  
}  