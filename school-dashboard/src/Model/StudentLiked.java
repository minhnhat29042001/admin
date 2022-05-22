/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class StudentLiked {
    private String ID_LIKE;
    private String ID_COURSE;
    private String ID_STUDENT;

    @Override
    public String toString() {
        return ID_LIKE ;
    }

    public String getID_LIKE() {
        return ID_LIKE;
    }

    public void setID_LIKE(String ID_LIKE) {
        this.ID_LIKE = ID_LIKE;
    }

    public String getID_COURSE() {
        return ID_COURSE;
    }

    public void setID_COURSE(String ID_COURSE) {
        this.ID_COURSE = ID_COURSE;
    }

    public String getID_STUDENT() {
        return ID_STUDENT;
    }

    public void setID_STUDENT(String ID_STUDENT) {
        this.ID_STUDENT = ID_STUDENT;
    }

    public StudentLiked(String ID_LIKE, String ID_COURSE, String ID_STUDENT) {
        this.ID_LIKE = ID_LIKE;
        this.ID_COURSE = ID_COURSE;
        this.ID_STUDENT = ID_STUDENT;
    }

    public StudentLiked() {
    }
}
