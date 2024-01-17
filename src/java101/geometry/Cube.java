package java101.geometry;

/**
 * Cube.
 *
 * @author BCIT
 * @version 2024
 */
public class Cube {
    private static final double SQUARED = 2.0;
    private static final double CUBED = 3.0;

    private double edgeLength;
    private double xCoordinate;
    private double yCoordinate;
    private double zCoordinate;

    /**
     * Constructs an object of type Cube.
     *
     * @param edgeLength of the Cube
     * @param x          the x Cartesian coordinate of the centre
     * @param y          the y Cartesian coordinate of the centre
     * @param z          the z Cartesian coordinate of the centre
     */
    public Cube(final double edgeLength, final double x, final double y, final double z) {
        this.edgeLength = edgeLength;
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.zCoordinate = z;
    }

    /**
     * Returns the edgeLength for this Cube.
     *
     * @return edgeLength
     */
    public double getEdgeLength() {
        return edgeLength;
    }

    /**
     * Sets the edgeLength for this Cube.
     *
     * @param edgeLength the edgeLength to set
     */
    public void setEdgeLength(final double edgeLength) {
        this.edgeLength = edgeLength;
    }

    /**
     * Returns the xCoordinate for this Cube.
     *
     * @return xCoordinate
     */
    public double getxCoordinate() {
        return xCoordinate;
    }

    /**
     * Sets the xCoordinate for this Cube.
     *
     * @param xCoordinate the xCoordinate to set
     */
    public void setxCoordinate(final double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    /**
     * Returns the yCoordinate for this Cube.
     *
     * @return yCoordinate
     */
    public double getyCoordinate() {
        return yCoordinate;
    }

    /**
     * Sets the yCoordinate for this Cube.
     *
     * @param yCoordinate the yCoordinate to set
     */
    public void setyCoordinate(final double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    /**
     * Returns the zCoordinate for this Cube.
     *
     * @return zCoordinate
     */
    public double getzCoordinate() {
        return zCoordinate;
    }

    /**
     * Sets the zCoordinate for this Cube.
     *
     * @param zCoordinate the zCoordinate to set
     */
    public void setzCoordinate(final double zCoordinate) {
        this.zCoordinate = zCoordinate;
    }

    /**
     * Returns this Cube's surface area.
     *
     * @return surfaceArea
     */
    public double getSurfaceArea() {
        final double six = 6.0;
        return six * Math.pow(edgeLength, SQUARED);
    }

    /**
     * Returns this Cube's volume.
     *
     * @return volume
     */
    public double getVolume() {
        return Math.pow(edgeLength, CUBED);
    }

    /**
     * Returns this Cube's face diagonal.
     *
     * @return volume
     */
    public double getFaceDiagonal() {
        final int faceDiagonal = 2;
        return Math.sqrt(faceDiagonal) * edgeLength;
    }

    /**
     * Returns this Cube's space diagonal.
     *
     * @return volume
     */
    public double getSpaceDiagonal() {
        final int spaceDiagonal = 3;
        return Math.sqrt(spaceDiagonal) * edgeLength;
    }

    /**
     * Returns a String representation of this Cube.
     *
     * @return toString
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Cube [edgeLength=" + edgeLength + ", xCoordinate="
                + xCoordinate + ", yCoordinate=" + yCoordinate
                + ", zCoordinate=" + zCoordinate + "]";
    }

}
