package com.cyzicus;

import com.cyzicus.observer.BinaryObserver;
import com.cyzicus.observer.HexaObserver;
import com.cyzicus.observer.OctalObserver;
import com.cyzicus.subject.Subject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {

		SpringApplication.run(ObserverApplication.class, args);
		start();

	}

	private static void start() {
		Subject subject = new Subject();
		HexaObserver hexaObserver = new HexaObserver(subject);
		BinaryObserver binaryObserver = new BinaryObserver(subject);
		OctalObserver octalObserver = new OctalObserver(subject);

		subject.setState(15);
		subject.setState(11);
	}
}
