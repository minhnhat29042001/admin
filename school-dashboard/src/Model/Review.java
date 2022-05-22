/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Review {
    private String ID_REVIEW;
    private String ID_COURSE;
    private String ID_STUDENT;
    private int Star;
    private String COMMENT;

    public Review() {
    }

    public Review(String ID_REVIEW, String ID_COURSE, String ID_STUDENT, int Star, String COMMENT) {
        this.ID_REVIEW = ID_REVIEW;
        this.ID_COURSE = ID_COURSE;
        this.ID_STUDENT = ID_STUDENT;
        this.Star = Star;
        this.COMMENT = COMMENT;
    }

    public String getID_REVIEW() {
        return ID_REVIEW;
    }

    public void setID_REVIEW(String ID_REVIEW) {
        this.ID_REVIEW = ID_REVIEW;
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

    public int getStar() {
        return Star;
    }

    public void setStar(int Star) {
        this.Star = Star;
    }

    public String getCOMMENT() {
        return COMMENT;
    }

    public void setCOMMENT(String COMMENT) {
        this.COMMENT = COMMENT;
    }
    
}
