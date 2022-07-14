package com.syntax.GroupProject2;

public abstract class Marks {
    /*Herndon, VA
    We have to calculate the aCenterville, VAverage of marks obtained in three subjects by student A and in 4 subjects by student B.
    Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
    Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks
    in three subjects as its parameters and the marks in four subjects as its parameters for student B.
    Test your code
     */

    abstract void getAverage();

}
class StudentA extends Marks{
    Double mark1,mark2,mark3;

    StudentA(double mark1,double mark2,double mark3){
    this.mark1=mark1;
    this.mark2=mark2;
    this.mark3=mark3;
    }

    @Override
    void getAverage() {
    double averageMark=(mark1+mark2+mark3)/3;
        System.out.println("The average of Student A's marks is: "+averageMark);
    }
}
class StudentB extends Marks{
    Double mark1,mark2,mark3,mark4;

    StudentB(double mark1,double mark2,double mark3,double mark4){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.mark4=mark4;
    }

    @Override
    void getAverage() {
        double averageMark=(mark1+mark2+mark3+mark4)/4;
        System.out.println("The average of Student A's marks is: "+averageMark);
    }

    public static void main(String[] args) {
        Marks[] marks={new StudentA(85,92.5,90),new StudentB(95,93.5,92,98)};
        for(Marks m:marks){
            m.getAverage();
        }
    }
}