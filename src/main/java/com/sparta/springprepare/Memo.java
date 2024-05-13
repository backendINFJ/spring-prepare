package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor

public class Memo {
    private final String username;
    private String contents;

    class main {
        public static void main(String[] args) {

            Memo memo = new Memo("Robvert");
            System.out.println(memo.getUsername());
        }
    }
}