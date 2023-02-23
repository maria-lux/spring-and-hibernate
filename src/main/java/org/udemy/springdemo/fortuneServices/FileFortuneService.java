package org.udemy.springdemo.fortuneServices;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@Component("fileFortuneService")
public class FileFortuneService implements FortuneService {

    private ArrayList<String> fortunes = new ArrayList<>();
    private String path = "src/main/resources/fortunes.txt";

    @PostConstruct
    private void getFortunesFromFile() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while (reader.ready()) {
                fortunes.add(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getFortune() {
        getFortunesFromFile();
        Random random = new Random();
        int index = random.nextInt(fortunes.size());

        return "FileFortuneService: " + fortunes.get(index);
    }


}
