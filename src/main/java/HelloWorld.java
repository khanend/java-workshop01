public class HelloWorld {
    public static void main(String[] args) {

    }

    public String sayHi(String name) {
        String Fname = name.substring(0, 1).toUpperCase() + name.substring(1);
        return "Hello "+ Fname;
    }
}
