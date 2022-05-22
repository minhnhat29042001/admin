/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class CourseStarRate {
    private String Course_ID;
    private int Star;
    private String Student_ID;

    public String getCourse_ID() {
        return Course_ID;
    }

    public void setCourse_ID(String Course_ID) {
        this.Course_ID = Course_ID;
    }

    public int getStar() {
        return Star;
    }

    public void setStar(int Star) {
        this.Star = Star;
    }

    public String getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(String Student_ID) {
        this.Student_ID = Student_ID;
    }

    public CourseStarRate(String Course_ID, int Star, String Student_ID) {
        this.Course_ID = Course_ID;
        this.Star = Star;
        this.Student_ID = Student_ID;
    }

    public CourseStarRate() {
    }
}
