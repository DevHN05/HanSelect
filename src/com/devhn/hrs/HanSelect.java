package com.devhn.hrs;

import java.util.Scanner;

public class HanSelect {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        ModeDetector md = new ModeDetector();
        Scanner scanner = new Scanner(System.in);

        System.out.println("불규칙 추첨기 - DevHN");
        System.out.println("아래의 키워드 중 하나를 입력해 주세요.");
        System.out.println("섞기 / 뽑기");

        String input = scanner.nextLine();
        md.changeModeTo(input);

        scanner.close();
    }
}
