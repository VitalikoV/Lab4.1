package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileParser fp = new FileParser();
        fp.generateCSVFile("test without any collocation", "without_collocation");
        String data = fp.readCSVFile("without_collocation.txt");
        StringController controller = new StringController();
        System.out.println(controller.IfStringContainsWhileLetters(data));

        fp.generateCSVFile("test with collocations such as: aa bb cc", "with_collocation");
        String whileData = fp.readCSVFile("with_collocation.txt");
        System.out.println(controller.IfStringContainsWhileLetters(whileData));
    }
}
