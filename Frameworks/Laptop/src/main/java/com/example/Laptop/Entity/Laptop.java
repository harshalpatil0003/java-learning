package com.example.Laptop.Entity;

import jakarta.persistence.*;

@Entity
@Table( name = "laptop_table")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Brand")
     private String brand;

    @Column(name = "Generation")
    private int generation;

    @Column (name = "Processor")
    private String processor;

    @Column (name = "RAM")
    private int ram;

    @Column (name = "Price")
    private double price;

    @Column (name = "IMEI")
    private long imei;

    public Laptop(){}

    public Laptop( String brand, int generation,String processor, int ram, double price,long imei ){
        this.brand=brand;
        this.generation=generation;
        this.processor=processor;
        this.ram=ram;
        this.price=price;
        this.imei=imei;
    }

    public String toString(){
        return  "[Brand: "+brand+" Generation: "+generation+" Processor: "+processor+" ram: "+ram+" Price: "+price+" IMEI: "+imei+" ]";
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getGeneration() {
        return generation;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {

        return ram;
    }

    public int setRam(int ram) {
        this.ram = ram;
        return ram;
    }

    public double getPrice() {
        return price;
    }

    public long getImei() {
        return imei;
    }

}
