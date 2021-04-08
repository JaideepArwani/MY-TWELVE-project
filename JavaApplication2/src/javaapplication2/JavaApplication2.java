/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Admin
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
   class father{
   int FatherAge=55;
   String FatherName="Ali";
   void FatherMethod(){
   System.out.println("Father Name : "+FatherName);
   System.out.println("Father Age : "+FatherAge);
   }}
  class son0ne extends Father{
      int SonOneAge=30;
      String SonOneName="GUL";
      void Fathermethod(){
          System.out.println("Son One Name : "+SonOneName);
          System.out.println("Son one Age : "+SonOneAge);
      }
      
      }
  class SonTwo extends Father{
      int SonTwoAge=20;
      String SonTwoName="ASAD";
      void FatherMethod(){
          System.out.println("Son Two Name : "+SonTwoName);
          System.out.println("Son Two Age : "+SonTwoAge);
          
      }
  }}
       

