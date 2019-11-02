package com.example.calculator2;

import java.math.BigDecimal;//Java在java.math包中提供的API类BigDecimal，用来对超过16位有效位的数进行精确的运算。
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class main {
    public static BigDecimal calculator(List list){
        Deque<BigDecimal> deque = new ArrayDeque<>();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object o = it.next();
                if (o.getClass() == BigDecimal.class) {
                    deque.addFirst((BigDecimal) o);
                } else if (o.getClass() == Character.class) {

                    BigDecimal first = deque.removeFirst();
                    BigDecimal second = deque.remove();
                    BigDecimal out = null;
                    if ((Character) o == '+') {
                        out = second.add(first);
                        deque.addFirst(out);
                    } else if ((Character) o == '-') {
                        out = second.subtract(first);
                        deque.addFirst(out);
                    } else if ((Character) o == '*') {
                        out = second.multiply(first);
                        deque.addFirst(out);
                    } else if ((Character) o == '/') {
                        Double out2 = second.doubleValue() / first.doubleValue();
                        String out3 = out2.toString();
                        deque.addFirst(new BigDecimal(out3));
                    }

                }
            }
            BigDecimal comeOut = deque.removeFirst();
            return comeOut;
        } catch (Exception e) {
            e.printStackTrace();
            BigDecimal error = new BigDecimal("error");
            return error;
        }
    }


    public static List transferToBehind(char[] mid){
        Deque<Character> deque = new ArrayDeque<>();
        List list = new ArrayList();

        int len = mid.length;
        int i,k=0;

        for (i = 0; i < len; i++){
            if ( (judgeSymbol(mid[i]) && ((i > 0 && mid[i-1] != ')') || i == 0) ) || mid[i] == ')'
                    && !lastBracket(mid,i) && k != i){
                if (mid[i] == '-' && (i == 0 || judgeSymbol(mid[i-1]) || judgeBrackets(mid[i-1]))){
                    continue;
                }

                String number = new String(mid).substring(k, i);

                if (number.contains(")")){
                    while ( deque.peekFirst() != '('){
                        list.add(deque.removeFirst());
                    }
                    deque.removeFirst();
                    continue;
                }

                BigDecimal num = new BigDecimal(number);
                list.add(num);
                if (judgeSymbol(mid[i]) )
                    k = i + 1;
                else if (mid[i] == ')'){
                    k = i + 2;
                }
            }

            if (judgeNumber(mid[i]) && lastNumber(mid,i)){
                String number = new String(mid).substring(i);
                list.add(new BigDecimal(number));
                break;
            }

            if (mid[i] == '('){
                k++;
            }

            if (judgeSymbol(mid[i]) || judgeBrackets(mid[i]) ){
                if (mid[i] == '*' || mid[i] == '/'){
                    if (!deque.isEmpty() && (deque.peekFirst() == '*' || deque.peekFirst() == '/')){
                        while (!deque.isEmpty() && deque.peekFirst() != '(' && deque.peekFirst() != '+'
                                && deque.peekFirst() != '-'){
                            list.add(deque.remove());
                        }
                    }
                    deque.addFirst(mid[i]);
                }else if (mid[i] == '+' || mid[i] == '-'){
                    if (deque.isEmpty()){
                        deque.addFirst(mid[i]);
                    }else if (judgeSymbol(deque.peekFirst())){
                        while ( !deque.isEmpty() && deque.peekFirst() != '('){
                            list.add(deque.removeFirst());
                        }
                        deque.addFirst(mid[i]);
                    }else {
                        deque.addFirst(mid[i]);
                    }
                }else if (mid[i] == '('){
                    deque.addFirst(mid[i]);
                }else if (mid[i] == ')'){
                    while ( deque.peekFirst() != '('){
                        list.add(deque.removeFirst());
                    }
                    deque.removeFirst();
                }
            }else {
                continue;
            }
        }
        int m = 1;
        while ( !deque.isEmpty() && (deque.peekFirst() == '(' || deque.peekFirst() == ')')){
            deque.removeFirst();
            System.out.println("有" + m++ + "个括号不匹配");
        }
        if (!deque.isEmpty()) {
            list.add(deque.removeFirst());
        }
        return list;
    }


    public static boolean judgeSymbol(char word){
        if (word == '+' || word == '-' || word == '*' || word == '/' ){
            return true;
        }
        return false;
    }
    public static boolean judgeBrackets(char word){
        if (word == '(' || word == ')'){
            return true;
        }
        return false;
    }

    public static boolean judgeNumber(char word){
        if ( (word >= '0' && word <= '9' )|| word == '.'){
            return true;
        }
        return false;
    }

    public static boolean lastNumber(char[] mid,int i){
        String str = new String(mid);
        String rest = str.substring(i+1);
        if (rest.contains("*") || rest.contains("/") || rest.contains("+") ||rest.contains("-") ||rest.contains("(")
                || rest.contains(")") ){
            return false;
        }
        return true;
    }

    public static boolean lastBracket(char[] mid, int i){
        if (mid[i-1] != ')' || mid[i-2] == ')'){
            return false;
        }
        String rest = new String(mid).substring(i);
        if (rest.contains("0") || rest.contains("1") ||rest.contains("2") || rest.contains("3") || rest.contains("4") ||
                rest.contains("5") ||rest.contains("6") || rest.contains("7") || rest.contains("8") || rest.contains("9")){
            return false;
        }
        return true;
    }

    public static boolean judgeIllegal(char[] mid,int i){
        String rest = new String(mid).substring(i);
        if (!rest.contains("+") && !rest.contains("-") && !rest.contains("*") && !rest.contains("/") &&
                !rest.contains("(") && !rest.contains(")") && !rest.contains("0") && !rest.contains("1") &&
                !rest.contains("2") && !rest.contains("3") && !rest.contains("4") && !rest.contains("5") &&
                !rest.contains("6") && !rest.contains("7") && !rest.contains("8") && !rest.contains("9")){
            return true;
        }
        return false;
    }

    public static char[] cutString(char[] mid){
        for (int i = 0; i < mid.length; i++){
            if (!judgeBrackets(mid[i]) && !judgeSymbol(mid[i]) && !judgeNumber(mid[i])){
                System.out.println("出现非法字符！已为你自动消除");
                if (i == 0){
                    mid = Arrays.copyOfRange(mid,1,mid.length);
                    i--;
                }else if (judgeIllegal(mid,i)){
                    mid = Arrays.copyOfRange(mid,0,i);
                    break;
                }else {
                    char[] beyond = Arrays.copyOfRange(mid,0,i);
                    char[] behind = Arrays.copyOfRange(mid,i+1,mid.length);
                    String str1 = new String(beyond);
                    String str2 = new String(behind);
                    String temp = str1 + str2;
                    mid = temp.toCharArray();
                    i--;
                }
            }
        }
        return mid;
    }
}
