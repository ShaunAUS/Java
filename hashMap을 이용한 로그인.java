package com.example.FuckApi.controller;

import java.util.HashMap;
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        
        //hashMap 에 값넣어주기
        HashMap map =new HashMap();
        map.put("myid","1234");
        map.put("asdf","1111");
        map.put("hi","3211");

        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("id와 password 입력해주세요");
            System.out.println("id:");
            String id= sc.nextLine().trim();

            System.out.println("password:");
            String password= sc.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시입력 해주세요");
                continue;
            }else{
                if(!map.get(id).equals(password)){
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
                }else{
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }

            }
        }

    }
}
