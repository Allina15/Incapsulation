import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
    Student [] students;

    public StudentManager(Student[] students) {
        this.students = students;
    }

    public Student[] addStudent(Student student){
        for (Student newStudents : students) {
            if (newStudents.getFullName().equalsIgnoreCase(student.getFullName())){
                return students;
            }
        }
        Student [] newStudents = new Student[students.length+1];
        for (int i = 0; i < students.length ; i++) {
            newStudents[i]=students[i];
        }
        newStudents[students.length]=student;
        students = Arrays.copyOf(newStudents,newStudents.length);
        return students;
    }
    public Student studentSearch(int id){
        Scanner sc = new Scanner(System.in);
        for (Student student:students) {
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }
    public Student studentUpdate(String studentFullName, String newAddress){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length ; i++) {
            if(students[i].getFullName().equalsIgnoreCase(studentFullName)) {
                return students[i];
            }
                students[i].setAddress(newAddress);
                return students[i];
            }
        return null;
    }
    public Student [] studentRemove(String student){
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFullName().equalsIgnoreCase(student)){
                index=i;
                break;
            }
        }
        if (index==0){
            return  students;
        }
        Student [] students1 = new Student[students.length-1];
        if (index > 0){
            System.arraycopy(students,0,students1,0,index);
        }
        if (index < students1.length-1){
            System.arraycopy(students,index+1,students1,index,students.length-index-1);
        }
        return students1;
    }
}
