package Practice9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student>
    {
        @Override
        public int compare(Student s1, Student s2) {
        return s1.getScore() - s2.getScore();
        }

        public void Sort(Student[] s, int low, int high) // БЫСТРАЯ СОРТИРОВКА
        {
            if (s.length == 0) return; //завершить выполнение, если длина массива равна 0

            if (low >= high) return; //завершить выполнение если уже нечего делить

            // выбрать опорный элемент
            Student pivot = s[low + (high - low) / 2];

            // разделить на подмассивы, который больше и меньше опорного элемента
            int i = low, j = high;
            while (i <= j) {
                while (compare(s[i], pivot)>0) {
                    i++;
                }

                while (compare(s[j], pivot)<0) {
                    j--;
                }

                if (i <= j) {//меняем местами
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                    i++;
                    j--;
                }
            }
            // вызов рекурсии для сортировки левой и правой части
            if (low < j)
                Sort(s, low, j);

            if (high > i)
                Sort(s, i, high);
        }

        public static void main(String[] args) {
            System.out.print("Введите кол-во студентов: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Student iDNumber[] = new Student[n];
            for (int i = 0; i < n; i++)
            {
                iDNumber[i] = new Student();
            }
            SortingStudentsByGPA s = new SortingStudentsByGPA();
            s.Sort(iDNumber,0,iDNumber.length-1);
            System.out.println(Arrays.toString(iDNumber));
        }
    }