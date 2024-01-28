package com.teachmeskills.hw7.task1.runner;

import com.teachmeskills.hw7.task1.jobtitle.Accountant;
import com.teachmeskills.hw7.task1.jobtitle.Director;
import com.teachmeskills.hw7.task1.jobtitle.Worker;

import java.util.Scanner;

/**
 * Class with method main to run the program
 * three objects have been created: "director", "worker", "accountant"
 * contains an input parameter id
 */
public class Runner {
    public static void main(String[] args) {

        Director director = new Director("Director", 1);
        Worker worker = new Worker("Worker", 2);
        Accountant accountant = new Accountant("Accountant", 3);
        Scanner scanner = new Scanner(System.in);

        long id = 0;

        System.out.println("Enter ID job title: ");
        if (scanner.hasNextLong()) {
            id = scanner.nextLong();
        } else {
            System.out.println("re-Enter. Incorrect ID entered");
            return;
        }
        if (id == director.id) {
            director.displayJobTitle();
        } else if (id == worker.id) {
            worker.displayJobTitle();
        } else if (id == accountant.id) {
            accountant.displayJobTitle();
        } else {
            System.out.println("The entered ID does not exist");
        }
        scanner.close();
    }
}

