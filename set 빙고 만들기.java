package com.example.FuckApi.controller;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        //hashSet 생성
        Set set= new HashSet();
        int[][] board= new int[5][5];

        //랜덤 숫자를 넣어주고
        for(int i=0; set.size()<25; i++){
            set.add((int)(Math.random()*50)+1+"";

        }
        //iterator로 set을 하나씩 꺼내서 반복해준다
         Iterator it =set.iterator();

        for(int i =0; i<board.length;i++){
            for(int j =0; j<board[i].length;i++){
                //next() 반환타입은 0bject
                board[i][j]=Integer.parseInt((String)it.next();
                System.out.println((board[i][j]<10?"  ":" ")+board[i][j];
            }
            System.out.println();
        }
    }
}
