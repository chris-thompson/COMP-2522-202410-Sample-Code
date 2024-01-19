package java101.geometry;

/**
 * Cone.
 *
 * @author BCIT
 * @version 2024
 */
public class Cone {
    private static final double SQUARED = 2.0;

    private double radius;
    private double height;

    /**
     * Constructs an object of type Cone.
     *
     * @param radius of the cone
     * @param height of the cone
     */
    public Cone(final double radius, final double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Returns the radius for this Cone.
     *
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius for this Cone.
     *
     * @param radius the radius to set
     */
    public void setRadius(final double radius) {
        this.radius = radius;
    }

    /**
     * Returns the height for this Cone.
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height for this Cone.
     *
     * @param height the height to set
     */
    public void setHeight(final double height) {
        this.height = height;
    }

    /**
     * Returns this Cone's volume.
     *
     * @return volume
     */
    public double getVolume() {
        final double third = 1.0 / 3.0;
        return third * Math.PI * Math.pow(radius, SQUARED);
    }

    /**
     * Returns this Cone's slant height.
     *
     * @return slantHeight
     */
    public double getSlantHeight() {
        return Math.sqrt(Math.pow(radius, SQUARED) + Math.pow(height, SQUARED));
    }

    /**
     * Returns this Cone's surface area.
     *
     * @return surfaceArea
     */
    public double getSurfaceArea() {
        return Math.PI * Math.pow(radius, SQUARED)
                + Math.PI * radius * Math.sqrt(Math.pow(radius, SQUARED)
                + Math.pow(height, SQUARED));
    }

    /**
     * Returns a String representation of this Cone.
     *
     * @return toString
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Cone [radius=" + getRadius() + ", height=" + getHeight() + "]";
    }

}
