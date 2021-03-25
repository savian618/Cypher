
/**
 * class Hurricane modeling a hurricane that has a name (string) and a category
 * (integer), which can have a value from 0 to 5 inclusive.
 * 
 * 
 * @author Savian Elam
 * @version March 2, 2021
 */

public class Hurricane {

    private String name;
    private int    category;

    /**
     * It initializes the hurricane’s category to 1 and its name to the given
     * string.
     * 
     * @param n
     *            the name of the hurricane.
     */
    public Hurricane(String n) {
        if (n == null) {
            throw new IllegalArgumentException(
                "Hurricane name cannot be null");
        }
        else if (n == "") {
            throw new IllegalArgumentException(
                "Hurricane name cannot be empty");
        }
        else {
            this.name = n;
        }
        this.category = 1;

    }


//


    /**
     * Gets the value of Hurricane's name
     * 
     * @return the name of the hurricane
     */
    public String getName() {
        return this.name;
    }


    /**
     * Sets the value of the hurricane
     * 
     * @param c
     *            the category of the
     */
    public void setCategory(int c) {
        if (c <= 5 && c >= 0)
            this.category = c;
    }


    /**
     * Gets the category of the hurricane
     * 
     * @return the value for the category of the hurricane
     */
    public int getCategory() {
        return this.category;
    }


    /**
     * Increments category by 1 but not beyond 5.
     */
    public void increment() {
        if (this.category < 5) {
            this.category += 1;
        }
    }


    /**
     * Decrements category by 1 but not below 0.
     */
    public void decrement() {
        if (this.category > 0) {
            this.category -= 1;
        }
    }


    /**
     * Two hurricanes are the same if they have the same name and category
     * 
     * @param h
     *            another object of hurricane
     * @return a boolean
     */
    public boolean equals(Hurricane h) {
        if (this.name == h.name && this.category == h.category) {
            return true;
        }
        return false;
    }


    /**
     * Finds the hashcode of the hurricane's name and category
     * 
     * @return Hash-code of the hurricane’s name
     */
    public int hashCode() {
        return this.category * this.name.hashCode();
    }


    /**
     * compares hurricanes by name and (if equal) by category
     * 
     * @param other
     *            another Object of Hurricane
     * @return an integer
     */
    public int compareTo(Hurricane other) {
        int l1 = (this.name).length();
        int l2 = (other.name).length();
        int ans = 0;
        if (l1 < l2) {
            ans = -1;
        }
        else if (l1 > l2) {
            ans = 1;
        }
        if (l1 == l2) {
            if (this.category < other.category) {
                ans = -1;
            }
            else if (this.category > other.category) {
                ans = 1;
            }
            else {
                ans = 0;
            }
        }
        return ans;

    }


    /**
     * Method uses string formatting to print Hurricane name and category
     * 
     * @return a string of Hurricane indicating name and category
     */
    public String toString() {
        return String.format(
            "Hurricane [name=%s, category=%d]",
            this.name,
            this.category);
    }

}
