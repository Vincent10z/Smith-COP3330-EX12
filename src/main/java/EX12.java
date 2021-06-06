/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float p, r, t, ttl, intrest;
        System.out.print("Enter the principal: ");
        p = input.nextFloat();

        System.out.print("Enter the rate of interest: ");
        r = input.nextFloat();


        System.out.print("Enter the number of years: ");
        t = input.nextFloat();


        intrest = (p * r * t) / 100;
        ttl = intrest + p;

        System.out.println("After " +t+ " years at " +r+ "%, the investment will be worth $" + ttl +"");




    }

}
