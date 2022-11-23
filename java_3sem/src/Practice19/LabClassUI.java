package Practice19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;
    private Scanner scanner;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
        scanner = new Scanner(System.in);
    }

    public void run() throws EmptyStringException, StudentNotFoundException {
        int choice = 0;
        while (choice != 6) {
            System.out.println("1 - Добавить студента");
            System.out.println("2 - Удалить студента");
            System.out.println("3 - Получить список студентов");
            System.out.println("4 - Отсортировать студентов");
            System.out.println("5 - Найти студента");
            System.out.println("6 - Завершить");
            System.out.print("Введите номер команды: ");
            try {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                choice = 0;
            }
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    getStudentsList();
                    break;
                case 4:
                    sortStudents();
                    break;
                case 5:
                    getStudentByName();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }

    private void addStudent() throws EmptyStringException {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите общий балл: ");
        int score = scanner.nextInt();
        scanner.nextLine();
        if (name.equals(""))
            throw new EmptyStringException();
        labClass.add(new Student(score, name));
    }

    private void removeStudent() throws StudentNotFoundException, EmptyStringException{
        try {
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            labClass.deleteStudent(name);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void sortStudents() {
        labClass.quicksort(0, labClass.getSize()-1);
    }
    private void getStudentsList() {
        labClass.print();
    }
    private void getStudentByName() throws StudentNotFoundException, EmptyStringException{
        try{
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            Student student = labClass.getStudent(name);
            System.out.println(student);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}