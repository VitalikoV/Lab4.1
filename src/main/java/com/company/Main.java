package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileParser.generateCSVFile("test without any collocation", "without_collocation");
        String data = FileParser.readCSVFile("without_collocation.txt");
        System.out.println(StringController.IfStringContainsWhileLetters(data));

        FileParser.generateCSVFile("test with collocations such as: aa bb cc", "with_collocation");
        String whileData = FileParser.readCSVFile("with_collocation.txt");
        System.out.println(StringController.IfStringContainsWhileLetters(whileData));
    }
}
