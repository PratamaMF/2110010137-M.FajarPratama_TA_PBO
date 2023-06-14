/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

/**
 *
 * @author Asus
 */
public class testAdmin {
    private int id_admin;
    private String username;
    private String password;
    
    public testAdmin(int id_admin, String username, String password){
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
    }
    
    public int getIdadmin(){
        return id_admin;
    }
    public void setIdadmin(int id_admin){
        this.id_admin = id_admin;
    }
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
