package LabActivity;

import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

// insertion
        cars.add("TISLA");
        cars.addFirst("BMW");
        cars.addLast("NISAN");
        cars.add(1, "FORD");
        cars.add("ISUZU");
        
        System.out.println("Linked List Original: " + cars);
        System.out.println(cars.size());

//  Seraching  
        if (cars.contains("BMW")) {
            System.out.println("True");
        } else {
            
            System.out.println("False");
        }

        boolean containslion = cars.contains("BMW");
        System.out.println(containslion);


    }

}
