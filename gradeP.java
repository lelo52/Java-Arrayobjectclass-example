package test1;

import java.util.Scanner;

class People{
	private String name;
	private int KorG;
	private int EngG;
	private int MathG;
	private int SumG;
	private int  AvgG;
	private int RankG;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setKorG(int kor) {
		this.KorG = kor;
	}
	
	void setEngG(int eng) {
		this.EngG = eng;
	}
	
	void setMathG(int math) {
		this.MathG = math;
	}
	
	void setRankG(int rank) {
		this.RankG = rank;
	}
	
	String getName() {
		return this.name;
	}
	
	int getKor() {
		return this.KorG;
	}
	
	int getEng() {
		return this.EngG;
	}
	
	int getMath() {
		return this.MathG;
	}
	
	int getSum() {
		return this.getKor() + this.getEng() + this.getMath();
	}
	
	double getAvg(int num) {
		return this.getSum()/3;
	}
	
	int getRank() {
		return this.RankG;
	}
	
	void printScore(int num) {
		System.out.printf("%3s %3s %3s %3s %3s %3.2f %4s\n", this.getName(), this.getKor(),this.getEng(),this.getMath(),this.getSum(),this.getAvg(num),this.getRank());
	}
	
}

public class gradeP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇명의 성적처리를 하나요(숫자입력)?");
		int num = sc.nextInt();
		
		People stu[] = new People[num];
		
		for(int i =0; i< stu.length; i++) {
			stu[i] = new People();
		}
		
		for(int i=0; i<stu.length; i++) {
			System.out.println("성명을 입력하세요: ");
			stu[i].setName(sc.next());
			System.out.println("국어 점수를 입력하세요: ");
			stu[i].setKorG(sc.nextInt());
			System.out.println("영어 점수를 입력하세요: ");
			stu[i].setEngG(sc.nextInt());
			System.out.println("수학 점수를 입력하세요: ");
			stu[i].setMathG(sc.nextInt());
		}
		
		for(int i =0; i< stu.length; i++) {
			int rank=1;
			for(int j =0; j<stu.length; j++) {
				if(stu[i].getSum()< stu[j].getSum())
					rank++;
			}
			stu[i].setRankG(rank);
		}
		System.out.println("======================================");
		System.out.printf("%3s %4s %4s %4s %4s %4s %4s\n","성명","국어","영어","수학","합계","평균","석차");
		for(int i=0; i<stu.length; i++) {
			stu[i].printScore(num);
		}
	}

}
