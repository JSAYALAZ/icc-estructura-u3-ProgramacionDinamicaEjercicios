package Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAll(new StringBuilder(), 0, 0, n, result);
        return result;
    }

    private void generateAll(StringBuilder current, int open, int close, int max, List<String> result) {
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }

        if (open < max) {
            current.append('(');
            generateAll(current, open + 1, close, max, result);
            current.deleteCharAt(current.length() - 1);
        }
        if (close < open) {
            current.append(')');
            generateAll(current, open, close + 1, max, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        EjercicioDos ed = new EjercicioDos();
        System.out.println(ed.generateParenthesis(1)); // Output: ["()"]
        System.out.println(ed.generateParenthesis(3)); // Output: ["((()))","(()())","(())()","()(())","()()()"]
    }
}
