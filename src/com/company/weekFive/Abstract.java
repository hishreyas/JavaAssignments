package com.company.weekFive;

import java.util.Scanner;

abstract  class  Staff {
    protected int id;
    protected String name;
    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class OfficeStaff extends Staff{
    private String department;
    public OfficeStaff(int id, String name,String department) {
        super(id, name);
        this.department=department;
    }
    @Override
    public String toString() {
        return "Id:"+getId()+"\t Name:"+getName()+"\t Department:"+department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class Abstract {
    public static void main(String[] args) {

        System.out.println("Enter how many office staff");
        Scanner sc=new Scanner(System.in);
        OfficeStaff[] officeStaffs =new OfficeStaff[sc.nextInt()];

        for (int i=0;i<officeStaffs.length;i++) {
            System.out.println("Enter Id  Name and Department ");
            officeStaffs[i] = new OfficeStaff(sc.nextInt(), sc.next(),sc.next());
        }
        for (OfficeStaff officeStaff:officeStaffs)
            System.out.println(officeStaff);
    }
}
