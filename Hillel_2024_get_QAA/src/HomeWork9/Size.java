package HomeWork9;

public enum Size {
    Name("S", "M", "L"),
    Width(5),
    Length (7.9);
    private String s;
    private String m;

    private String l;

    private Integer width;
    private Integer width () {
        return width;
    }

    private Double length;
    private Double length () {
        return length;
    }
    Size(String s, String m, String l) {
        this.s = s;
        this.m = m;
        this.l = l;
    }
    public String getSizeS () {
        return s;
    }


    public String getSizeM () {
        return m;
    }

    public String getSizeL () {
        return l;
    }

    Size(Integer width){
        this.width = width;
    }
    public Integer getWidth(){
        return width;
    }

    public String toString(){
        return name();
    }

    Size(Double length){
        this.length = length;
    }

    public Double getLength(){
        return length;
    }


}
