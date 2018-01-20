package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordCheckTest {
    @Test
    public void shouldReturnZero() {
        WordCheck wordCheck = new WordCheck();
        wordCheck.sentenceFirst = " ";
        wordCheck.wordMatch = "una paloma blanca";
        wordCheck.checIfContains();
        assertEquals(0, wordCheck.checIfContains());

    }

    @Test
    public void shouldReturnOne() {
        WordCheck wordCheck = new WordCheck();
        wordCheck.sentenceFirst = "una paloma blanca";
        wordCheck.wordMatch = "paloma";
        wordCheck.checIfContains();
        assertEquals(1, wordCheck.checIfContains());
    }

    @Test
    public void shouldReturnTwo() {
        WordCheck wordCheck = new WordCheck();
        wordCheck.sentenceFirst = "una paloma blanca paloma";
        wordCheck.wordMatch = "paloma";
        wordCheck.checIfContains();
        assertEquals(2, wordCheck.checIfContains());
    }
    @Test
    public void shouldReturnFive() {
        WordCheck wordCheck = new WordCheck();
        wordCheck.sentenceFirst = "una paloma blanca paloma paloma paloma paloma";
        wordCheck.wordMatch = "paloma";
        wordCheck.checIfContains();
        assertEquals(5, wordCheck.checIfContains());
    }
    @Test
    public void shouldReturnTwoIgnoringCaseSensivity() {
        WordCheck wordCheck = new WordCheck();
        wordCheck.sentenceFirst = "una paloma Paloma blanca";
        wordCheck.wordMatch = "paloma";
        wordCheck.checIfContains();
        assertEquals(2, wordCheck.checIfContains());
    }
}
