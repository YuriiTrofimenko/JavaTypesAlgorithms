/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.voronlib;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class VoronLogic {
    
    public void doWork(){
    
        Scanner sc = new Scanner(System.in);

        MAIN : do {
            System.out.println("Input some integer number: ");
            int number = sc.nextInt();
            System.out.println("Number is: " + number);

            int num10 = number % 10;
            int num100 = number % 100;

            if (num100 >= 11 && num100 <= 14) {

                System.out.println("voron");
            } else {

                switch (num10) {
                    case 1: {
                        System.out.println("vorona");
                        break;
                    }
                    case 2: {
                    }
                    case 3: {
                    }
                    case 4: {
                        System.out.println("voroni");
                        break;
                    }
                    case 5: {
                    }
                    case 6: {
                    }
                    case 7: {
                    }
                    case 8: {
                    }
                    case 9: {
                    }
                    case 0: {
                        System.out.println("voron");
                    }
                }
            }
            String answer = "";
            do {
                System.out.println("Continue? (y/n)");
                answer = sc.next();
                if (answer.equals("n")) {
                    break MAIN;
                } else if (answer.equals("y")) {
                    break;
                }
            } while (true);
            
        } while (true);
    }
}
