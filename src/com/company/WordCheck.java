package com.company;

public class WordCheck {

    String sentenceFirst;
    String wordMatch;


    public int checIfContains() {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {

            lastIndex = sentenceFirst.indexOf(wordMatch,lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += wordMatch.length();
            }
        }
        return count;
    }
}

