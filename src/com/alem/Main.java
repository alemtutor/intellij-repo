package com.alem;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String passportNumber;
        String country;
        String strIssueDate;
        LocalDate issueDate;
        String strExpireDate;
        LocalDate expireDate;

        Passport[] passports = new Passport[3];
        for (int i = 0; i < passports.length; i++) {
            System.out.println("Enter passport number: ");
            passportNumber = kb.nextLine();
            System.out.println("Enter country: ");
            country = kb.nextLine();
            System.out.println("Enter issue date: ");
            strIssueDate = kb.nextLine();
            System.out.println("Enter expire date: ");
            strExpireDate = kb.nextLine();

            issueDate = LocalDate.parse(strIssueDate);
            expireDate = LocalDate.parse(strExpireDate);
            passports[i] = new Passport(passportNumber,
                    country, issueDate, expireDate);

        }

        for (int i = 0; i < passports.length; i++) {
            System.out.println(passports[i].Country + " Passport");
            System.out.println("Passport num: " +
                    passports[i].passportNumber +
                    "\nCountry: " + passports[i].Country +
                    "\nIssue Date: " + passports[i].issueDate +
                    "\nExpire Date: " + passports[i].expireDate);
        }

    }

    static class Passport {
        private String passportNumber;
        private String Country;
        private LocalDate expireDate;
        private LocalDate issueDate;

        public Passport(String passportNumber,
                        String Country,
                        LocalDate issueDate,
                        LocalDate expireDate
        ) {
            this.passportNumber = passportNumber;
            this.Country = Country;
            this.issueDate = issueDate;
            this.expireDate = expireDate;
        }
    }
}