import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[]args) {
        Student student1 = new Student("Asanov Uson", 20, "st: Kiev52", 121203,"Java");
        Student student2 = new Student("Amanov Beka", 23, "st: Ch.Aitmatov 65", 121205,"JS");
        Student student3 = new Student("Amanova Aliia", 15, "st: Grajdanskaya 112", 121204,"JS");
        Student student4 = new Student("Aidarov Sanzhar", 21, "st: Moscva 20", 121209,"Java");
        Student student5 = new Student("Aibekova Aigul", 22, "st: I.Ahunbaeva 132", 121208,"Java");

        Scanner scanner = new Scanner(System.in);
        Student [] students = {student1, student2, student3, student4};
        StudentManager studentManager = new StudentManager(students);
        System.out.println(Arrays.toString(studentManager.addStudent(student5)));

        System.out.println("Введите ID номер студента: ");
        System.out.println(studentManager.studentSearch(scanner.nextInt()));
        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println("Пишите ФИО студента: ");
        System.out.println(studentManager.studentUpdate(scanner.next(), "st: I.Ahunbaeva 134"));
        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println(Arrays.toString(studentManager.studentRemove("amanov beka")));
        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println("Студенты группы Java: "+Arrays.toString(countStudents(students,"Java")));
        System.out.println("Студеннты группы JS: "+Arrays.toString(countStudents(students,"JS")));
        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println("Среднее ариф-е значение возрастов всех тудентов: "+ageStudents(students));
    }
    public static Student[] countStudents(Student[]students, String group){
        Student [] student = new Student[0];
        for (int i = 0; i < students.length; i++) {
            if(students[i].getGroup().equalsIgnoreCase(group)){
                student = Arrays.copyOf(student,student.length+1);
                student[student.length-1]=students[i];
            }
        }
        return student;
    }
    public static int ageStudents(Student[]students){
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            count += students[i].getAge();
        }
        return count/students.length;
    }
}
