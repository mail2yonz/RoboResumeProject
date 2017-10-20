/*
Yonatan Mengesha
Java Boot Camp


 */



package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Person person;
    static ArrayList<String> educationalList;
    static ArrayList<String> experianceList;
    static ArrayList<String> skillList;
    static ArrayList<String> dutyList;
    public static void main(String[] args) {
	// write your code here

        String answer;
        educationalList=new ArrayList<> ();
        experianceList= new ArrayList<>();
        skillList=new ArrayList<> ();
        dutyList=new ArrayList<>();

        person= new Person();
        Scanner keyboard= new Scanner (System.in);

        System.out.print ("Enter the Persons FullName: " );
        person.setName ( keyboard.nextLine () );


        System.out.print ("Enter the Persons Email: " );
        person.setEmailAddress ( keyboard.nextLine () );


         do{
             System.out.print ("Enter the Persons Educational Title or Type: " );
             String title=keyboard.nextLine ();

             System.out.print("Enter the university you graduated from: " );
              String university=keyboard.nextLine ();

             System.out.print ("Enter the year of graduation: " );
             String year=keyboard.nextLine ();

             String ansKeyboard= title +"\n" +university+", " +year;

             person.setEducationalAchivement ( ansKeyboard );

             System.out.println ("Do you want to Enter Another Educational Achievement?(yes/no)" );
             answer=keyboard.nextLine ();

             if(!answer.equalsIgnoreCase ( "yes" )&&!answer.equalsIgnoreCase ( "No" ))
             {
                 System.out.println ("Invalid Entry Please Enter yes/No" );
             }

             educationalList.add ( person.getEducationalAchivement () );

         }while(answer.equalsIgnoreCase ( "yes" ));


         do{
             System.out.print ("Enter the Persons Experience Title: " );
             String title=keyboard.nextLine ();

             System.out.print ("Enter the  Company the person worked for: " );
             String company=keyboard.nextLine ();

             String duty;
             do{
                 System.out.println ("Enter Duties of the Person At that company " );
                 duty= keyboard.nextLine ();

                 System.out.println ("Do you want to Add more Duties?(yes/No)" );
                 answer =keyboard.nextLine ();
                 dutyList.add ( duty );

             }while(answer.equalsIgnoreCase ( "yes" ));

             String ansKeyboard= title +"\n" +company +"\n" + dutyList;
             person.setExperiance ( ansKeyboard );

             System.out.println ("Do you want to Enter another Experience?(Yes/No)" );
             answer= keyboard.nextLine ();
             experianceList.add ( person.getExperiance () );

         }while(answer.equalsIgnoreCase ( "yes" ));


        do{
            System.out.print ("Enter the Persons Skills with rating: " );
            person.setSkillRating ( keyboard.nextLine () );

            System.out.println ("Do you want to Enter another Skill?(yes/no)" );
            answer=keyboard.nextLine ();
            skillList.add(person.getSkillRating ());

        }while(answer.equalsIgnoreCase ( "yes" ));

         printing();



    }
    public static void printing()
    {
        //Person person = new Person();
        System.out.println ("=================================================" );
        System.out.println ( person.getName ());
        System.out.println (person.getEmailAddress () );
        System.out.println ( );
        System.out.println ("Education" );
        for(String edu:educationalList)
        {

        System.out.println (edu );
        System.out.println ( );
        }

        System.out.println ( );

        System.out.println ("Experience" );
        for(String exp:experianceList)
        {
            System.out.println (exp );
            System.out.println ( );
        }



        System.out.println ( );
        System.out.println ("Skills" );
        for(String skills:skillList)
        {
            System.out.println (skills);
        }

    }
}
