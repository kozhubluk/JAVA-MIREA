package Practice18;


public class Ex7 {
    // throws используется в объявлении метода, чтобы сообщить, что данный метод может генерировать исключение, которое он не обрабатывает
    public void getKey(String key) throws Exception {
        printDetails(key);
    }
    public void printDetails(String key){
        try { String message = getDetails(key);
            System.out.println(message);
        } catch ( Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key; }

    public static void main(String[] args) throws Exception {
        Ex7 test = new Ex7();
        test.getKey("");
        test.getKey("lk");
    }


}