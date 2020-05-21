package br.com.cesar.replacecharacters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestReplacement {

    @Test
    public void textReplacement() {
        String phrase = "User is not allowed";
        String result = Util.replaceWhiteSpaces(phrase, "&32");
        assertEquals("User&32is&32not&32allowed", result);
    }

    @Test
    public void textReplacementSpaceInTheBeginning() {
        String phrase = " User is not allowed";
        String result = Util.replaceWhiteSpaces(phrase, "&32");
        assertEquals("User&32is&32not&32allowed", result);
    }

    @Test
    public void textReplacementSpaceInTheEnd() {
        String phrase = "User is not allowed ";
        String result = Util.replaceWhiteSpaces(phrase, "&32");
        assertEquals("User&32is&32not&32allowed", result);
    }

    @Test
    public void textReplacementInTheBeginningAndInTheEnd() {
        String phrase = " User is not allowed ";
        String result = Util.replaceWhiteSpaces(phrase, "&32");
        assertEquals("User&32is&32not&32allowed", result);
    }

}