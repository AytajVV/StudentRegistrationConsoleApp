/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import beans.Student;
import java.util.Scanner;
import util.InputUtil;
import util.MenuUtil;
import util.StudentUtil;

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

        int menu = 0;

        while (true) {
            menu = InputUtil.requireNumber("What do you want to do?"
                    + "\n1-Register student"
                    + "\n2-Show all students"
                    + "\n3-Find student"
                    + "\n4-Update student"
                    + "\n5-Exit");

            MenuUtil.processMenu(menu);
            }
        }
        
    }


