package ch.ti8m.apprentice.lorris.database;

import java.util.Objects;

/**
 * Created by gol on 24.01.2017.
 */
public class Pizza {

    private long id;
    private String name;
    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Pizza)){
            return false;
        }
        Pizza other=(Pizza)obj;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
       // return name!=null? name.hashCode() : getClass().hashCode();

        if (name!=null){
            return name.hashCode();
        }
        else{
            return getClass().hashCode();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
