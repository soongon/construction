package kr.or.ssis.construction.model;

public class Construction {
    private int constId;
    private String name;
    private String location;
    private int scale;

    public Construction() {}

    public Construction(int constId, String name, String location, int scale) {
        this.constId = constId;
        this.name = name;
        this.location = location;
        this.scale = scale;
    }

    public int getConstId() {
        return constId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getScale() {
        return scale;
    }

    @Override
    public String toString() {
        return "Construction{" +
                "constId=" + constId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", scale=" + scale +
                '}';
    }
}
