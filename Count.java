package sizeyunsuan;/Count

import java.util.Stack;
public class Count{
    int answer;
    public  Count (String[] args) {
        Stack<String> z = new Stack<String>();
        int num1,num2,d;
        for(int i=0;i<args.length;i++) {
            switch (args[i]){
                case"+":
                    num2 = Integer.valueOf(z.pop());
                    num1 = Integer.valueOf(z.pop());
                     d = num1+num2;
                    z.push(String.valueOf(d));
                    break;
                case"-":
                     num2 = Integer.valueOf(z.pop());
                     num1 = Integer.valueOf(z.pop());
                     d = num1-num2;
                    z.push(String.valueOf(d));
                    break;
                case"*":
                     num2 = Integer.valueOf(z.pop());
                     num1 = Integer.valueOf(z.pop());
                     d = num1*num2;
                    z.push(String.valueOf(d));
                    break;
                case"/":
                     num2 = Integer.valueOf(z.pop());
                     num1 = Integer.valueOf(z.pop());
                     d = num1/num2;
                    z.push(String.valueOf(d));
                    break;
                case"":
                case" ":
                    break;

                default:
                    z.push(args[i]);
                    break;
            }
        }
        while (z.empty() == false) {
            answer =  Integer.valueOf(z.pop());
        }
    }
}