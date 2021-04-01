package za.ac.cput.ADP372s_Assignment1_2021;

/**
 * Student Name: Ian Louw
 * Student Number: 216250773
 */

public class TDD {

    private String name, surname;
    private int studentNumber;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public int getStudentNumber() {

        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {

        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "TDD{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
