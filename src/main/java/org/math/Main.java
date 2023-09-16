package org.math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//reading from terminal
        System.out.print("Age: ");
        byte age = scanner.nextByte(); //parse only byte numbers
        System.out.println("You are "+ age);

        System.out.print("Name: ");
        String name = scanner.next();// if I enter Meriem BOUSSAID it returns Meriem that's why we use nextline();
        System.out.println("You are " + name);

        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();//returns the whole entered line it also takes spaces
        System.out.print("Your full name is: " + fullName);
    }
}