package sizeyunsuan;
import java.util.Stack;

public class Translate extends Judge{
    int flag;
    public Translate (String[] args) {
        Stack<String> z = new Stack<String>();
        String jieguo = "";
        String t = "";
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "(":
                    z.push(args[i]);
                    break;
                case "+":
                case "-":
                    while(z.empty() != true) {
                        t = z.pop();
                        if (t.equals("(")) {
                            z.push(t);
                            break;
                        }
                        jieguo = jieguo + t + " ";
                    }
                    z.push(args[i]);
                    break;
                case "*":
                case "/":
                    while(z.empty() != true) {
                        t = z.pop();
                        if (t.equals("+") || t.equals("-") || t.equals("(")) {
                            z.push(t);
                            break;
                        }
                        jieguo = jieguo + t + " ";
                    }
                    z.push(args[i]);
                    break;
                case ")":
                    while (z.empty()== false) {
                        t = z.pop();
                        if (t.equals("(")) {
                            break;
                        } else {
                            jieguo = jieguo + t + " ";
                        }
                    }
                    break;
                case" ":
                    break;

                default:
                    jieguo = jieguo + args[i] + " ";
                    break;
            }

        }

        while (z.empty() == false) {
            jieguo = jieguo + z.pop() + " ";
        }
        String [] str = jieguo.split(" ");
        Count py = new Count(str);
        int answer = py.answer;
        flag = A(answer);
    }

    public Translate() {

    }
}