import java.util.Map;

public class Student {
    private String name;
    private int grade; // 0 - 100

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade > 100){
            grade = 100;
        }
        this.grade = grade;
    }

    public static Map<String, Student> increaseGrades(Map<String, Student> students){
        students.forEach((key,value)->{
            value.grade*=1.1;
            students.replace(key,new Student(value.getName(),value.getGrade()));

        });

        return students;

    }
}
