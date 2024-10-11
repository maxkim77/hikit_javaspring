package ch04;

public class Subject {
	private int korean;
	private int english;
	private int math;
	private int sum;
	private double avg;
	
	public Subject() {}
	
	public Subject(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;	
		
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void cmpSum() {
		sum =korean+english+math;
	}

	public double getAvg() {
		return avg;
	}

	public void cmpAvg() {
		this.avg = (double) sum/3;
	}
	
	
	
}
