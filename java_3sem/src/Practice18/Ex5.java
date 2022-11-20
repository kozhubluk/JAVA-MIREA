package Practice18;

public class Ex5 {

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }
        catch (NullPointerException e) { // вызыввем исключение
            System.out.println("NullPointerException: " + e.getMessage());
        }
        return "data for " + key;
    }

}


