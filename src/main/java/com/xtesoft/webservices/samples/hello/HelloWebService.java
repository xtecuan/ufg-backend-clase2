/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.xtesoft.webservices.samples.hello;

import com.xtesoft.webservices.samples.hello.model.Persona;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;


/**
 *
 * @author xtecuan
 */
@WebService(serviceName = "HelloWebService")
public class HelloWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "helloPerson")
    public String helloPerson(@WebParam(name = "persona") Persona persona){
        return "Hello: "+persona.toString();
    }
}
