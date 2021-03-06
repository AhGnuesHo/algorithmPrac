package cosPattern;// continue label이란 무엇인지 설명해보고 관련된 예제를 코드로 구현해보시오.
// 이중 반복문내에서 특정 조건이 맞으면 바깥쪽 반복문으로 분기하여 그 반복문의 다음 단계부터 다시 시작할 때 사용한다.
// 이 문제는 생각보다 까다로운 continue와 continue label 사용에 대해서 아는지를 묻는 문제이다.
/*
0 2 4 6 8         0
10 12 14 16 18    10
20 22 24 26 28    20
30 32 34 36 38    30
*/


public class Java100_license_CosPattern3 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) { // 0번대, 10번대, 20번대, 30번대

            for (int j = 0; j < 10; j++) { // i번대를 i+10번까지
                if (j % 2 == 0) { // 짝수만
                    if (i == 0) {
                        System.out.print(j + " "); // 0 2 4 6 8
                    } else {
                        System.out.print(i +"" + j + " "); // 10 12 14 16 18, 10 , 20 22 24 26 28, 30 32 34 36 38
                    }
                }
                continue;
            }

            if (i == 0) {
                System.out.println("          " + i);
            } else {
                System.out.println("          " + i + "0");
            }

        }
    }

}














