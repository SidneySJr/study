package entities;

/**
 * @author sidney
 */
public class Student {

    private static int cod;
    private String name;
    private float grade1;
    private float grade2;
    private float grade3;
    private float average;
    private String situation;

    public Student(String name, float grade1, float grade2, float grade3) {
        cod++;
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.average = (grade1 + grade2 + grade3) / 3;
        this.situation = "";

    }

    public static int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade1() {
        return grade1;
    }

    public void setGrade1(float grade1) {
        this.grade1 = grade1;
    }

    public float getGrade2() {
        return grade2;
    }

    public void setGrade2(float grade2) {
        this.grade2 = grade2;
    }

    public float getGrade3() {
        return grade3;
    }

    public void setGrade3(float grade3) {
        this.grade3 = grade3;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    @Override
    public String toString() {
        return "Student: "
                + "\nName: " + name
                + "\nGrade1: " + String.format("%.2f", grade1)
                + "\nGrade2: " + String.format("%.2f", grade2)
                + "\nGrade3: " + String.format("%.2f", grade3)
                + "\nAverage: " + String.format("%.2f", average)
                + "\nSituation: " + situation;

    }

}
