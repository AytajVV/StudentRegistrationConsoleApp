/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author aytaj.veyisli
 */
public class MenuUtil {
    public static void processMenu(int selectedMenu){
        
        switch (selectedMenu) {
                case 1:
                    StudentUtil.registerStudents();
                    break;
                case 2:
                    StudentUtil.printAllRegisteredStudents();
                    break;
                case 3:
                    StudentUtil.findStudentsAndPrint();
                    break;
                case 4:
                    StudentUtil.updateStudentWithSameObject();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
        }
    }
}
