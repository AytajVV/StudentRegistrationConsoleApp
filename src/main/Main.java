/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import beans.Student;
import java.util.Scanner;

/**
 *
 * @author aytaj.veyisli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("What do you want to do?"
                + "\n1-Register student"
                + "\n2-Show all students"
                + "\n3-Find student"
                + "\n4-Update student"
                + "");
        
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        
        
        if (menu == 1) {
            sc = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            
            sc = new Scanner(System.in);
            System.out.println("Enter surname: ");
            String surname = sc.nextLine();
            
            sc = new Scanner(System.in);
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            
            sc = new Scanner(System.in);
            System.out.println("Enter class name: ");
            String className = sc.nextLine();
            
            
            Student st = new Student(name, surname, age, className);
            
        }
        
        
    }
    
}
