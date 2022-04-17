package com.StyleM;

public class GeometricShape {
    final Shape shape;

    public GeometricShape(Shape shape) {
        this.shape = shape;
    }

    /**
     * Calculates X of the lower right corner of the shape
     * by adding the upper left corner X and the width
     * @return The x lower right corner
     */
    public int getXLowerRightCorner() {
        return shape.getxUpperLeftCorner() + shape.getWidthLocal();
    }

    /**
     * Calculates Y of the lower right corner of the shape
     * by adding the upper left corner Y and the height
     * @return The Y lower right corner
     */
    public int getYLowerRightCorner() {
        return shape.getyUpperLeftCorner() + shape.getHeightLocal();
    }
}
