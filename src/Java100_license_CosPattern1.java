// 배열내 숫자들의 각 빈도 수를 출력하는 코드를 구현하시오.
// [ 1, 3, 2, 2, 1, 3, 1, 1 ] 각 숫자별 빈도 수는?
// 1 --> 4회, 2 --> 2회, 3 --> 2회

public class Java100_license_CosPattern1 {
	public static void main(String[] args) {
		
		// [1] : 배열 선언
		int[] target = {1, 3, 2, 2, 1, 3, 1, 1};
		
		// [2] : 배열내 각 숫자들의 빈도 수 출력하기
		// 1 --> 빈 정수형 배열(ar)을 하나 만들어놓고 초깃값은 모두 0으로 셋팅한다.
		// 2 --> target 배열내 숫자가 빈 배열(ar)의 인덱스로 적용되서 해당 인덱스의 ar 배열 요소의 값을 1씩 증가시킨다.
		// 3 --> 이때, 빈 배열(ar)의 요소 갯수는 target 배열내 숫자들의 종류 만큼 지정한다.
		int[] ar = new int[4];

		for (int i = 0; i<target.length; i++){
			int arIndex = target[i]; // 타겟의 i번째 값이 ar의 인덱스에 들어간다.
			ar[arIndex] ++;
		}

		for (int j = 0; j < ar.length; j ++){
			System.out.println(j + " --> " + ar[j] + "회");
		}
	}
}
