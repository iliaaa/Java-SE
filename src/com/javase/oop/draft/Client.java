package com.javase.oop.draft;

import java.util.Random;

public class Client {
    /*
    - polymorph method
    - anonymous class
     */
    static int clientCashInfo(Messangers messanger){
        return messanger.cashInfo();
    }

    public static void main(String[] args) {
//        Messangers messanger;
//
//         messanger = new Telegram();
//
//         messanger.init("send nudes");
//
//         messanger = new WatsApp();
//         messanger.init("hi mom");
//
//         messanger = new Wiber();
//         messanger.init("hello");
//        System.out.println(simulation().cashInfo());

        Messangers simulationMessager = simulation();

        int i = clientCashInfo(simulationMessager);

        System.out.println("Client cash info - " + i);

        System.out.println("Vers2: Client cash info - " + clientCashInfo(simulation()));

        Anon anon = new Anon();

        new Messangers(){
            @Override
            public void init(String initMessage) {
                System.out.println("Anonymous class: " + initMessage);
            }

            @Override
            public int cashInfo() {
                return 0;
            }
        }.init("LOLLL ");

    }

    static Messangers simulation (){
        Messangers messanger;

        int rnd = new Random().nextInt(3);

        switch (rnd){
            case 0:
                messanger = new Telegram();
                break;
            case 1:
                messanger = new WatsApp();
                break;
            case 2:
                messanger = new Wiber();
                break;
            default:
                System.out.println("WRONG !!!");
                messanger = null;
        }

        return messanger;
    }
}
