package sizeyunsuan;/ProduceProblem

import java.util.Random;

public class ProduceProblem {
    public int ProduceProblem () {
            String s = "";
            Random shu = new Random();//每个运算式的随机数
            int count = 1; //记录符号；
            char[] operator = new char[]{'+', '-', '*', '/'};
            int m = 2 + (int) (Math.random() * 6); //每个运算式数目的个数
                for (int j = 0; j < m; j++) {
                    int num = shu.nextInt(10);
                    s = s +" "+ num;
                    if (count < m) {
                        int c = shu.nextInt(4);
                        s = s +" "+ operator[c];
                        count++;
                    }
                }
                String [] str = s.split(" ");
                System.out.println(s + "=");
                Translate t = new Translate(str);
                return t.flag;
    }
}