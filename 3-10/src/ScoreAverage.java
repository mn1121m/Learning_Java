// 2차원 배열 생성 및 활용하
// 2차원 배열로 학년별로 1, 2학기 성적을 저장하고, 4년 전체 평점 평균을 출력하라.
public class ScoreAverage {
	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},   // 1 학년 1, 2학기 평점
                      	    {3.5, 3.6},   // 2 학년 1, 2학기 평점
                        	{3.7, 4.0},   // 3 학년 1, 2학기 평점
                        	{4.1, 4.2} }; // 4 학년 1, 2학기 평점
		double sum=0;
		for(int year=0; year<score.length; year++) // 각 학년별로 반복
			for(int term=0; term<score[year].length; term++) // 각 학년의 학기별로 반복
				sum += score[year][term]; // 전체 평점 합
		
		int n=score.length; // 배열의 행 개수, 4
		int m=score[0].length; // 배열의 열 개수, 2
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
	}
}
