package com.patterns.patterns_example.adapter.impl;

import com.patterns.patterns_example.adapter.model.Person;

import java.io.InputStream;
import java.util.List;

public interface InputFile {

    List<Person> readFile(InputStream inputStream);


}
