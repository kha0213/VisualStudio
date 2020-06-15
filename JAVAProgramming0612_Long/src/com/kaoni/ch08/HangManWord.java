package com.kaoni.ch08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * 
 * 
 *
 * desc :
 * 
 * @Company : KAONI
 * @author : 김영롱
 * @Date : 2020. 6. 12.
 * @Version : 1.0.0
 */
public class HangManWord {
	private final String TEXTFILE = "C:\\Long\\Today_I_Learned\\JAVAProgramming0612_Long\\src\\hangman/words.txt";
	private final int WORDCOUNT = 25142; // 총 단어 갯수

	public String randomWord() {
		System.out.println("☆☆☆랜덤 단어를 추출합니다.☆☆☆");
		Random random = new Random();

		BufferedReader bReader = null;

		try {
			bReader = new BufferedReader(new FileReader(TEXTFILE));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int ran = random.nextInt(WORDCOUNT); // 랜덤 번호 생성

		return readWord(bReader, ran);
	}

	private String readWord(BufferedReader bReader, int ran) {
		String word = null;
		try {
			while (ran > 0) {
				word = bReader.readLine();
				if(word == null) {
					break;
				}
				ran--;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return word; // ran번째 단어 반환.
	}
}
