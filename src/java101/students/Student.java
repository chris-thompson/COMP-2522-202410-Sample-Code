package java101.students;

/**
 * Represents a BCIT student.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2024
 */
public class Student {

    private final String firstName;
    private final String lastName;
    private final Address homeAddress;
    private final Address schoolAddress;

    /**
     * Constructs a Student object that contains the specified values.
     *
     * @param firstName  a String representing the usefulclasses name
     * @param lastName   a String representing the last name
     * @param homeAddress   an Address object containing the home address
     * @param schoolAddress an Address object containing the school address
     */
    public Student(final String firstName,
                   final String lastName,
                   final Address homeAddress,
                   final Address schoolAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }

    /**
     * Returns a String description of this Student object.
     * @return formatted value of firstName, lastName, homeAddress, schoolAddress.
     */
    @Override
    public String toString() {
        final StringBuilder mutableString = new StringBuilder("Student{");
        mutableString.append("firstName='").append(firstName).append('\'');
        mutableString.append(", lastName='").append(lastName).append('\'');
        mutableString.append(", homeAddress=").append(homeAddress);
        mutableString.append(", schoolAddress=").append(schoolAddress);
        mutableString.append('}');
        return mutableString.toString();
    }
}
