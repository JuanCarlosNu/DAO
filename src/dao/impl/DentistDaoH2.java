package dao.impl;

import java.sql.Connection;

import dao.DB;
import dao.IDao;
import model.Dentist;
import org.apache.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class DentistDaoH2 implements IDao<Dentist> {

    private static final Logger LOGGER = Logger.getLogger(DentistDaoH2.class);

    private static final String SQL_INSERT = "INSERT INTO DENTIST (REGISTRATION, NAME, LASTNAME)" +
            "VALUES(?,?,?)";



    @Override
    public Dentist save(Dentist dentist) {
        Connection connection = null;

        try {
            LOGGER.info("se inició una operación de guardado de Dentist");
            // conectar a la DB
            connection = DB.getConnection();

            // insertar valores -- > guardarlos

            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            psInsert.setInt(1, dentist.getRegistration());
            psInsert.setString(2, dentist.getName());
            psInsert.setString(3, dentist.getLasName());
            psInsert.execute();

            ResultSet rs = psInsert.getGeneratedKeys();
            while(rs.next()){
                dentist.setId(rs.getInt(1));
                LOGGER.info("este es el odontologo que se guardó" + dentist);

            }


        }catch (Exception e){
            LOGGER.error("error" + e.getMessage());
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
