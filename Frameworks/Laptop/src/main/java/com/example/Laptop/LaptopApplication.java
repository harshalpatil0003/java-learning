package com.example.Laptop;

import com.example.Laptop.DAO.LaptopDAO;
import com.example.Laptop.Entity.Laptop;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class LaptopApplication {
    public static void main(String[] args) {

        SpringApplication.run(LaptopApplication.class ,args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(LaptopDAO thelaptopDAO){
        return runner->{

            Scanner sc=new Scanner(System.in);

            System.out.println("1: Add Laptop");

            System.out.println("2: Get Laptop by Id");


            System.out.println("3: Remove Laptop by Id");

            System.out.println("4: Update RAM  ");

            System.out.println("5: Fetch BY IMEI: ");


            int opt=sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1: {

                    System.out.println("How many Laptops you want to insert?");
                    int cnt = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < cnt; i++) {
                        System.out.println("Enter Brand: ");
                        String brand = sc.nextLine();

                        System.out.println("Enter Generation: ");
                        int gen = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Processor: ");
                        String pro = sc.nextLine();

                        System.out.println("Enter RAM: ");
                        int ram = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Price: ");
                        double price = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Enter IMEI: ");
                        long imei = sc.nextLong();
                        sc.nextLine();

                        Laptop l1 = new Laptop(brand, gen, pro, ram, price, imei);
                        thelaptopDAO.save(l1);
                        System.out.println("saved successfully!");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter Id: ");
                    int id = sc.nextInt();
                    Laptop l2 = thelaptopDAO.findById(id);
                    System.out.println(l2);
                    break;
                }

                case 3: {
                    System.out.println("Enter Id: ");
                    int id = sc.nextInt();
                    thelaptopDAO.deletelaptop(id);
                }
                case 4:{
                    System.out.println("Enter id to change RAM: ");
                    int id=sc.nextInt();
                    thelaptopDAO.setRam(id);
                    System.out.println("RAM Updated! ");
                }
                case 5:{
                    System.out.print("Enter IMEI: ");
                    long imei=sc.nextLong();
                    System.out.println(thelaptopDAO.fetchByImei(imei));
                }


            }
       };
    }
}