package withonick.spring.bitlab.spring1.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Student> students = new ArrayList<>();
    private static Long id = 5L;
    static {
        students.add(new Student(1L,"Arman","Kenzebai",88,"B"));
        students.add(new Student(2L,"Zhandarbek","Abyzgaliev",71,"B"));
        students.add(new Student(3L,"Tanat","Usmanov",56,"D"));
        students.add(new Student(4L,"Beibarys","Abdyrakhmanov",98,"A"));
    }
    public static ArrayList<Student> getStudents(){
        return students;
    }
    public static void addStudent(Student student){
        if (student.getExam() >= 90) {
            student.setMark("A");
        } else if (student.getExam() >= 75) {
            student.setMark("B");
        } else if (student.getExam() >= 60) {
            student.setMark("C");
        } else if (student.getExam() >= 50) {
            student.setMark("D");
        } else {
            student.setMark("F");
        }
        student.setId(id);
        id++;
        students.add(student);
    }

}
