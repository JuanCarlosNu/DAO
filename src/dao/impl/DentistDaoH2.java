package dao.impl;

import com.sun.jdi.connect.spi.Connection;
import dao.IDao;
import model.Dentist;

import java.util.List;

public class DentistDaoH2 implements IDao<Dentist> {


    @Override
    public Dentist save(Dentist dentist) {
        Connection connection = null;

        try {
            //to do... try connection

        }catch (Exception e){
            e.printStackTrace();
        }finally {
               try {
                   connection.close();
               }catch (Exception e){
                   e.printStackTrace();
               }

        }

        return dentist;
    }

    @Override
    public Dentist findById(Integer id) {
        return null;
    }

    @Override
    public void update(Dentist dentist) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Dentist> findAll() {
        return List.of();
    }
}
