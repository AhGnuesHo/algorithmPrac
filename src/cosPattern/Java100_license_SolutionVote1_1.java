package cosPattern;// 한 학급에서 반장 선거를 하는데 3명의 후보자를 두고 7명의 학생이 투표를 하였다.
// 1~3번 까지의 후보자들중에서 과반수 이상 득표를 하면 당선이 된다.
// 투표 박스는 배열의 리스트로 제공되며 여기에는 1~3번 각 후보자의 번호가 기표되어 있다. 
// 아래와 같이 동작하도록 투표 솔루션 시스템을 자바 코드로 구현하시오.
// (1) 각 후보자가 득표한 득표 수를 출력하시오.
// (2) 가장 많은 득표 수와 그때의 후보자 번호를 출력하시오. 
// (3) 가장 많은 득표를 한 후보자의 득표 수가 과반수 이상을 확보하였는지 체크하여 최종적인 당선 또는 미당선을 출력하시오.


import java.util.Arrays;

class Solution_1 {
    // Field

    // Constructor
    public Solution_1() {
    }

    // Method
    public void solutionMethod(int candidate, int[] voteBox) {

        // 후보자들이 얻은 득표 수를 넣을 배열
        int[] candidateVoteCnt = new int[candidate+1]; // 0번 후보는 없으니까 0번 배열은 제외

        // 최다 득표 수
        int maxCnt = 0;


        // 후보자번호를 배열의 인덱스에 넣음
        for (int i = 0; i < voteBox.length; i++) {
            candidateVoteCnt[voteBox[i]]++ ;
        }

        for (int i = 1; i < candidateVoteCnt.length; i ++){
            System.out.println(i + "번후보 -->" + candidateVoteCnt[i] + "표");
        }

        // 오름차순 정렬
        Arrays.sort(candidateVoteCnt);
        System.out.println("최소득표수는 ---> " + candidateVoteCnt[1]);
        System.out.println("최다득표수는 ---> " + candidateVoteCnt[candidateVoteCnt.length-1]);

        // 과반수
        maxCnt = candidateVoteCnt[candidateVoteCnt.length-1];
        if (maxCnt > voteBox.length / 2){
            System.out.println( "과반수 이상 득표했습니다. --> 당선" );
        } else {
            System.out.println( "과반수 이상 실패했습니다. --> 미당선" );
        }

    }
}

public class Java100_license_SolutionVote1_1 {
    public static void main(String[] args) {

        // [1] : 객체 생성
        Solution_1 s1 = new Solution_1();

        // [2] : 득표한 표 수를 저장하는 정수형 배열 선언
        int[] voteBox = {1, 3, 1, 3, 3, 2, 2};

        // [3] : solutionMethod() 호출 --> 2개 입력 파라미터 값 전달 --> 후보자 수 3명, 득표 수 배열
        s1.solutionMethod(3, voteBox);

    }
}












