package org.example;

import java.util.Scanner;

// Girilen kelimenin sesli ve sessiz harflerini ayrı ayrı yazan program

public class Main {
    public static void main(String[] args) {

        int kon,i,j;
        String k,k1="",k2="";
        char[] sesli = {'a','e','ı','i','o','ö','u','ü'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Küçük Harflerle Kelime Giriniz : ");
        k = scanner.nextLine();

        for (i=0; i<k.length(); i++){
            kon=0;
            for (j=0; j<8; j++)
                if (k.charAt(i)==sesli[j]){
                    kon=1;
                    break;
                }
            if (kon==1)k1+=k.charAt(i);
            else k2+=k.charAt(i);
        }
        System.out.printf("\nSesli Harflerden Kelime : %s",k1);
        System.out.printf("\nSessiz Harflerden Kelime : %s\n",k2);

    }
}