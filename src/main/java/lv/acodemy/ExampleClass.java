package lv.acodemy;

public class ExampleClass
{ public static void main(String[] args) {

        // Create method that will print out Hello, World!
        sayHello();
        greet("Alex");

        System.out.println(add( 30, 60));
        int x = add( 30, 60);
        System.out.println(x);


        System.out.println(add( 12.2, 12.5));

        double a = 12.2;
        double b = 12.5;
        System.out.println(add(a, b));


        var firstStudent = calculateGrade( 70);
        System.out.println(firstStudent);

        var secondStudent = calculateGrade( 90);
        System.out.println(secondStudent);
    }


    public static void sayHello()  {
        System.out.println("Hello, World!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method overloading

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String calculateGrade(int score) {
        if (score >= 90){
            return "A";
        } else if (score >= 75){
            return "B";
        } else if (score >= 50){
            return "C";
        } else {
            return "F";
        }
    }
}


