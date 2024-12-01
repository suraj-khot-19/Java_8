package Optional_class;

public class Without_Optional_Class {
    private static String getName(int id) {
        String name = null; // supposing fetching from database
        return name;
    }

    public static void main(String[] args) {
        String name = getName(2);
        System.out.println(name.toUpperCase());
    }
}

/*

output

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "name" is null
	at Optional_class.Without_Optional_Class.main(Without_Optional_Class.java:11)

NullPointerException =>
 */
