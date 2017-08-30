package fr.formation.maven;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class TestHello {

	public static void main(String[] args) {
		System.out.println("Hello !! ");
		
		TestHello hello = new TestHello();

        System.out.println(hello.readFile("/hello.txt"));

    }

    private String readFile(String fichier) {
        InputStream in = this.getClass().getResourceAsStream(fichier);
        String result = new BufferedReader(new InputStreamReader(in)).lines().collect(Collectors.joining("\n"));
        return result;
    }
}
