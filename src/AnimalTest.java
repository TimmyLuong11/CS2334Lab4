/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void testConstructorParams() throws AssertException
    {
    	String color1 = "Yellow";
    	String name1 = "Jeffery";
    	double weight1 = 300.0;
    	double height1 = 250.0;
    	Animal ani1 = new Animal(color1, name1, weight1, height1);
    	
    	String color2 = "Black";
    	String name2 = "Harambe";
    	double weight2 = 450.0;
    	double height2 = 72.0;
    	Animal ani2 = new Animal(color2, name2, weight2, height2);
    	
        Assert.assertEquals(color1, ani1.getColor());
        Assert.assertEquals(name1, ani1.getName());
        Assert.assertEquals(300.0, ani1.getWeight(), 0.01);
        Assert.assertEquals(250.0, ani1.getHeight(), 0.01);
    	
        Assert.assertEquals(color2, ani2.getColor());
        Assert.assertEquals(name2, ani2.getName());
        Assert.assertEquals(450.0, ani2.getWeight(), 0.01);
        Assert.assertEquals(72.0, ani2.getHeight(), 0.01);
    }
}

