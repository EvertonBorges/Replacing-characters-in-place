package br.com.cesar.replacecharacters;

class Util {

    static String replaceWhiteSpaces(String stringToReplace, String replaceByString) {
        return stringToReplace.trim().replaceAll(" ", replaceByString);
    }

}
