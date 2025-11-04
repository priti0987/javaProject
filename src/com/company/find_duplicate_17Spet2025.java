package com.company;

import java.util.Locale;

class FindDuplicateWords {
    public static void main(String[] args) {
        String myString = "johny johny yes yes pappa no pappa telling lies pappa";

        // Convert string to lowercase
        String low_myString = myString.toLowerCase(Locale.ROOT);
        String words[] = low_myString.split(" ");

        System.out.println("Duplicate words in the string:");

        for (int i = 0; i < words.length; i++) {
            int count = 1;  // ✅ Reset count for each word

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";  // ✅ Mark duplicate
                }
            }

            // ✅ Use .equals() to compare with "0"
            if (count > 1 && !words[i].equals("0")) {
                System.out.println(words[i] + " → " + count + " times");
            }
        }
    }
}
