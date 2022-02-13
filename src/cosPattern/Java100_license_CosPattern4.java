package cosPattern;// Cos Pro 2급, 1급 문제에서 자주 나오는 패턴중 하나인 2차원 배열을 구현해보시오.
// 이때, Shape은 5x5 구조로 생성하여 값을 입력하고 출력도 해보시오.
// 특정 좌표에는 "★"을 입력해보시오.

 
 public class Java100_license_CosPattern4 {
	 public static void main(String[] args) {
		 
		 // [1] : 2차원 배열의 행과 열 선언
		 int R = 5, C = 5;
		 
		 // [2] : char 2차원 배열 선언 및 요소 값 입력 셋팅
		 char[][] ar = new char[][]{
			 { '□', '□', '□', '□', '□' },
			 { '□', '□', '□', '□', '□' },
			 { '□', '□', '★', '□', '□' },
			 { '□', '□', '□', '□', '□' },
			 { '□', '□', '□', '□', '□' },
		 };
		 
		 //  2차원 배열에 들어있는 요소 값들을 출력 --> 반복문
		 System.out.println( "----------------------------" );
		 for( int i=0; i < R; i++ ) {
			 for( int j=0; j < C; j++ )
				 System.out.print( ar[i][j] );
			 System.out.println();
		 }
		 System.out.println( "----------------------------" );
		 
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 