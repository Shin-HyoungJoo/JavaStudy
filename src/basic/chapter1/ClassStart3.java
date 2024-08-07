package basic.chapter1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student("학생1",15,90);
        Student student2 = new Student("학생2",16,80);

        student1.getStudentInfo();
        student2.getStudentInfo();

        //참조값 출력
        System.out.println(student1);
        System.out.println(student2);
    }
}
