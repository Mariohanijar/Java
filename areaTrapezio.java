package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.*;

public class giras {

    public static void main(String[] args) {
        
        int trapezio, Base, base, H; 
        Scanner sc= new Scanner(System.in);
        
        System.out.println("calcule a área do trapézio: ");
        System.out.println("insira a maior base: ");
        Base = sc.nextInt();
        System.out.println("insira a menor base: ");
        base = sc.nextInt();
        System.out.println("insira a altura: ");
        H = sc.nextInt();
        
       trapezio = (base + Base)* H/2; 
       
       System.out.printf("área do trapézio: %d", trapezio);
    }
}
