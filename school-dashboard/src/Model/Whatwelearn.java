/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Whatwelearn {
    private String ID_COURSE;
    private String WHATWELEARN;

    public String getID_COURSE() {
        return ID_COURSE;
    }

    public void setID_COURSE(String ID_COURSE) {
        this.ID_COURSE = ID_COURSE;
    }

    public String getWHATWELEARN() {
        return WHATWELEARN;
    }

    public void setWHATWELEARN(String WHATWELEARN) {
        this.WHATWELEARN = WHATWELEARN;
    }

    public Whatwelearn(String ID_COURSE, String WHATWELEARN) {
        this.ID_COURSE = ID_COURSE;
        this.WHATWELEARN = WHATWELEARN;
    }

    public Whatwelearn() {
    }
}
