package com.java8.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Assignment6 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        StringBuilder result = new StringBuilder();
        
        Function<Map.Entry<String, String>,StringBuilder> function = entry ->
        result.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");

        for (Map.Entry<String, String> entry : map.entrySet()) {
        	function.apply(entry);
        }

        // Remove the trailing comma and space
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        String output = result.toString();
        System.out.println(output);
    }
}
