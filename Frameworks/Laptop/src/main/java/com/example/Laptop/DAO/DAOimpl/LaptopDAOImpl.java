package com.example.Laptop.DAO.DAOimpl;

import com.example.Laptop.DAO.LaptopDAO;
import com.example.Laptop.Entity.Laptop;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
public class LaptopDAOImpl implements LaptopDAO {


    private final EntityManager theEnitymgr;

    @Autowired
    public LaptopDAOImpl(EntityManager theEnitymgr)
    {
        this.theEnitymgr = theEnitymgr;
    }

    @Override
    @Transactional
    public void save(Laptop laptop) {

        theEnitymgr.persist(laptop);
    }

    @Override
    public Laptop findById(int id) {
        if (theEnitymgr.find(Laptop.class, id)==null){
            System.out.println("Laptop not found!");
        }
            return theEnitymgr.find(Laptop.class, id);
    }

    @Override
    @Transactional
    public void deletelaptop(int id) {
      if (theEnitymgr.find(Laptop.class,id)==null){
          System.out.println("Laptop not found!");
      }
      else{
          theEnitymgr.remove(theEnitymgr.find(Laptop.class,id));
      }
    }

//    @Override
//    public int getLaptop(String brand) {
//        Query qry= theEnitymgr.createQuery("from Laptop where brand=:brand", Laptop.class);
//        qry.setParameter("brand",brand);
//        return qry.getFirstResult();
//    }

    @Override
    public void setRam(int id){
        if (theEnitymgr.find(Laptop.class, id)==null){
            System.out.println("Laptop not found!");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter new RAM :");
            theEnitymgr.find(Laptop.class, id).setRam(sc.nextInt());
        }
    }

    @Override
    public Laptop fetchByImei(long imei){
        Query qry= theEnitymgr.createQuery("select l from Laptop l where l.imei=:imei");
        qry.setParameter("imei",imei);
        return (Laptop) qry.getSingleResult();

    }
}
