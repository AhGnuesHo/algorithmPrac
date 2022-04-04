import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static char[][] board; // 입력된 보드

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        board = new char[r][c];
        for (int i = 0; i < r; i++) {
            board[i] = sc.next().toCharArray();
        }
        int[] arr = new int[(r - 7) * (c - 7)];
        int s = 0;
            for (int i = 0; i < r - 7; i++) {
                for (int h = 0; h < c - 7; h++) {
                    arr[s] = find(i, h);
                    s++;
                }

        }

        Arrays.sort(arr);
        System.out.println(arr[0]);
    }

    public static int find(int x, int y) {
        int lastX = x + 8;
        int lastY = y + 8;

        char newBoard = board[x][y];
        int count = 0;
        for (int i = x; i < lastX; i++) {
            for (int j = y; j < lastY; j++) {
                if (board[i][j] != newBoard) {
                    count++;
                }
                if (newBoard == 'W') {
                    newBoard = 'B';
                } else {
                    newBoard = 'W';
                }
            }
            if (newBoard == 'W') {
                newBoard = 'B';
            } else {
                newBoard = 'W';
            }
        }

        int compare = 64 - count;
        return Math.min(compare, count);
    }
}