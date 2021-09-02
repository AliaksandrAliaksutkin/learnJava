package lyambda;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
    // метод ниже принимает в качестве параметров коллекцию студентов и объект класс КОТОРЫЙ будет имплементить
    //  интерфейс StudentChecs

    void testStudents (ArrayList<Student> al, StudentCheks sc){
        for (Student student : al) {
            if(sc.check(student)){      // если наш фильтр проверяет студента и возвращает тру, sout выполнется
                System.out.println(student); // тоесть мы выведем студента на экран
            }
        }

    }

//    void printStudentsOverGrade(ArrayList<Student> a1, double grade) {
//        for (Student student : a1) {
//            if (student.avgGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList<Student> a1, int age){
//        for (Student student : a1) {
//            if (student.age >= age) {
//                System.out.println(student);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex){
//        for (Student student : a1) {
//            if (student.age > age && student.avgGrade > grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }
//
//    }

    }
            class Test{
                public static void main(String[] args) {
                    Student st1 = new Student("Dyshko",'m', 31, 2, 8.8);
                    Student st2 = new Student("Yakushik",'m', 41, 5, 9.1);
                    Student st3 = new Student("Maria",'f', 21, 2, 8.5);
                    Student st4 = new Student("Lazik",'m', 30, 4, 7.5);
                    Student st5 = new Student("Lena",'f', 33, 3, 9.6);

                    ArrayList<Student> studentList = new ArrayList<>();
                    studentList.add(st1);
                    studentList.add(st2);
                    studentList.add(st3);
                    studentList.add(st4);
                    studentList.add(st5);

                    StudentInfo studentInfo = new StudentInfo(); // создаем объект класса studentInfo для вызова методов
                    //System.out.println("___________________________");

                    // ниже создан анонимый класс для конкретной фильтрации данных студентов
//                    studentInfo.testStudents(studentList, new StudentCheks() {
//                        @Override
//                        public boolean check(Student s) {
//                            return s.age>30;
//                        }
//                    });
                   // System.out.println("___________________________");


                    studentInfo.testStudents(studentList,(Student s1) -> {return s1.avgGrade>8;}); // лямбда выражение
                    System.out.println("___________________________");
                    studentInfo.testStudents(studentList,(Student s1) -> {return s1.age>30;}); // лямбда выражение
                    System.out.println("___________________________");
                    studentInfo.testStudents(studentList,(Student s1) -> {
                        return s1.age>30&&s1.
                                avgGrade>8&&s1.
                                sex=='f';}); // лямбда выражение


//                    studentInfo.printStudentsOverGrade(studentList, 8); // поиск (фильтрация)студентов у которых grade > 8
//                    System.out.println("___________________________");
//                    studentInfo.printStudentsUnderAge(studentList,30); // тоже, только возвраст
//                    System.out.println("___________________________");
//                    // тоже, только по нескольким параметрам
//                    studentInfo.printStudentsMixCondition(studentList, 30,8.1,'m');

                }

}


