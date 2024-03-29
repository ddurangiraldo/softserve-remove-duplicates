package com.softserve.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesServiceTest {

    private RemoveDuplicatesService service = new RemoveDuplicatesService();

    @Test
    public void test_nullString() {
        Assertions.assertNull(service.removeDuplicates(null));
    }

    @Test
    public void test_emptyString() {
        Assertions.assertEquals("", service.removeDuplicates(""));
    }

    @Test
    public void test_sortedString() {
        Assertions.assertEquals("ABCD123", service.removeDuplicates("AABBCCD112233"));
    }

    @Test
    public void test_unsortedString() {
        Assertions.assertEquals("GA321BHPTSIUONV0", service.removeDuplicates("GGAAA3321GGBGHAPPGTSIUONGV0"));
    }
}
