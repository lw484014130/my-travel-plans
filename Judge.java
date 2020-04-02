package sizeyunsuan;/Judge

import java.util.Scanner;

public class Judge {
    public int A(int answer) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("请输入你的答案：");
        int flag=0;
        int n = scanner.nextInt();
        if( n == answer) {
            System.out.println("正确！");
            flag = 1;
        }
        else {
            System.out.println("错误，正确答案是:"+answer);

        }
        return flag;
    }

    public Judge() {

    }
}