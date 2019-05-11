/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.loan.javapayment;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author arena
 */
@WebService(serviceName = "loanpaymentwebservice")
public class loanpaymentwebservice {

    /**
     * This is a sample web service operation
     */
   // @WebMethod(operationName = "hello")
    //MONTHLY LOAN PAYMENT
    @WebMethod(operationName = "monthlyloanpayment")
    public float monthlyloanpayment(@WebParam(name="interest") float num1,@WebParam(name="principal") float num2,
    @WebParam(name="time") float num3, @WebParam(name="months") float num4)
   {
        return (int) (num1/100*num2*num3/num4);
    }
    
    // METHOD FOR TOTAL LOAN PAYMENT
    @WebMethod(operationName = "totalloanpayment")
    public float totalloanpayment(@WebParam(name="interest") float I,@WebParam(name="principal") float P)
   {
        return ((I/100)*P+P);
    }
    
    //METHOD FOR TOTAL INTEREST
    @WebMethod(operationName = "totalinterest")
    public float totalinterest(@WebParam(name="interest") float x,@WebParam(name="principal") float y)
   {
        return (x/100*y);
   }
    
    //@WebMethod(operationName = "totalinterest1")
   // public float totalinterest1(@WebParam(name="interest") float x,@WebParam(name="principal") float y,
   // @WebParam(name="time") float z)
   //{
   //    return ((x/100*y)*z);
       
   // }
}
