package java101.variablelength;

/**
 * Demonstrates the use of variable length parameter lists.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2024
 */
public class Family {
    /**
     * Names of family members.
     */
    private final String[] members;

    /**
     * Constructs a Family object by storing the (possibly multiple)
     * names that are passed as passByValue.
     *
     * @param names a variable number of Strings
     */
    public Family(final String... names) {
        members = names;
    }

    /**
     * Returns a description of this Family as a String.
     *
     * @return toString description
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String name : members) {
            result.append(name).append("\n");
        }
        return result.toString();
    }
}
