/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

public class AdminPanel {

    Administrator admin;
    Moderator mod;
    private static AdminPanel panel = null;

    private AdminPanel() {
        createDatabase();
    }

    private void createDatabase() {

        admin = new Administrator("Shafin", "Chowdhury", "shafin@gmail.com", "Superadmin1234");
        mod = new Moderator("Rakin", "Hasan", "rakin@gmail.com", "Moderator1234");
    }

    public static AdminPanel getPanel() {
        if (panel == null) {
            panel = new AdminPanel();
        }

        return panel;

    }
    
    public Administrator getAdministrator(){
        return admin;
    }
    public Moderator getModerator(){
        return mod;
    }
}
