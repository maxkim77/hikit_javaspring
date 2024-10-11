package test;

public class Triangle {
	private int type;
    private int base;
    private int height;
    private double area;

    public Triangle() {

	}
    
	public int getType() {
		return type;
	}


	public void setType(int type) {
	    if (type != 3) {
	        throw new IllegalArgumentException("Type must be 3.");
	    }
			this.type = type;

	}

	public int getBase() {
        return base;
    }


    public void setBase(int base) {
        this.base = base;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public double getArea() {
        return area;
    }
    
    public void calcArea() {
    	area = (double) this.base*this.height / 2;
    }


}