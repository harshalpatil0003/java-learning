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

//            System.out.println("1: Add Laptop");
//
//            System.out.println("2: Get Laptop by Id");
//
//            System.out.println("3: Get laptop by brand");
//            int opt=sc.nextInt();
//
//            switch (opt){
//                case 1:
//                    System.out.println("Enter Brand: ");
//                    String brand = sc.nextLine();
//
//                    System.out.println("Enter Generation: ");
//                    int gen = sc.nextInt();
//                    sc.nextLine();
//
//                    System.out.println("Enter Processor: ");
//                    String pro = sc.nextLine();
//
//                    System.out.println("Enter RAM: ");
//                    int ram = sc.nextInt();
//                    sc.nextLine();
//
//                    System.out.println("Enter Price: ");
//                    double price = sc.nextDouble();
//                    sc.nextLine();
//
//                    System.out.println("Enter IMEI: ");
//                    long imei = sc.nextLong();
//                    sc.nextLine();
//
//                    Laptop l1 = new Laptop(brand, gen, pro, ram, price, imei);
//                    thelaptopDAO.save(l1);
//                    System.out.println("saved successfully!");
//                    break;
//
//
//                case 2:
//                    System.out.println("Enter Id: ");
//                    int id=sc.nextInt();
//
//                    Laptop l2= thelaptopDAO.findById(id);
//                    System.out.println(l2);
//
//            }

            System.out.println("Enter Brand: ");
            String brand=sc.nextLine();

            Laptop l3= thelaptopDAO.getLaptop(brand);
            System.out.println(l3);


       };
    }
}