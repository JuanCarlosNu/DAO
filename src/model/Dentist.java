package model;

public class Dentist {

    private Integer id;
    private Integer registration;
    private String mame;
    private String lasName;

    public Dentist(Integer id, Integer registration, String mame, String lasName) {
        this.id = id;
        this.registration = registration;
        this.mame = mame;
        this.lasName = lasName;
    }

    public Dentist(Integer registration, String mame, String lasName) {
        this.registration = registration;
        this.mame = mame;
        this.lasName = lasName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }
}
