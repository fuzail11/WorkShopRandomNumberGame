package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Farrukh's on 25-Jul-16.
 */
public class Play implements random {

    int c=0;

    public void won(){

        try {


            Scanner text = new Scanner(System.in);

            System.out.println(" Enter Any Number Between 1 to 10");
            int user = text.nextInt();
            c++;
            if (user == com) {
                System.out.println("You won....................");
            }

            if (c == 3) {
                chance();
            } else if (c != 3) {

                lose();

            }

        }catch (Exception e)
        {
            System.out.println("Wrong Selection Bye");
        }
    }


    public void lose() {

        try {


            char y;

            System.out.println(com + " choose the computer.");

            System.out.println("Do you want to try again? y/n");
            Scanner text = new Scanner(System.in);

            String abc = text.next();


            y = abc.charAt(0);


            if (y == 'y' || y == 'Y') {

                won();
            }

             if(y == 'n' || y == 'N') {


                 System.out.println("Thank You \n GameOver");
             }


        }catch (Exception e)
        {
            System.out.println("Wrong Selection Bye");


        }
        }





    public void chance() {

        try {
            System.out.println("Do more play!!!! \n Buy credited ");
            System.out.println("Enter your coin in 1 to 5 range");


            Scanner text = new Scanner(System.in);

            int th = text.nextInt();
            if (th == 1 || th == 2 || th == 3 || th == 3 || th == 4 || th == 5) {

                for (int i = 0; i < th; i++)

                {
                    System.out.println(" Enter any number between 1 to 10");
                    int user = text.nextInt();
                    c++;
                    if (user == com) {
                        System.out.println("You won..");


                    } else {
                        System.out.println("Try again");
                    }


                }

            } else {

                System.out.println("Out of Range");
                chance();
            }

        }catch (Exception e)
        {
            System.out.println("Wrong Selection Bye");


        }
    }



}


