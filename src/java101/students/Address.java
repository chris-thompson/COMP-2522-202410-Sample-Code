package java101.students;

/**
 * Represents a street address.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2024
 */
public class Address {

    private final String streetAddress;
    private final String city;
    private final String province;
    private final String postalCode;

    /**
     * Constructs an Address object with the specified data.
     *
     * @param streetAddress Holds new streetAddress
     * @param city          Holds new city
     * @param province      Holds new province
     * @param postalCode    Holds new postalCode
     */
    public Address(final String streetAddress,
                   final String city,
                   final String province,
                   final String postalCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    /**
     * Returns a String description of this Address object.
     *
     * @return formatted value of streetAddress, city, state, zipCode
     */
    public String toString() {
        String result;
        result = streetAddress + "\n";
        result += city + ", " + province + "  " + postalCode;
        return result;
    }
}
