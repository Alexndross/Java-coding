package gr.aueb.cf.ch15.immutable;

public  final class ImmutablePoint3D2 {
    private final ImmutablePoint point;
    private final int z;

    public ImmutablePoint3D2() {
        this.point = new ImmutablePoint();
        this.z = 0;
    }
}
 