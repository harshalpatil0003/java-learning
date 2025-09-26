package com.example.Laptop.DAO;

import com.example.Laptop.Entity.Laptop;

public interface LaptopDAO {

    public void save(Laptop laptop);

    public Laptop findById(int id);
   //    public int getLaptop(String brand);
//    public void updateRAM(int id);
    public void deletelaptop(int gen);

    public void setRam(int id);
    public Laptop fetchByImei(long imei);
}
