package com.luv2code.springdemo.fortuneservices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class FileFortuneService implements FortuneService {
	
	private String[] fileFortunes;
	
	@PostConstruct
	public void getFortunesFromFile() {
		System.out.println("Initializing fortunes...");
		try {
			FileReader fileReader = new FileReader("./src/fortunes.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			List<String> lines = new ArrayList<String>();
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				lines.add(line);
			}
			bufferedReader.close();
			fileFortunes = lines.toArray(new String[lines.size()]);
			System.out.println("Successful initialization.");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public String getDailyFortune() {
		Random random = new Random();
		return fileFortunes[random.nextInt(fileFortunes.length)];
	}


}
