/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Admin {
    private String ID_ADMIN;
    private String NAME_ADMIN;
    private String USERNAME_ADMIN;
    private String PASSWORD_ADMIN;
    private String PHONENUMBER_ADMIN;

    public String getID_ADMIN() {
        return ID_ADMIN;
    }

    public void setID_ADMIN(String ID_ADMIN) {
        this.ID_ADMIN = ID_ADMIN;
    }

    public String getNAME_ADMIN() {
        return NAME_ADMIN;
    }

    public void setNAME_ADMIN(String NAME_ADMIN) {
        this.NAME_ADMIN = NAME_ADMIN;
    }

    public String getUSERNAME_ADMIN() {
        return USERNAME_ADMIN;
    }

    public void setUSERNAME_ADMIN(String USERNAME_ADMIN) {
        this.USERNAME_ADMIN = USERNAME_ADMIN;
    }

    public String getPASSWORD_ADMIN() {
        return PASSWORD_ADMIN;
    }

    public void setPASSWORD_ADMIN(String PASSWORD_ADMIN) {
        this.PASSWORD_ADMIN = PASSWORD_ADMIN;
    }

    public String getPHONENUMBER_ADMIN() {
        return PHONENUMBER_ADMIN;
    }

    public void setPHONENUMBER_ADMIN(String PHONENUMBER_ADMIN) {
        this.PHONENUMBER_ADMIN = PHONENUMBER_ADMIN;
    }

    public Admin(String ID_ADMIN, String NAME_ADMIN, String USERNAME_ADMIN, String PASSWORD_ADMIN, String PHONENUMBER_ADMIN) {
        this.ID_ADMIN = ID_ADMIN;
        this.NAME_ADMIN = NAME_ADMIN;
        this.USERNAME_ADMIN = USERNAME_ADMIN;
        this.PASSWORD_ADMIN = PASSWORD_ADMIN;
        this.PHONENUMBER_ADMIN = PHONENUMBER_ADMIN;
    }

    public Admin() {
    }
}
