package com.patterns.patterns_example;

import com.patterns.patterns_example.adapter.impl.ExcelFileAdapter;
import com.patterns.patterns_example.adapter.impl.FileAdapter;
import com.patterns.patterns_example.adapter.impl.InputFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsExampleApplication {

	public static void main(String[] args) {

		/*
		* Adapter Pattern: Permite que dos interfaces incompatibles trabajen juntas.
		* Facade Pattern: Proporciona una interfaz simplificada a un conjunto de interfaces en un subsistema.
		* Factory Pattern: Permite crear objetos sin especificar la clase exacta del objeto que se creará.
		* */

		// Ejemplo de uso del patrón Adapter con ExcelFileAdapter
		InputFile excelFileAdapter = new ExcelFileAdapter();
		FileAdapter fileAdapter = new FileAdapter(excelFileAdapter);
		fileAdapter.readFile(null); // Aquí se debería pasar un InputStream real

		SpringApplication.run(PatternsExampleApplication.class, args);
	}

}
