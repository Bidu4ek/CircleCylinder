package Classes;

public class Cylinder extends Circle{
    private  final double quantityCircles = 2;
    public double getHeight() {
        return heightCylinder;
    }

    public void setHeight(double heightCylinder) {
        this.heightCylinder = heightCylinder > 0 ? heightCylinder : -1;
    }

    double heightCylinder;

    public double getRadiusCylinder() {
        return radiusCylinder;
    }

    public void setRadiusCylinder(double radiusCylinder) {
        this.radiusCylinder = radiusCylinder;
    }

    double radiusCylinder;

    public double getSquareCylinder() {
        return (getSideSquareCylinder()) + (this.quantityCircles * Math.pow(getRadiusCylinder(),2) * Math.PI );
    }

    public double getSideSquareCylinder() {
        return radiusToDiagonal*getRadiusCylinder()*this.heightCylinder*Math.PI;
    }

    public double getVolumeCylinder(){
        return  (Math.pow(getRadiusCylinder(),2)*Math.PI*this.heightCylinder);
    }
}
