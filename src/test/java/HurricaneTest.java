import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


/**
 *  Test case functions for the Hurricane Class
 * 
 *  @author Savian Elam
 *  @version March 4, 2021
 */
class HurricaneTest {

    /**
     * Tests getName function in Hurricane
     */
    @Test
    public void testGetName() {
        Hurricane h1 = new Hurricane("Jacob");
        String name1 = h1.getName();
        assertEquals( "Jacob", name1, "Hurricane name should be Jacob");
        
        Hurricane h2 = new Hurricane("Lisa");
        String name2 = h2.getName();
        assertEquals( "Lisa", name2, "Hurricane name should be Lisa");
        
        Hurricane h3 = new Hurricane("Ann");
        String name3 = h3.getName();
        assertEquals( "Ann", name3, "Hurricane name should be Ann");
        
        Hurricane h4 = new Hurricane("Karma");
        String name4 = h4.getName();
        assertEquals( "Karma", name4, "Hurricane name should be Karma");
        
        Hurricane h5 = new Hurricane("Rob");
        String name5 = h5.getName();
        assertEquals( "Rob", name5, "Hurricane name should be Rob");
    }
    
    /**
     * Tests getCategory function in Hurricane
     */
    @Test
    void testGetCategory() {
        Hurricane h0 = new Hurricane("Lester");
        h0.setCategory(0);
        int c0 = h0.getCategory();
        assertEquals(0, c0, "Hurricane category should be 0");
        
        Hurricane h1 = new Hurricane("Jacob");
        h1.setCategory(1);
        int c1 = h1.getCategory();
        assertEquals(1, c1, "Hurricane category should be 1");
        
        Hurricane h2 = new Hurricane("Lisa");
        h2.setCategory(2);
        int c2 = h2.getCategory();
        assertEquals(2, c2, "Hurricane category should be 2");
        
        Hurricane h3 = new Hurricane("Ann");
        h3.setCategory(3);
        int c3 = h3.getCategory();
        assertEquals(3, c3, "Hurricane category should be 3");
        
        Hurricane h4 = new Hurricane("Karma");
        h4.setCategory(4);
        int c4 = h4.getCategory();
        assertEquals(4, c4, "Hurricane category should be 4");
        
        Hurricane h5 = new Hurricane("Rob");
        h5.setCategory(5);
        int c5 = h5.getCategory();
        assertEquals(5, c5, "Hurricane category should be 5");
        
        Hurricane h6 = new Hurricane("Andrew");
        h6.setCategory(15);
        int c6 = h6.getCategory();
        assertEquals(1, c6, "Hurricane category should be 1");
    }
    
    /**
     * Tests increment function in Hurricane
     */
    @Test
    void testIncrement() {
        Hurricane h1 = new Hurricane("Jacob");
        h1.setCategory(1);
        int c1 = h1.getCategory();
        assertEquals(1, c1, "Hurricane category should be 1");
        
        h1.increment();
        int c2 = h1.getCategory();
        assertEquals(2, c2, "Hurricane category should be 2");
        
        h1.increment();
        int c3 = h1.getCategory();
        assertEquals(3, c3, "Hurricane category should be 3");
        
        h1.increment();
        int c4 = h1.getCategory();
        assertEquals(4, c4, "Hurricane category should be 4");
        
        h1.increment();
        int c5 = h1.getCategory();
        assertEquals(5, c5, "Hurricane category should be 5");

        h1.increment();
        int c6 = h1.getCategory();
        assertEquals(5, c6, "Hurricane category should be 1");
    }

    /**
     * Tests decrement function in Hurricane
     */
    @Test
    void testDecrement() {
        Hurricane h1 = new Hurricane("Jacob");
        h1.setCategory(5);
        int c1 = h1.getCategory();
        assertEquals(5, c1, "Hurricane category should be 5");
        
        h1.decrement();
        int c2 = h1.getCategory();
        assertEquals(4, c2, "Hurricane category should be 4");
        
        h1.decrement();
        int c3 = h1.getCategory();
        assertEquals(3, c3, "Hurricane category should be 3");
        
        h1.decrement();
        int c4 = h1.getCategory();
        assertEquals(2, c4, "Hurricane category should be 2");
        
        h1.decrement();
        int c5 = h1.getCategory();
        assertEquals(1, c5, "Hurricane category should be 1");
        
        h1.decrement();
        int c0 = h1.getCategory();
        assertEquals(0, c0, "Hurricane category should be 0");
    }
    
    /**
     * Tests equals function in Hurricane
     */
    @Test
    void testEquals() {
        Hurricane h1 = new Hurricane("Jacob");
        h1.setCategory(1);
        
        Hurricane h2 = new Hurricane("Jacob");
        h2.setCategory(12);
        
        Hurricane h3 = new Hurricane("Sam");
        h3.setCategory(5);
        
        Hurricane h4 = new Hurricane("Sam");
        h4.setCategory(5);
        
        assertTrue(h1.equals(h2));
        assertTrue(h3.equals(h4));
        assertFalse(h3.equals(h1));
        assertFalse(h4.equals(h2));
        
    }
    
