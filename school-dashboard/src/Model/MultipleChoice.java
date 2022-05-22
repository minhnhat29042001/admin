/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class MultipleChoice {
    private String ID_MTPC;
    private String ID_COURSE;
    private String QUESTION;
    private String OPTIONA;
    private String OPTIONB;
    private String OPTIONC;
    private String OPTIOND;
    private String correctAnswer;
    private int SCORE;

    public String getID_MTPC() {
        return ID_MTPC;
    }

    public void setID_MTPC(String ID_MTPC) {
        this.ID_MTPC = ID_MTPC;
    }

    public String getID_COURSE() {
        return ID_COURSE;
    }

    public void setID_COURSE(String ID_COURSE) {
        this.ID_COURSE = ID_COURSE;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
    }

    public String getOPTIONA() {
        return OPTIONA;
    }

    public void setOPTIONA(String OPTIONA) {
        this.OPTIONA = OPTIONA;
    }

    public String getOPTIONB() {
        return OPTIONB;
    }

    public void setOPTIONB(String OPTIONB) {
        this.OPTIONB = OPTIONB;
    }

    public String getOPTIONC() {
        return OPTIONC;
    }

    public void setOPTIONC(String OPTIONC) {
        this.OPTIONC = OPTIONC;
    }

    public String getOPTIOND() {
        return OPTIOND;
    }

    public void setOPTIOND(String OPTIOND) {
        this.OPTIOND = OPTIOND;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getSCORE() {
        return SCORE;
    }

    public void setSCORE(int SCORE) {
        this.SCORE = SCORE;
    }

    public MultipleChoice(String ID_MTPC, String ID_COURSE, String QUESTION, String OPTIONA, String OPTIONB, String OPTIONC, String OPTIOND, String correctAnswer, int SCORE) {
        this.ID_MTPC = ID_MTPC;
        this.ID_COURSE = ID_COURSE;
        this.QUESTION = QUESTION;
        this.OPTIONA = OPTIONA;
        this.OPTIONB = OPTIONB;
        this.OPTIONC = OPTIONC;
        this.OPTIOND = OPTIOND;
        this.correctAnswer = correctAnswer;
        this.SCORE = SCORE;
    }

    public MultipleChoice() {
    }
}
