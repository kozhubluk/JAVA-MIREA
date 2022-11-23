package Practice19;


import java.util.ArrayList;
import java.util.Comparator;

public class LabClass implements Comparator<Student> {
    private ArrayList<Student> s = new ArrayList<Student>();
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getScore() - s2.getScore();
    }
    public void quicksort(int low, int high) // БЫСТРАЯ СОРТИРОВКА
    {
        if (s.size() == 0) return; //завершить выполнение, если длина массива равна 0

        if (low >= high) return; //завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        Student pivot = s.get(low + (high - low) / 2);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (compare(s.get(i), pivot)>0) {
                i++;
            }

            while (compare(s.get(j), pivot)<0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = s.get(i);
                s.set(i, s.get(j));
                s.set(j, temp);
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quicksort(low, j);

        if (high > i)
            quicksort(i, high);
    }

    public void add(Student student){
        s.add(student);
    }
    public Student getStudent(String studentName) throws StudentNotFoundException{
        for (int i = 0; i < s.size(); i++){
            if(s.get(i).getName().equals(studentName)) return s.get(i);
        }
        throw new StudentNotFoundException();
    }
    public void deleteStudent(String studentName) throws StudentNotFoundException{
        for (int i = 0; i < s.size(); i++){
            if(s.get(i).getName().equals(studentName)) {
                s.remove(i);
                return;
            }
        }
        throw new StudentNotFoundException();
    }
    public int getSize(){
        return s.size();
    }
    public void print(){
        for (int i = 0; i < this.s.size(); i++){
            System.out.println(s.get(i).toString());
        }
    }

}
