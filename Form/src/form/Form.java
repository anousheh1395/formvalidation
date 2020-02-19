/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.Scanner;

/**
 *
 * @author anousheh
 */
public class Form {

    private static String String;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("please enter your name for form validation:");
        String username=input.next();
        
          System.out.println("please enter your password for form validation:");
        String pass=input.next();
        
     if (username.matches("[A-Za-z0-9!@#_?-_]+")&&
            username!=null&&
            username.length()>8 && pass.matches("[A-Za-z0-9!@#_?-_]+")
             && pass!=null && pass.length()>5) {
                System.out.println("Valid username AND passwor");
            } else {
                System.out.println("Invalid username OR password ");
            }    
       
        
              
    }
   

}