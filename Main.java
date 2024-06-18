package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        검은고양이 a = new 검은고양이();
        a.숨쉬다();
        a.울다();

        흰고양이 b = new 흰고양이();
        a.숨쉬다();
        a.울다();

    }
}

class 고양이 {
    void 숨쉬다() {
    }

    void 울다() {
    }

    void 뛰다() {
    }
    
}

class 검은고양이 extends 고양이 { //메서드는 총 4개 (1개 x)

    void 미래예측() {
    }
}

class 흰고양이 extends 고양이 {


    void 목숨추가() {
    }
}

class 회색고양이 extends 고양이 {


    void 때리기() {
    }
}