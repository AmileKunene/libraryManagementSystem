

package com.mycompany.librarymanagementsystem;
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Book objBook = new Book();
       
       Journal objJournal = new Journal();
       
       System.out.println("1. Borrow Book");
       System.out.println("2. Return Book");
       System.out.println("3. Borrow Journal");
       System.out.println("4. Return Journal");
       System.out.println("5. Exit");
       
       String userInput = scanner.nextLine();
       
       switch(userInput){
           case "1":
                objBook.checkOut();
                break;
           case "2":
                objBook.returnLibItem();
                break;
           case "3":
               objJournal.checkOut();
               break;
           case "4":
               objJournal.returnLibItem();
               break;
           case "5": 
               System.exit(0);
           default: 
               System.out.println("INVALID INPUT!!!!!");
       }
       
       
    }
}
