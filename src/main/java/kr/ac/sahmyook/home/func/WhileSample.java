package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {
    public void printUniCode(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        char a = sc.next().charAt(0);
        while (a != '0') {
            System.out.format("0x%04X%n", (int)a);
            System.out.print("문자를 입력하세요 : ");
            a = sc.next().charAt(0);
        }


    }
    public void sum1To100(){
        System.out.println("sum1To100 출력됨");

    }
    public void numberGame(){
        System.out.println("numberGame 출력됨");

    }
    public void countCharacter(){
        System.out.println("countCharacter 출력됨");

    }
    public void countInChar(){
        System.out.println("countInChar 출력됨");

    }
}