    /**
     * Tests hashCode function in Hurricane
     */
    @Test
    void testHashCode() {
        Hurricane h0 = new Hurricane("Sam");
        h0.setCategory(0);
        int hash0 = h0.getCategory() * h0.getName().hashCode();
        
        Hurricane h1 = new Hurricane("James");
        h1.setCategory(1);
        int hash1 = h1.getCategory() * h1.getName().hashCode();
        
        Hurricane h2 = new Hurricane("Andrew");
        h2.setCategory(2);
        int hash2 = h2.getCategory() * h2.getName().hashCode();
        
        Hurricane h3 = new Hurricane("Kyle");
        h3.setCategory(3);
        int hash3 = h3.getCategory() * h3.getName().hashCode();
        
        Hurricane h4 = new Hurricane("Mitch");
        h4.setCategory(4);
        int hash4 = h4.getCategory() * h4.getName().hashCode();
        
        Hurricane h5 = new Hurricane("Becky");
        h5.setCategory(5);
        int hash5 = h5.getCategory() * h5.getName().hashCode();
       
        assertEquals(h0.hashCode(), hash0, "Hash code shouls be " + hash0);
        assertEquals(h1.hashCode(), hash1, "Hash code shouls be " + hash1);
        assertEquals(h2.hashCode(), hash2, "Hash code shouls be " + hash2);
        assertEquals(h3.hashCode(), hash3, "Hash code shouls be " + hash3);
        assertEquals(h4.hashCode(), hash4, "Hash code shouls be " + hash4);
        assertEquals(h5.hashCode(), hash5, "Hash code shouls be " + hash5);
        
    }
    
    /**
     * Tests compareTo function in Hurricane
     */
    @Test
    void testCompareTo() {
        Hurricane h1 = new Hurricane("Hilary");
        h1.setCategory(5);
        Hurricane h2 = new Hurricane("Will");
        h2.setCategory(3);
        Hurricane h3 = new Hurricane("Ashley");
        h3.setCategory(5);
        Hurricane h4 = new Hurricane("Carlton");        
        Hurricane h5 = new Hurricane("Phil");
        h5.setCategory(4);
        Hurricane h6 = new Hurricane("Jazz");
        h6.setCategory(2);
        
        assertEquals(0, h1.compareTo(h3));
        assertEquals(1, h4.compareTo(h1));
        assertEquals(1, h3.compareTo(h5));
        assertEquals(-1, h5.compareTo(h1));
        assertEquals(-1, h3.compareTo(h4));
        
        assertEquals(-1, h6.compareTo(h2));
        assertEquals(1, h5.compareTo(h2));
    }
    
    /**
     * Tests toString function in Hurricane
     */
    @Test
    void testToString() {
        Hurricane h1 = new Hurricane("Charlie");
        h1.setCategory(0);
        assertEquals("Hurricane [name=Charlie, category=0]", h1.toString());
        
        Hurricane h2 = new Hurricane("Ray");
        h2.setCategory(1);
        assertEquals("Hurricane [name=Ray, category=1]", h2.toString());
        
        Hurricane h3 = new Hurricane("Jamie");
        h3.setCategory(4);
        assertEquals("Hurricane [name=Jamie, category=4]", h3.toString());
        
        Hurricane h4 = new Hurricane("Helen");
        h4.setCategory(5);
        assertEquals("Hurricane [name=Helen, category=5]", h4.toString());
    }
    
    /**
     * Test the Constructor in Hurricane
     */
    @Test
    void testConstructor() {
        Hurricane h0 = new Hurricane("Rylie");
        assertEquals("Rylie", h0.getName());
        assertEquals(1, h0.getCategory());
        
        Hurricane h1 = new Hurricane("Maggie");
        assertEquals("Maggie", h1.getName());
        assertEquals(1, h1.getCategory());
        
        Hurricane h4 = new Hurricane("Hannah");
        assertEquals("Hannah", h4.getName());
        assertEquals(1, h4.getCategory());
        
        Hurricane h5 = new Hurricane("b");
        assertEquals("b", h5.getName());
        assertEquals(1, h5.getCategory());
        
        Hurricane h6 = new Hurricane("jo");
        assertEquals("jo", h6.getName());
        assertEquals(1, h6.getCategory());
        
        Hurricane h7 = new Hurricane("Red");
        assertEquals("Red", h7.getName());
        assertEquals(1, h7.getCategory());
        
        Hurricane h8 = new Hurricane("Earl");
        assertEquals("Earl", h8.getName());
        assertEquals(1, h8.getCategory());
        
        
        boolean thrown = false;
        try {
            Hurricane h2 = new Hurricane(null);
        } 
        catch (IllegalArgumentException e) {
          thrown = true;
        }

        assertTrue(thrown);
        
        thrown = false;

        try {
            Hurricane h3 = new Hurricane("");
        } 
        catch (IllegalArgumentException e) {
          thrown = true;
        }
        
        assertTrue(thrown);
        
    }
    
    /**
     * Place a description of your method here.
     * @throws IllegalArgumentException 
     */
    @Test
    void testException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Hurricane h1 = new Hurricane("");
        });
        
        assertEquals("Hurricane name cannot be empty", exception.getMessage());
        
        Throwable exception2 = assertThrows(IllegalArgumentException.class, () -> {
            Hurricane h2 = new Hurricane(null);
        });
        
        assertEquals("Hurricane name cannot be null", exception2.getMessage());
        
    }
    

}
