package test;

public class Rectangule {
	private int type;
    private int base;
    private int height;
    private double area;

    public Rectangule() {
    	
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
	    if (type != 4) {
	        throw new IllegalArgumentException("Type must be 4.");
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
    	area = (double) this.base*this.height;
    }


}