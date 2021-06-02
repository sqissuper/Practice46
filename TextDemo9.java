package test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * ClassName:TextDemo9
 * Package:test
 * Description:
 *
 * @Author:HP
 * @date:2021/5/28 21:54
 */
public class TextDemo9 {
    //括号序列
//    public boolean isValid (String s) {
//        int n = s.length();
//        if(n % 2 != 0) return false;
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0; i < n; i++){
//            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
//                stack.push(s.charAt(i));
//            }else if(stack.empty()) {
//                return false;
//            } else if ((s.charAt(i) == ']' && stack.peek() == '[') || (s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == '}' && stack.peek() == '{')){
//                stack.pop();
//            } else {
//                return false;
//            }
//        }
//        return stack.isEmpty();
//    }

    //矩阵的最小路径和
//    public int minPathSum (int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int[][] dp = new int[m][n];
//        dp[0][0] = matrix[0][0];
//        for(int i = 1; i < m; i++) {
//            dp[i][0] = dp[i - 1][0] + matrix[i][0];
//        }
//        for(int i = 1; i < n; i++) {
//            dp[0][i] = dp[0][i - 1] + matrix[0][i];
//        }
//        for(int i = 1;i < m; i++) {
//            for(int j = 1; j < n; j++) {
//                dp[i][j] = Math.min(dp[i - 1][j],dp[i][j - 1]) + matrix[i][j];
//            }
//        }
//        return dp[m - 1][n - 1];
//    }

    //大数加法
//    public static String solve (String s, String t) {
//        int carry = 0;
//        int ss = s.length() - 1;
//        int tt = t.length() - 1;
//        StringBuilder sb  = new StringBuilder();
//        while(ss >= 0 || tt >= 0) {
//            int sum = 0;
//            if(ss >= 0) {
//                sum += s.charAt(ss) - '0';
//                ss--;
//            }
//            if(tt >= 0) {
//                sum += t.charAt(tt) - '0';
//                tt--;
//            }
//            sum += carry;
//            sb.append(sum % 10);
//            carry = sum / 10;
//        }
//        if(carry >= 1) {
//            sb.append(carry);
//        }
//        return sb.reverse().toString();
//    }
    public static void main(String[] args) {
//        String s1 = "9";
//        String s2 = "99999999999999999999999999999999999999999999999999999999999994";
//        System.out.println(solve(s1, s2));

        //mkdir
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            String[] ss = new String[n];
//            for(int i = 0; i < n; i++) {
//                ss[i] = sc.next();
//            }
//            Arrays.sort(ss);
//            List<String> list = new ArrayList<>();
//            for(int i = 1; i < n; i++) {
//                if(!ss[i].startsWith(ss[i - 1] + "/")) list.add(ss[i - 1]);
//            }
//            list.add(ss[n - 1]);
//            for(String s : list) {
//                System.out.println("mkdir -p " + s);
//            }
//            System.out.println();
//        }


        //数据库连接池
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            int max = 0;
//            HashMap<String,String> map = new HashMap<>();
//            while(n != 0) {
//                String id = sc.next();
//                String op = sc.next();
//                if(map.containsKey(id)) {
//                    if(map.get(id).equals("connect")) {
//                        map.remove(id);
//                    }
//                } else {
//                    map.put(id,op);
//                }
//                max = Math.max(map.size(),max);
//                n--;
//            }
//            System.out.println(max);
//        }
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int m = sc.nextInt();
//            int n = sc.nextInt();
//            int count = 0;
//            char[][] c = new char[m][n];
//            int px = 0,py = 0;
//            for(int i = 0; i < m; i ++) {
//                for(int j = 0; j < n; j++) {
//                    c[i][j] = sc.next().charAt(0);
//                    if(c[i][j] == '@') {
//                        px = i;
//                        py = j;
//                    }
//                }
//            }

//        }
    }

    //红与黑
//    public static void func(char[][] c,int m,int n,int px,int py,int[] num) {
//        if(px < 0 || py < 0 || px >= m || py >= n || c[px][py] == '#') return;
//        num[0]++;
//        c[px][py] = '#';
//        func(c,m,n,px - 1,py,num);
//        func(c,m,n,px + 1,py,num);
//        func(c,m,n,px,py - 1,num);
//        func(c,m,n,px,py + 1,num);
//    }
}
