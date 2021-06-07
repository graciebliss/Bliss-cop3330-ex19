/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("What is your height? ");
        int height=in.nextInt();

        System.out.print("What is your weight? ");
        int weight=in.nextInt();

        double bmi=((double)weight/((double)height*(double)height))*703;

        bmi=Math.round(bmi*100.0)/100.0;

        String checkBMI="You are within the ideal weight range.";

        if(bmi<18.5){
            checkBMI="You are underweight. You should see your doctor.";
        }
        if(bmi>25){
            checkBMI="You are overweight. You should see your doctor.";
        }

        System.out.print("Your BMI is "+bmi+".\n"+checkBMI);
    }
}
