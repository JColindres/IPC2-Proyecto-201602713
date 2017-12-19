/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author pablo
 */
@WebService(serviceName = "webservice")
public class webservice {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public String suma(@WebParam(name = "parameter1") 
    double parameter1, @WebParam(name = "parameter2") 
    double parameter2) {
        //TODO write your implementation code here:
        return String.valueOf(parameter1 + parameter2);
    }
}

