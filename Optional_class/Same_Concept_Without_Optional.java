package Optional_class;

public class Same_Concept_Without_Optional {
    static String nameInDb(int i){
        String name=null;

        return name;
    }
    public static void main(String[] args) {
        String name=nameInDb(2);

        if (name!=null){ ///  need to add checks everytime
            System.out.println(name.toUpperCase());
        }else{
            System.out.println("Null pointer Exception");
        }
    }
}
