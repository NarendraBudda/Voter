package com.election;

public class Voter {
    private String name;
    private int age;
    static final int VOTER_ELIGIBLE_AGE=18;
    public Voter(){
        String name="Budda";
        int age=25;

    }

    public void setName(String name) {

        this.name = name;
    }
    public String getName(){

        return name;
    }
    public void setAge(int age){

        this.age=age;
    }
    public int getAge(){

        return age;
    }
    public String getAgeCriteria(){
        if(getAge()>=VOTER_ELIGIBLE_AGE){
            return getName()+" Is Eligible to Vote ";
        }
        else if(getAge()<VOTER_ELIGIBLE_AGE&&getAge()>0) {
            return getName()+" Is Not Eligible to Vote";
        }
        else {
            return "Age can't Be Negative or Zero ";
        }
    }
}
