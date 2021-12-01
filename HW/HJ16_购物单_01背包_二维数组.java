package HW;
/*王强今天很开心，公司发给N元的年终奖。王强决定把年终奖用于购物，他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，下表就是一些主件与附件的例子：

主件	附件
电脑	打印机，扫描仪
书柜	图书
书桌	台灯，文具
工作椅	无

如果要买归类为附件的物品，必须先买该附件所属的主件。每个主件可以有 0 个、 1 个或 2 个附件。附件不再有从属于自己的附件。
王强想买的东西很多，为了不超出预算，他把每件物品规定了一个重要度，分为 5 等：用整数 1 ~ 5 表示，第 5 等最重要。
他还从因特网上查到了每件物品的价格（都是 10 元的整数倍）。他希望在不超过 N 元（可以等于 N 元）的前提下，使每件物品的价格与重要度的乘积的总和最大。
设第 j 件物品的价格为 v[j] ，重要度为 w[j] ，共选中了 k 件物品，编号依次为 j 1 ， j 2 ，……， j k ，则所求的总和为：
v[j 1 ]*w[j 1 ]+v[j 2 ]*w[j 2 ]+ … +v[j k ]*w[j k ] 。（其中 * 为乘号）
请你帮助王强设计一个满足要求的购物单。

输入描述：
输入的第 1 行，为两个正整数，用一个空格隔开：N m
（其中 N （ <32000 ）表示总钱数， m （ <60 ）为希望购买物品的个数。）
从第 2 行到第 m+1 行，第 j 行给出了编号为 j-1 的物品的基本数据，每行有 3 个非负整数 v p q
（其中 v 表示该物品的价格（ v<10000 ）， p 表示该物品的重要度（ 1 ~ 5 ）， q 表示该物品是主件还是附件。如果 q=0 ，表示该物品为主件，如果 q>0 ，表示该物品为附件， q 是所属主件的编号）

输出描述：
 输出文件只有一个正整数，为不超过总钱数的物品的价格与重要度乘积的总和的最大值（ <200000 ）。

示例1
输入：
1000 5
800 2 0
400 5 1
300 5 1
400 3 0
500 2 0

输出：
2200*/
import java.util.Scanner;

/**
 *
 * @author: Jerry Cheng
 * Date: 2021/12/1 11:36
 */

public class HJ16_购物单_01背包_二维数组 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();    // 总钱数
        int m = scanner.nextInt();    // 购买物品个数或物品id
        int[][] dp=new int[m+1][N+1];
        // 分组，0为主件，1为附件1，2为附件2
        int[][] price=new int[60][3];    // 物品价格
        int[][] value=new int[60][3];    // 物品价值
        for(int i=1;i<=m;i++){
            int p=scanner.nextInt();
            int v=scanner.nextInt();
            int q=scanner.nextInt();
            if(q==0){
                price[i][0]=p;
                value[i][0]=p*v;
            }
            //注意q为主件id对应的附件，price[q][1]为0,则默认选主件q对应的附件1
            else if(price[q][1]==0){
                price[q][1]=p;
                value[q][1]=p*v;
            }
            //如果附件1已经有了，则作为附件2
            else{
                price[q][2]=p;
                value[q][2]=p*v;
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=0;j<=N;j++){
                //默认不选当前物品
                dp[i][j]=dp[i-1][j];
                if(price[i][0]==0) continue;
                //主件的情况
                if(j>=price[i][0]){
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-price[i][0]]+value[i][0]);
                }
                //主件和附件1的情况
                if(price[i][1]!=0&&j>=price[i][0]+price[i][1]){
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-price[i][0]-price[i][1]]+value[i][0]+value[i][1]);
                }
                //主件和附件2的情况
                if(price[i][2]!=0&&j>=price[i][0]+price[i][2]){
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-price[i][0]-price[i][2]]+value[i][0]+value[i][2]);
                }
                //主件和两个附件的情况
                if(price[i][1]!=0&&price[i][2]!=0&&j>=price[i][0]+price[i][1]+price[i][2]){
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-price[i][0]-price[i][1]-price[i][2]]+value[i][0]+value[i][1]+value[i][2]);
                }
            }
        }
        System.out.println(dp[m][N]);
    }
}
