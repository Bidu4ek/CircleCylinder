package Classes;

public class Circle {
    public final float radiusToDiagonal = 2;
    double radiusCircle;

    public final double getRadiusCircle() {
        return radiusCircle;
    }

    public void setRadiusCircle(double radiusCircle) {
        this.radiusCircle = radiusCircle > 0 ? radiusCircle:-1;
    }

    public final double getLenghtCircle() {
        return radiusCircle*radiusToDiagonal*Math.PI;
    }

    public final double getSquareCircle() {
        return Math.PI*Math.pow(radiusCircle,2);
    }

}
