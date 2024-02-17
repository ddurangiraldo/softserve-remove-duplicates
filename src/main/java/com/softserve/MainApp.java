package com.softserve;

import com.softserve.service.RemoveDuplicatesService;

public class MainApp {

    private static final RemoveDuplicatesService removeDuplicatesService = new RemoveDuplicatesService();

    public static void main(String[] args) {
        System.out.println(removeDuplicatesService.removeDuplicates("AABBCCD112233"));
    }
}
