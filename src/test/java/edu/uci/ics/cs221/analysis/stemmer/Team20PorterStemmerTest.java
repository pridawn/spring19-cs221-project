package edu.uci.ics.cs221.analysis.stemmer;

import edu.uci.ics.cs221.analysis.PorterStemmer;
import edu.uci.ics.cs221.analysis.Stemmer;
import org.junit.Test;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;
import static org.junit.Assert.assertEquals;

public class Team20PorterStemmerTest {
    public static String testStem(Stemmer stemmer, String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .map(token -> stemmer.stem(token))
                .collect(joining(" "));
    }


    @Test
    public void test_sentence() {
        /***
         Test a generic sentence with different types of words.
         ***/
        String original = "I was not surprised. Indeed, my only wonder was that he had not already been mixed up in this extraordinary case," +
                " which was the one topic of conversation through the length and breadth of England.";
        String expected = "I wa not surpris Indeed my onli wonder wa that he had not alreadi been mix up in thi extraordinari case " +
                "which wa the on topic of convers through the length and breadth of England";

        PorterStemmer porterStemmer = new PorterStemmer();
        assertEquals(expected, testStem(porterStemmer, original));
    }





}
