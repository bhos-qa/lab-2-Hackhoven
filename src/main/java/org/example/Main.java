package org.example;

public class Main {
    public static void main(String[] args) {
        // Existing greeting message and loop
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Now, let's add the functionality to call the MyClass method
        org.example.MyClass myClass = new MyClass();
        int result = myClass.addNumbers(2, 3);  // Calling addNumbers method from MyClass
        System.out.println("The result of adding 2 and 3 is: " + result);  // Printing the result
    }
}
