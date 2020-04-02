package sizeyunsuan;

import java.util.Scanner;

public class LwLxj {
    public static void main(String[] args) {
        System.out.println("请输入要生成的题目数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        for (int i = 1; i <= n; i++) {
            System.out.println("题目"+i+"：");
            ProduceProblem problem = new ProduceProblem();
            if(problem.ProduceProblem() == 1){
                count++;
            }
            }
        double zql = (double)count/n;
        System.out.println("完成"+n+"道题目，正确率为"+zql*100+"%");
        }
    }