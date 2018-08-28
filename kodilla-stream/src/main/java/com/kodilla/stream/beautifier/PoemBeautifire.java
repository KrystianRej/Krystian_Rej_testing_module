package com.kodilla.stream.beautifier;

public class PoemBeautifire {
    public void beautify(String stringToDecorate, PoemDecorator poemDecorator)
    {
        String decoratedString = poemDecorator.decorate(stringToDecorate);
        System.out.println(decoratedString);
    }
}
