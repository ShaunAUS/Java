package com.example.post.entity;

import java.util.Stack;

public class StackPractice {

    public static Stack back= new Stack();
    public static Stack forward= new Stack();

    public static void printStatus(){
        System.out.println("back:"+back);
        System.out.println("forward:"+forward);
        System.out.println("현재화면'"+back.peek()+"'입니다.");
        System.out.println();

    }

    public static void goURL(String url){

        //back 스택에 넣기
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }

    public static void goForward(){

        if(!forward.empty())
            back.push(forward.pop());
    }

    public static void goBack(){

        if(!forward.empty())
            forward.push(back.pop());
    }

    public static void main(String[] args) {
        goURL("1. 애플");
        goURL("2. 맥북");
        goURL("3. 사고싶다");

        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른후 =");
        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른후 =");
        printStatus();

        goForward();
        System.out.println("= '앞으로' 버튼을 누른후 =");
        printStatus();



    }



}
