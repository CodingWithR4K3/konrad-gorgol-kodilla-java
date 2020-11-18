package com.kodilla.stream.beautifier;

public class BeautifierMain {

    public static void main(final String[] args) {

        final PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(("Nothing lasts."), textToBeautify -> new StringBuilder(textToBeautify).reverse().toString());
        poemBeautifier.beautify("If you could see yourselves as I see you. Toy soldiers in tin plate, beasts who howl for honor, standing as one.", (textToBeautify -> "ABC" + textToBeautify + "ABC"));
        poemBeautifier.beautify("For the Horde!", (textToBeautify -> "\uD83D\uDD25\uD83D\uDD25" + textToBeautify + "\uD83D\uDD25\uD83D\uDD25"));
        poemBeautifier.beautify("I have no time for games, yet I always seem to be in them.", String::toUpperCase);
        poemBeautifier.beautify("Stand with me, or fall before me.", String::toLowerCase);
    }
}