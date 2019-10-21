package com.javase.oop.exercs.Lab8;

import java.io.File;

public class DirContent {

    void dirContent(File dir){
        if (dir.isDirectory()){
            for (File item : dir.listFiles()) {
                if (item.isDirectory()){
                    System.out.println("d: " + item.getName() + ":");
                } else System.out.println(item.getName());
                dirContent(item);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirContent dirContent = new DirContent();
        dirContent.dirContent(new File("C:\\Users\\Ilia\\Downloads\\FileDemo"));
    }
}
