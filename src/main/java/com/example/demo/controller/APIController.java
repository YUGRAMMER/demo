package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
public class APIController {
    @PostMapping(value="/INIParyResult")
    public String INIParyResult(HttpServletRequest request){

        Enumeration<String> a = request.getParameterNames();
        String parm=null;
        String val="";
        String result = "";
        while(a.hasMoreElements()){
            parm=a.nextElement();
            val=request.getParameter(parm);
            result += "&" + parm + "=" + val;
        }
        return result;
    }
}
