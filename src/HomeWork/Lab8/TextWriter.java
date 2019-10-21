package com.javase.oop.exercs.Lab8;

import java.io.*;

public class TextWriter {
    void textWriter(File file, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        try (BufferedWriter bw = new BufferedWriter(fileWriter)){
            bw.write(text);
        }
    }

    void addNameOnFile(File file) throws IOException{
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append("\nIlya Kirpichny");
        fileWriter.flush();
    }

    void copyTextToNewFile(File file, File newFile) throws IOException{
        try {
            FileReader fileReader = new FileReader(file);
            FileWriter newFileWriter = new FileWriter(newFile);
            int c;
            while ((c = fileReader.read()) != -1){
                newFileWriter.write((char)c);
                newFileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TextWriter textWriter = new TextWriter();
        textWriter.textWriter(new File(".\\out.txt"),                   //любой путь сюда
                "This is\n" + "A file\n" + "Written\n" + "On Java\n");
        textWriter.addNameOnFile(new File(".\\out.txt"));               //любой путь сюда
        textWriter.copyTextToNewFile(new File(".\\out.txt"), new File(".\\newout.txt"));
    }
}
