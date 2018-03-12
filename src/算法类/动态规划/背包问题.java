package 算法类.动态规划;

/*
在N件物品取出若干件放在容量为W的背包里，每件物品的体积为W1，W2……Wn（Wi为整数），
与之相对应的价值为P1,P2……Pn（Pi为整数）。求背包能够容纳的最大价值。
 */
public class 背包问题 {

    private static int maxValue(int w, int[] shade, int[] value) {
        if (shade==null||value==null|| w<=0 ||shade.length!=value.length)
              return -1;
        //db[5][10]表示,前5个物体放入容量为10的背包的最大价值；即最优子结构
        //db[i][w]表示,前i个物体放入容量为w的背包的最大价值；
        // 后一个物体放进去：db[i][w]=db[i-1][w]+db[i][w]
        // 后一个物体不放进去：db[i][w]=db[i-1][w]+db[i][w]
        //db[i][w]=max{db[i-1][w-shade[i]]+value[i] , db[i-1][w]}
        int db[][] = new int[shade.length + 1][value.length + 1];

        for (int i = 1; i < shade.length + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                //当物品为i件重量为j时，如果第i件的重量(w[i-1])小于重量j时，c[i][j]为下列两种情况之一：
                //(1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的值
                //(2)物品i放入背包中，则背包剩余重量为j-w[i-1],所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值

            }
        }


        return -1;
    }



    public static void main(String[] args) {
        int w = 10;
        int[] shade = new int[]{2,3,4,5,3};
        int[] value = new int[]{2,3,4,5,3};
        System.out.println(maxValue(w,shade,value));
    }


}
