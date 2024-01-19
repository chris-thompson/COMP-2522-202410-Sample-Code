package java101.name;

/**
 * Name represents a three-part Name.
 *
 * @author BCIT
 * @version 2024
 */
public class Name {

    /**
     * Default first java101.name.
     */
    public static final String DEFAULT_FIRST = "Boaty";

    /**
     * Default middle java101.name.
     */
    public static final String DEFAULT_MIDDLE = "B";

    /**
     * Default last java101.name.
     */
    public static final String DEFAULT_LAST = "McBoatface";

    private String first;
    private String middle;
    private String last;

    /**
     * Constructs an object of type Name.
     *
     * @param firstName  a String
     * @param middleName a String
     * @param lastName   a String
     */
    public Name(final String firstName, final String middleName, final String lastName) {

        if (firstName != null && !firstName.trim().isEmpty()) {
            this.first = firstName.trim().substring(0, 1).toUpperCase()
                    + firstName.trim().substring(1).toLowerCase();
        } else {
            this.first = DEFAULT_FIRST;
        }

        if (middleName != null && !middleName.trim().isEmpty()) {
            this.middle = middleName.trim().substring(0, 1).toUpperCase()
                    + middleName.trim().substring(1).toLowerCase();
        } else {
            this.middle = DEFAULT_MIDDLE;
        }

        if (lastName != null && !lastName.trim().isEmpty()) {
            this.last = lastName.trim().substring(0, 1).toUpperCase()
                    + lastName.trim().substring(1).toLowerCase();
        } else {
            this.last = DEFAULT_LAST;
        }
    }

    /**
     * Returns the first java101.name.
     *
     * @return first as a String
     */
    public String getFirst() {
        return first;
    }

    /**
     * Sets the first java101.name.
     *
     * @param first the  to set
     */
    public void setFirst(final String first) {
        if (first != null && !first.trim().isEmpty()) {
            this.first = first.trim().substring(0, 1).toUpperCase()
                    + first.trim().substring(1).toLowerCase();
        }
    }

    /**
     * Returns the middle java101.name.
     *
     * @return middle
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Sets the middle java101.name.
     *
     * @param middle the middle to set
     */
    public void setMiddle(final String middle) {
        if (!middle.trim().isEmpty()) {
            this.middle = middle.trim().substring(0, 1).toUpperCase()
                    + middle.trim().substring(1).toLowerCase();
        }
    }

    /**
     * Returns the last java101.name.
     *
     * @return last
     */
    public String getLast() {
        return last;
    }

    /**
     * Sets the last java101.name.
     *
     * @param last the last to set
     */
    public void setLast(final String last) {
        if (!last.trim().isEmpty()) {
            this.last = last.trim().substring(0, 1).toUpperCase()
                    + last.trim().substring(1).toLowerCase();
        }
    }

    /**
     * Returns the length of this Name.
     *
     * @return length
     */
    public int getLength() {
        return first.length() + middle.length() + last.length();
    }

    /**
     * Returns this Name as three uppercase initials.
     *
     * @return initials
     */
    public String getInitials() {
        return first.substring(0, 1).toUpperCase()
                + middle.substring(0, 1).toUpperCase()
                + last.substring(0, 1).toUpperCase();
    }

    /**
     * Returns the specified character in this Name.  If the
     * index exceeds the length of the String, '@' is
     * returned instead.  Index must be between [0, length() - 1]
     *
     * @param index the nth character to acquire
     * @return index character, or @ if index > length
     */
    public char getCharacter(final int index) {
        if (index >= getLength()) {
            return '@';
        } else {
            String fullName = first + middle + last;
            return fullName.charAt(index);
        }
    }

    /**
     * Returns Name formatted as "LastName, FirstName MiddleName".
     *
     * @return formatted as Last, First Middle
     */
    public String getFormattedName() {
        return last + ", " + first + " " + middle;
    }

    /**
     * Returns true if the specified String is the first java101.name.
     *
     * @param name to compare
     * @return true if the same, else false
     */
    public boolean isFirstName(final String name) {
        return first.equals(name);
    }


    /**
     * Returns a String representation of this Name.
     *
     * @return Name as a String with the components labeled.
     */
    @Override
    public String toString() {
        return "Name{" + "first='"
                + getFirst() + '\''
                + ", middle='"
                + getMiddle()
                + '\''
                + ", last='"
                + getLast() + '\''
                + '}';
    }
}
