package com.company.weekSeven;

import java.util.*;

public class CovidTester extends Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many patient you want insert:");

        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            Patient[] patients = new Patient[number];
            System.out.println("Enter  Name ");
            String name = sc.next();
            System.out.println("Enter  Age  ");
            int age = sc.nextInt();
            System.out.println("Enter  oxygen level");
            int oxygenLevel = sc.nextInt();
            System.out.println("Enter  HRCT report");
            int hrtcReport = sc.nextInt();

            try {
                patients[i] = new Patient(name, age, oxygenLevel, hrtcReport);
                System.out.println(patients[i]);
            } catch (CovidPositiveException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Patient {
    String name;
    int age;
    int oxygenLevel;
    int hrtcReport;

    Patient(String name, int age, int oxygenLevel, int hrtcReport) throws CovidPositiveException {
        this.name = name;
        this.age = age;
        this.oxygenLevel = oxygenLevel;
        this.hrtcReport = hrtcReport;
        if (oxygenLevel < 95 && hrtcReport > 10)
            throw new CovidPositiveException();
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\tage " + age +
                "\toxygen level " + oxygenLevel +
                "\tHRCT report " + hrtcReport + "\n";
    }
}

class CovidPositiveException extends Exception {

    @Override
    public String getMessage() {
        return "Patient is Covid Positive(+) and Need to Hospitalized\n";
    }
}
