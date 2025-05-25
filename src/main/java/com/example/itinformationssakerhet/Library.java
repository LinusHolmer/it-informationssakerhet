package com.example.itinformationssakerhet;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class Library {

        List<String> memory = new ArrayList<>();

        @PostMapping
        public String addBook(@RequestBody String bookTitle) {
            memory.add(bookTitle);
            return "new book added: "+ bookTitle;

        }

        @GetMapping
        public List<String> getBooks() {
            return memory;
        }

        @GetMapping("/{index}")
        public String getBookById(@PathVariable int index) {
            return memory.get(index);
        }

        @PutMapping("/{index}")
        public String updateBook(@PathVariable int index, @RequestBody String bookTitle) {
            String oldTitle = memory.set(index, bookTitle);
            return "updated book: " + oldTitle +"to " + bookTitle;
        }

        @DeleteMapping("/{index}")
        public String deleteBook(@PathVariable int index) {
            return memory.remove(index);
        }


}
