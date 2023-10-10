package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a name in the 'First Last' format:");
        String fullName1 = myScanner.nextLine();
        System.out.println("Please enter a name in the 'First Middle Last' format:");
        String fullName2 = myScanner.nextLine();

        String[] nameParts1 = fullName1.split(" ");
        if (nameParts1.length >= 2) {
            String firstName1 = nameParts1[0];
            String lastName1 = nameParts1[nameParts1.length - 1];
            String middleName1 = "";
            if (nameParts1.length > 2) {
                middleName1 = nameParts1[1];
            }
            System.out.println("First Name (Foramt 1): " + firstName1);
            System.out.println("Middle Name (Format 1): " + middleName1);
            System.out.println("Last Name (Format 1): " + lastName1);
        } else {
            System.out.println("Invalid name format (Format 1).");
        }
        String[] nameParts2 = fullName2.split(" ");
        if (nameParts2.length >= 2) {
            String firstName2 = nameParts2[0];
            String lastName2 = nameParts2[nameParts2.length - 1];
            String middleName2 = "";
            if (nameParts2.length > 2) {
                middleName2 = nameParts2[1];
            }
            System.out.println("First Name (Format 2): " + firstName2);
            System.out.println("Middle Name (Format 2): " + middleName2);
            System.out.println("Last Name (Format 2 ): " + lastName2);
        } else {
            System.out.println("Invalid name format (Format 2).");
        }
        myScanner.close();
    }

    }
