/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties

public class Student {
    private int roll;
    private String Name;
    private int backLogCounter;
    private int appearingCounter;

    public Student(int roll, String name) {
        this.roll = roll;
        Name = name;
    }

    public Student(int roll, String name, int backLogCounter, int appearingCounter) {
        this.roll = roll;
        Name = name;
        this.backLogCounter = backLogCounter;
        this.appearingCounter = appearingCounter;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBackLogCounter() {
        return backLogCounter;
    }

    public void setBackLogCounter(int backLogCounter) {
        this.backLogCounter = backLogCounter;
    }

    public int getAppearingCounter() {
        return appearingCounter;
    }

    public void setAppearingCounter(int appearingCounter) {
        this.appearingCounter = appearingCounter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + roll +
                ", Name='" + Name + '\'' +
                '}';
    }

    public String toStrings() {
        return "Student{" +
                "roll=" + roll +
                ", Name='" + Name + '\'' +
                ", backLogCounter=" + backLogCounter +
                ", appearingCounter=" + appearingCounter +
                '}';
    }
}
