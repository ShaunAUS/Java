package com.example.FuckApi.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test5 {

    static HashMap phoneBook= new HashMap();

    static void addPhoneNo(String groupName, String name, String tel){
        addGroup(groupName);

        HashMap group=(HashMap)phoneBook.get(groupName); //우항은 키값을 호출해 value=(두번쨰 hashMap)을 가르킨다.
        group.put(tel,name);        //두번쨰 hashMap 키값=tel , 벨류값=name
    }

    //그룹 추가
    static void addGroup(String groupName){

        //첫번쨰 hashMap 에 키값에 해당하는 데이터 있나 확인
        if(!phoneBook.containsKey(groupName))

            // 없으면 groupName을 키(key)값으로  vlaue는 새로운 hashMap을 하나 더넣는다.
            phoneBook.put(groupName,new HashMap());
    }
    static void addPhoneNo(String name,String tel){
        addPhoneNo("기타",name,tel);
    }

    //전화번호부 전체 출력
    static void printList(){

        // (첫)hashMap 키와 벨류값합쳐서 set타입에 넣어서 iterator로 하나씩 출력
        Set set=phoneBook.entrySet();
        Iterator it =set.iterator();

        while(it.hasNext()){

            //iterator로 하나씩 출력
            Map.Entry e=(Map.Entry)it.next();

            //(첫)hashMap의 value 값= 두번쨰(hashMaP) 호출해서 키+벨류값 묶어서출력
            Set subSet= ((HashMap)e.getValue()).entrySet();

            //(둘)hashMap iterator 로 출력
            Iterator subIt= subSet.iterator();

            System.out.println("*"+e.getKey()+"["+subSet.size()+"]");

            while(subIt.hasNext()){
                Map.Entry subE=(Map.Entry)subIt.next();
                //(둘)hashMap 의 key값
                String telNo = (String)subE.getKey();
                ////(둘)hashMap 의 value값
                String name= (String)subE.getValue();
                System.out.println(name+" "+telNo);
            }
            System.out.println();
        }
        printList();
    }

    public static void main(String[] args) {

        addPhoneNo("친구","김애플","010-1234-5678");
        addPhoneNo("친구","010-5734-1243");
        addPhoneNo("선배","김삼성","010-1234-5123");

        printList();

    }//main 끝
}
