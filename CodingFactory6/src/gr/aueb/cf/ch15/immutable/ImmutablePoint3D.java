package gr.aueb.cf.ch15.immutable;

public class ImmutablePoint3D {
    private final Point point;
    private final int z;

    public ImmutablePoint3D() {
        point = new Point();
        z = 0;
    }

    public ImmutablePoint3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());
    }

    public int getZ() {
        return z;
    }
}
