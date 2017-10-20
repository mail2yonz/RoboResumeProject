package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Person person;
    static ArrayList<String> educationalList;
    static ArrayList<String> experianceList;
    public static void main(String[] args) {
	// write your code here

        String answer="yes";
        educationalList=new ArrayList<> ();
        experianceList= new ArrayList<>();

        person= new Person();
        Scanner keyboard= new Scanner (System.in);

        System.out.print ("Enter the Persons FullName: " );
        person.setName ( keyboard.nextLine () );


        System.out.print ("Enter the Persons Email: " );
        person.setEmailAddress ( keyboard.nextLine () );


         do{
             System.out.print ("Enter the Persons Educational Achievement: " );
             person.setEducationalAchivement ( keyboard.nextLine () );

             System.out.println ("Do you want to Enter Another Educational Achievement?(yes/no)" );
             answer=keyboard.nextLine ();
             educationalList.add ( person.getEducationalAchivement () );

         }while(answer.equalsIgnoreCase ( "yes" ));


         do{
             System.out.print ("Enter the Persons Experience : " );
             person.setExperiance ( keyboard.nextLine () );

             System.out.println ("Do you want to Enter another Experience?(Yes/No)" );
             answer= keyboard.nextLine ();
             experianceList.add ( person.getExperiance () );

         }while(answer.equalsIgnoreCase ( "yes" ));



        System.out.print ("Enter the Persons Skills with rating: " );
        person.setSkillRating ( keyboard.nextInt () );

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
        }

        System.out.println ( );

        System.out.println ("Experience" );
        for(String exp:experianceList)
        {
            System.out.println (exp );
        }



        System.out.println ( );
        System.out.println ("Skills" );
        System.out.println (person.getSkillRating () );
    }
}
