
package com.mycompany.librarymanagementsystem;


public class Journal implements LibraryInterface{
       
       @Override
       public  void  checkOut(){
            System.out.println("You have have borrowed a journal");
            }
       @Override
       public  void returnLibItem(){
         System.out.println("Journal is returnd");
         }
}
