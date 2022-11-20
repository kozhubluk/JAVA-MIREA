package Practice18;

import java.util.Scanner;

public class Ex8 {
    public void getKey() throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String key = sc.next();
            try {
                printDetails(key);
            }
            catch (Exception e){
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
    public void printDetails(String key) throws Exception{
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key; }

    public static void main(String[] args) throws Exception {
        Ex8 test = new Ex8();
        test.getKey();
        test.getKey();
    }


}