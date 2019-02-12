/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class EquipmentTest
{

    /**
     * Test the empty Equipment constructor and the getters
     */
    public void equipmentEmptyConstructorTest() throws AssertException
    {
        // Use the default constructor
    	String strg = " /0,0.0,0.0, ";
    	
        String[] tokens = strg.split(",");
        String[] idinfo = tokens[0].split("/");
        String name = idinfo[0];
        int count = Integer.parseInt(idinfo[1]);
        double totalWeight = Double.parseDouble(tokens[1]);
        double totalPrice = Double.parseDouble(tokens[2]);
        String description = tokens[3];
        

        // The name should be "noname", number weight price 0, description.
        Assert.assertEquals(" ", name);
        Assert.assertEquals(0, count);
        Assert.assertEquals(0.0, totalWeight);
        Assert.assertEquals(0.0, totalPrice);
        Assert.assertEquals(" ", description);
        }

    // TODO: test full constructor, getters, and toString
    public void equipmentTestConstructorParams() throws AssertException
    {
    	String strg = "Batarang/5,5.0,5.0,A boomerang for bats";
        String[] tokens = strg.split(",");
        String[] idinfo = tokens[0].split("/");
        String name1 = idinfo[0];
        int count1 = Integer.parseInt(idinfo[1]);
        double totalWeight1 = Double.parseDouble(tokens[1]);
        double totalPrice1 = Double.parseDouble(tokens[2]);
        String description1 = tokens[3];
        
        Assert.assertEquals("Batarang", name1);
        Assert.assertEquals(5, count1);
        Assert.assertEquals(5.0, totalWeight1);
        Assert.assertEquals(5.0, totalPrice1);
        Assert.assertEquals("A boomerang for bats", description1);
        
    	

    }
}