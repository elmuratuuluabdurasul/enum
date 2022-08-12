package com.company;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        try {
            switch (Days.valueOf(day.toUpperCase(Locale.ROOT))){
                case MONDAY -> {
                    System.out.println("Дуйшонбу куну жава окуйбуз");
                }
                case TUESDAY -> {
                    System.out.println("Шейшемби куну практика кылабыз");
                }
                case WEDNESDAY -> {
                    System.out.println("Шаршемби куну жава окуйбуз");
                }
                case THURSDAY -> {
                    System.out.println("Бейшемби куну практика кылабыз");
                }
                case FRIDAY -> {
                    System.out.println("Жума куну жава окуйбуз");
                }
                case SATURDAY -> {
                    System.out.println("Ишемби практика жасайбыз");
                }
                case SUNDAY -> {
                    System.out.println("Жекшемби куну эс алабыз");
                }

            }



        }
        catch (IllegalArgumentException e){
            System.out.println("Мындай кун жок. Туура жаз");
        }


    }
}