package ch04;

public class Animal {
	private boolean live;
	private int age;
	private String name;
	
	public Animal() {
		
	}
	
	public Animal(boolean live, int age, String name) {
		this.live = live;
		this.age = age;
		this.name = name;
	}
	
	public boolean getLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	

}
