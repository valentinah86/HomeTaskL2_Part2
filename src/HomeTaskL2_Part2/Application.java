package HomeTaskL2_Part2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Actions actions = new Actions();
        Scanner str = new Scanner(System.in);

        System.out.println("Insert number of students to create a List");
        int number = str.nextInt();

        System.out.println(actions.generateStudentsList(number));

        System.out.println("\n Sorted by Age list of students");
        System.out.println(actions.sortStudentsByAge());

        System.out.println("\nAverage age: " + actions.calculateAverageAge(actions.getStudentsList())+"\n");

        System.out.println("Insert 1'st symbol in student's surname");
        String value = str.next();
        System.out.println(actions.filterSurnameByFirstLetter(value,actions.getStudentsList()));

        System.out.println("\n Created HashMap from ArrayList \n");
        System.out.println(actions.convertStudentsListToMap(actions.getStudentsList() )+ "\n");

    }


}
