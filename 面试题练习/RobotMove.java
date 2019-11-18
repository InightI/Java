package com.lx20191116;

import java.util.Scanner;

/**
 * 机器人走格子,从左上角走到左下角
 */
public class RobotMove
{
    public int countWays(int x, int y) {
            // write code here
            int dp[][] = new int[x][y];
            for(int i = 0; i < x; i++){
                dp[i][0] = 1;
            }
            for(int j =0; j< y; j++){
                dp[0][j] = 1;
            }
            for(int i = 1; i< x;i++){
                for(int j =1;j<y;j++){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }

            return dp[x-1][y-1];
        }

        public static void main(String[] args) {
            RobotMove robaot = new RobotMove();
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(robaot.countWays(x,y));
        }

}
