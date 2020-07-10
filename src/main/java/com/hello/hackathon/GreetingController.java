package com.hello.hackathon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class GreetingController   
{  
@RequestMapping("/")  
public String hello()   
{  
return "<h2>Hi <i>Infinity Labs</i> Team !! Hope you are enjoying this demo session on docker.. :) </h2>";  
}  
}  