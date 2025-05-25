package com.example.itinformationssakerhet;

public class TextFormatter {
    public String formatTitle(String title) {
        if(title == null || title.isEmpty()){
            return title;
        }
        return title.substring(0,1).toUpperCase() + title.substring(1);
    }
}

