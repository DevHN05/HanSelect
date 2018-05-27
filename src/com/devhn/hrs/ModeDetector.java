package com.devhn.hrs;

class ModeDetector {
    void changeModeTo(String mode) {
        ModePlayer mp = new ModePlayer();

        switch (mode) {
            case "섞기":
                Util.mode = "섞기";
                mp.play(Util.mode);
                break;
            case "뽑기":
                Util.mode = "뽑기";
                mp.play(Util.mode);
                break;
            default:
                System.out.println("Error: #00002 - 잘못된 키워드를 입력하셨습니다.");
                break;
        }
    }
}
