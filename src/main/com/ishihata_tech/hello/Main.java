package com.ishihata_tech.hello;

import java.io.IOException;
import java.util.Random;

public class Main {

    private static String[] JANKEN_TEXT = {"GU", "CHOKI", "PA"};

    public static void main(String[] args) {
	    janken();
    }

    private static void janken(){
        System.out.print("Janken 0=Gu, 1=Choki, 2=Pa : ");
        int jibun;
        try {
            jibun = System.in.read() - '0';
        } catch (IOException e){
            return;
        }
        if (jibun < 0 || jibun > 2) return;

        Random random = new Random();
        int aite = random.nextInt(3);

        System.out.printf("YOU  : %s\nAITE : %s\n", JANKEN_TEXT[jibun], JANKEN_TEXT[aite]);

        switch(janken_calc(jibun, aite)){
            case 0:
                System.out.println("Aiko!");
                break;
            case 1:
                System.out.println("You win!");
                break;
            default:
                System.out.println("You lose!");
        }
    }

    /**
     * じゃんけんの結果を返す
     * @param jibun 自分の手
     * @param aite 相手の手
     * @return 結果（0=あいこ, 1=勝利, 2=敗北）
     */
    static int janken_calc(int jibun, int aite){
        int sa = aite - jibun;
        if (sa < 0) sa += 3;
        return sa;
    }
}
