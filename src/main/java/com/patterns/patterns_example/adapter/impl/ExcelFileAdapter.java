package com.patterns.patterns_example.adapter.impl;

import com.patterns.patterns_example.adapter.model.Person;

import java.io.InputStream;
import java.util.List;

public class ExcelFileAdapter implements InputFile {

    @Override
    public List<Person> readFile(InputStream inputStream) {
        // Implement logic to read Excel file and convert to List<Person>
        // For demonstration purposes, we will return a static list of Person objects.

        // This is a placeholder implementation
        return List.of(new Person("John", "Doe", 30));
    }
}
