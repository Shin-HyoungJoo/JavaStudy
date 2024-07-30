package chapter1;

public class Student {
    private String name;
    private int age;
    private int grade;

    public Student() {
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void getStudentInfo() {
        String result = "이름: " + this.name + " 나이: " + this.age + " 성적: " + this.grade;
        System.out.println(result);
    }
}
