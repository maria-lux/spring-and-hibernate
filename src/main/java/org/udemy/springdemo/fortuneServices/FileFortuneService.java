package org.udemy.springdemo.fortuneServices;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@Component("fileFortuneService")
public class FileFortuneService implements FortuneService {

    private ArrayList<String> getFortunesFromFile(String path) {

        ArrayList<String> result = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while (reader.ready()) {
                result.add(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public String getFortune() {
        ArrayList<String> fortunes = getFortunesFromFile("src/main/resources/fortunes.txt");
        Random random = new Random();
        int index = random.nextInt(fortunes.size());

        return fortunes.get(index);
    }


}
