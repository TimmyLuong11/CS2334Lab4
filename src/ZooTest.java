/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class ZooTest
{

    /**
     * Test the empty Zoo constructor and the getters
     */
    public void zooEmptyConstructorTest() throws AssertException
    {
        // Use the default constructor
    	Zoo zoo0 = new Zoo(0);

       // The name should be "noname", color, weight and height 0.
        Assert.assertEquals(0.0, zoo0.getTotalHeight());
        Assert.assertEquals(0, zoo0.getCapacity());
        Assert.assertEquals("These animals live in the zoo: \n", zoo0.toString());
    }

    // TODO: test full constructor, getters, and toString
    public void zooTestConstructorParams() throws AssertException
    { 	
    	Zoo zoo1 = new Zoo(1);
    	Animal a = new Animal("Green", "Chester", 350.0, 40);
    	zoo1.addAnimal(a);
    	
    	
        Assert.assertEquals(40.0, zoo1.getTotalHeight());
        Assert.assertEquals(1, zoo1.getCapacity());
        Assert.assertEquals("These animals live in the zoo: \nChester, a Green-colored animal. 350.0 pounds, 40.0 inches\n", zoo1.toString());

    }
}

