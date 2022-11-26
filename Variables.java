public class Variables {
    public static void main(String[] args) {
        // Java is a static language
        // variable name must not contain whitespace or all written in number

        String name;
        name = "Husnul Nawafil";

        System.out.println(name);

        int age = 30;

        name = "Nawafil aja";
        age = 27;

        System.out.println("Hello I am " + name + ". " + age + " years old." );

        // can use word var , but must be fully initialized
        var familyName = "Dayat";
        var years = 123; // data type automatically declared by using var

        final String company = "FIT HUB"; // similar to const in javascript or golang
        
    }
}
