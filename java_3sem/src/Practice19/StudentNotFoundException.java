package Practice19;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(){
        super("Студент не найден");
    }
}
