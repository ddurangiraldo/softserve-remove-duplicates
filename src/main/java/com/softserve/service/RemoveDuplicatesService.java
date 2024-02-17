package com.softserve.service;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesService {

    public String removeDuplicates(String str) {
        if (str == null)
            return null;

        // using a Map to get immediate access to chars that have been processed
        Map<Character, Integer> processedChars = new HashMap<>();
        // using a StringBuilder to efficiently construct the final string
        StringBuilder strWithoutDuplicates = new StringBuilder();

        for (char c: str.toCharArray()) {
            // check if the char has not been processed before
            if (!processedChars.containsKey(c)) {
                // add an entry with the char that has not been processed before. The value is irrelevant
                processedChars.put(c, 1);
                // append the char to the resulting string
                strWithoutDuplicates.append(c);
            }
        }

        return strWithoutDuplicates.toString();
    }
}
