import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * The test case functions for the Cypher Class
 * 
 * @author Savian Elam
 * @version March 4, 2021
 */
class CypherTest {

    /**
     * Test function for Cypher
     */
    @Test
    void cypherOnetest() {
        String text = "N QTAJ OFAF !";
        String known = "java";
        String actual = Cypher.process(text, known);
        String expected = "i love java !";
        assertEquals(expected, actual);
    }


    /**
     * Test function for Cypher
     */
    @Test
    void cypherTwotest() {
        String text =
            "T HLD ACZGTOPO HTES ESP XTYFEPD QCZX ESP XPPETYR ESLE ESP GZEP HLD SPWO. LQEPC CPGTPHTYR ESP XZDE FAOLEPO GPCDTZY ZQ ESP TQN NZYDETEFETZY LYO MJWLHD, ESP MJWLH ESLE HLD NCPLEPO WLDE DPXPDEPC HLD YZE QZFYO.";
        String known = "version";
        String actual = Cypher.process(text, known);
        String expected = "i was provided with the minutes from the meeting that the vote was held. after reviewing the most updated version of the ifc constitution and bylaws, the bylaw that was created last semester was not found.";
        assertEquals(expected, actual);
    }


    /**
     * Test function for Cypher
     */
    @Test
    void cypherThreetest() {
        String text = "QDGQ280 WG SLQWHWBU";
        String known = "is";
        String actual = Cypher.process(text, known);
        String expected = "cpsc280 is exciting";
        assertEquals(expected, actual);
    }


    /**
     * Test function for Cypher
     */
    @Test
    void cypherFourtest() {
        String text = "LET'S GO TO THE MALL TODAY";
        String known = "let's";
        String actual = Cypher.process(text, known);
        String expected = "let's go to the mall today";
        assertEquals(expected, actual);
    }


    /**
     * Test function for Cypher
     */
    @Test
    void cypherFivetest() {
        String text = "BZOSZHM ZLDQHBZ HR LX EZUNQHSD RTODQ GDQN";
        String known = "america";
        String actual = Cypher.process(text, known);
        String expected = "captain america is my favorite super hero";
        assertEquals(expected, actual);
    }


    /**
     * Test function for Cypher
     */
    @Test
    void cypherSixtest() {
        String text = "RGU M XM BXMKM";
        String known = "la";
        String actual = Cypher.process(text, known);
        String expected = "fui a la playa";
        assertEquals(expected, actual);
    }


    /**
     * Test function for Cypher
     */
    @Test
    void cypherSeventest() {
        String text = "3 KVVYZ KVDU - OLHCLU";
        String known = "doors";
        String actual = Cypher.process(text, known);
        String expected = "3 doors down - heaven";
        assertEquals(expected, actual);
    }


    /**
     * Test function for Cypher
     */
    @Test
    void cypherNinetest() {
        String text = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        String known = "fox";
        String actual = Cypher.process(text, known);
        String expected = "the quick brown fox jumps over the lazy dog";
        assertEquals(expected, actual);
    }


    /**
     * Test function for Cypher
     */
    @Test
    void cypherTentest() {
        String text = "JXYI YI JXU QBFXQRUJ QRSTUVWXYZABCDEFGHIJKLMNOP";
        String known = "the";
        String actual = Cypher.process(text, known);
        String expected = "this is the alphabet abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, actual);
    }
    
    /**
     * Test for Cypher Constructor
     */
    @Test
    void testConstructor() {
        Cypher c = new Cypher();
    }

}

