package ru.mentee.power.datatype;

public class MenteeDemo {

    public static void main(String[] args) {

        Mentee mentee1= new Mentee("Иван","Новиков",19,5.0,5);
        Mentee mentee2=new Mentee("Владимир","Богданов",18,4.1,4);


        System.out.println(mentee1.getFirstName());
        System.out.println(mentee1.getLastName());
        System.out.println(mentee1.getAge());
        System.out.println(mentee1.getAverageGrade());
        System.out.println(mentee1.getLevel());
        System.out.println("Проверка,является ли Иван Новиков отличником");
        System.out.println(mentee1.isExcellent());
        System.out.println(mentee1.calculateScholarship());
        System.out.println("------------");
        System.out.println(mentee2.getFirstName());
        System.out.println(mentee2.getLastName());;
        System.out.println(mentee2.getAge());
        System.out.println(mentee2.getAverageGrade());
        System.out.println(mentee2.getLevel());
        System.out.println("Проверка,является ли Владимир Богданов отличником");
        System.out.println(mentee2.isExcellent());
        System.out.println(mentee2.advanceToNextLevel());
        System.out.println(mentee2.calculateScholarship());



    }

}
