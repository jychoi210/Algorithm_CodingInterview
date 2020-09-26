//백준 #10799 쇠막대기
//https://www.acmicpc.net/problem/10799
///여러 개의 쇠막대기를 레이저로 절단하려고 한다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고, 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자른다. 쇠막대기와 레이저의 배치는 다음 조건을 만족한다.
//
//쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있다. - 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓는다.
//각 쇠막대기를 자르는 레이저는 적어도 하나 존재한다.
//레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
//아래 그림은 위 조건을 만족하는 예를 보여준다. 수평으로 그려진 굵은 실선은 쇠막대기이고, 점은 레이저의 위치, 수직으로 그려진 점선 화살표는 레이저의 발사 방향이다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_10799 {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stick = reader.readLine();
        int stickLen = stick.length();
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stickLen; i++) {
            if(stick.charAt(i)=='('){
                stack.push('(');
            }else{
                stack.pop();
                if(stick.charAt(i-1)=='('){
                    count += stack.size();
                }else{
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}