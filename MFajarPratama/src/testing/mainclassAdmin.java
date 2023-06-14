/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;
import testing.testAdmin;

/**
 *
 * @author Asus
 */
public class mainclassAdmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testAdmin data = new  testAdmin (111,"admin","admin");
        System.out.println("ID :  "+data.getIdadmin());
        System.out.println("Username : "+data.getUsername());
        System.out.println("Password : "+data.getPassword());
    }
    
}
