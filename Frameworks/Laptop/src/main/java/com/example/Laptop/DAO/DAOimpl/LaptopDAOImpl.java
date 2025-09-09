package com.example.Laptop.DAO.DAOimpl;

import com.example.Laptop.DAO.LaptopDAO;
import com.example.Laptop.Entity.Laptop;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopDAOImpl implements LaptopDAO {


    private final EntityManager theEnitymgr;

    public LaptopDAOImpl(EntityManager theEnitymgr) {
        this.theEnitymgr = theEnitymgr;
    }

    @Override
    @Transactional
    public void save(Laptop laptop) {
    theEnitymgr.persist(laptop);
    }

    @Override
    public Laptop findById(int id) {
        return theEnitymgr.find(Laptop.class, id);
    }

    @Override
    public void deletelaptop(int id) {
        
    }

//    @Override
//    public int getLaptop(String brand) {
//        Query qry= theEnitymgr.createQuery("from Laptop where brand=:brand", Laptop.class);
//        qry.setParameter("brand",brand);
//        return qry.getFirstResult();
//    }
}
