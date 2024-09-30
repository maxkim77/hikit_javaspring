package ch03;

public class Ch0312Ex01rank {


	public static void main(String[] args) {
		int rank = 2, m =0;
		switch (rank) 
		{
			case 1:
				m=300;
				break;
			case 2:
				m=200;
				break;
			case 3:
				m=100;
				break;
			default:
				m=10;
				break;				
		}
		System.out.printf("m: %d\n",m);
	}

}
