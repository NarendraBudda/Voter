package com.election;
import java.util.*;

public class VoterImpl {
    public static void main(String args[]) {
        Voter voter = new Voter();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of Voter ");
        String name=sc.next();
        voter.setName(name);
        System.out.println("Enter Age of Voter ");
        int age=sc.nextInt();
        voter.setAge(age);
        System.out.println(voter.getAgeCriteria());
    }
}
