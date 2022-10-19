package Practice10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MergeSort {
    Student[] students;

    public static void main(String[] args) {
        new MergeSort();
    }

    public MergeSort(){
        System.out.print("Введите кол-во студентов в 2-х списках: ");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Student[] list1 = new Student[n1];
        Student[] list2 = new Student[n2];
        // Заполняем оба массива
        for (int i = 0; i < n1; i++){
            list1[i] = new Student();
        }
        for (int i = 0; i < n2; i++){
            list2[i] = new Student();
        }
        this.students = Stream.concat(Arrays.stream(list1), Arrays.stream(list2)).toArray(Student[]::new); // массива из 2х подмассивов
        mergeSort(0, students.length-1);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
        System.out.println(Arrays.toString(students));
    }

    void merge(int left, int right)
    {
        int i = left;
        int idx = 0; // индекс res
        int middle = left + (right - left) / 2;
        int j = middle + 1;
        Student[] res = new Student[right-left + 1];
        while (i <= middle && j <= right) {
            if (students[i].getId() <= students[j].getId()) {
                res[idx] = students[i];
                i++;
            }
            else {
                res[idx] = students[j];
                j++;
            }
            idx++;
        }
        // Собираем оставшиеся элементы, если один из подмассивов закончился раньше:
        while (i <= middle) {
            res[idx] = students[i];
            i++;
            idx++;
        }
        while (j <= right) {
            res[idx] = students[j];
            j++;
            idx++;
        }
        for (i = 0; i < idx; i++) { //заменяем часть массива на отсортированную
            if (students[left + i] != res[i]) {
                students[left + i] = res[i];
            }
        }
    }

    void mergeSort(int left, int right)
    {
        if (left < right) { // условие выхода из рекурсии
            mergeSort(left, left + (right - left) / 2); // сортировка левой части массива
            mergeSort(left + (right - left) / 2 + 1, right); // сортировка прравой части массива
            merge(left, right); //слияние массивов
        }
    }
}
