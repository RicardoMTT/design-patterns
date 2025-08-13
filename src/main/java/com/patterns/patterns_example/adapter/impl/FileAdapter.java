package com.patterns.patterns_example.adapter.impl;

import com.patterns.patterns_example.adapter.model.Person;

import java.io.InputStream;
import java.util.List;

public class FileAdapter {

    private InputFile inputFile;

    public FileAdapter(InputFile inputFile) {
        this.inputFile = inputFile;
    }

    public List<Person> readFile(InputStream inputStream) {
        return inputFile.readFile(inputStream);
    }
}
