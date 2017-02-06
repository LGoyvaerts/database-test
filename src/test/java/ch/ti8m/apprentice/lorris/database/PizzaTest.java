package ch.ti8m.apprentice.lorris.database;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by gol on 24.01.2017.
 */
public class PizzaTest {

    @Test
    public void testToString(){

        Pizza pizza=new Pizza();
        pizza.setName("Prosciutto");

        System.out.println("Pizza: "+pizza);

        Assert.assertEquals("Prosciutto", pizza.getName());

    }

    @Test
    public void testEquals(){

        Pizza p1=new Pizza();
        p1.setName("Prosciutto");

        Pizza p2=new Pizza();
        p2.setName("Salami");

        Pizza p3=new Pizza();
        p3.setName("Prosciutto");

        Assert.assertEquals(p1, p1);
        Assert.assertNotEquals(p1, p2);
        Assert.assertEquals(p1, p3);
        Assert.assertNotEquals(p1, new Date());
    }

    @Test
    public void testHashCode(){

        Pizza p1=new Pizza();
        p1.setName("Prosciutto");

        Pizza p2=new Pizza();
        p2.setName("Salami");

        Pizza p3=new Pizza();
        p3.setName("Prosciutto");

        Assert.assertEquals(p1.hashCode(), p1.hashCode());
        Assert.assertEquals(p1.hashCode(), p3.hashCode());
    }

}
