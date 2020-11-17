package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String beautifyText, PoemDecorator poemDecorator) {

        String textAfterBeautify = poemDecorator.decorate(beautifyText);
        System.out.println("Text before: " + beautifyText + "  Text after: " + textAfterBeautify);
    }
}