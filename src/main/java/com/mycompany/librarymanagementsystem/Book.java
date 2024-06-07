
package com.mycompany.librarymanagementsystem;




public class Book implements LibraryInterface {
         
    
          @Override
          public  void  checkOut(){
            System.out.println("You have borrowed a book");
            }
          
        @Override
       public  void returnLibItem(){
         System.out.println("book is returnd");
         }
}
