package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String geekTechKb;
	final int NUM = 0;
	String word = "Hello World!";
	geekTechKb = NUM + " " + word;
        System.out.println(geekTechKb);
	if (NUM < 0){
		System.out.println("Вы сохранили отрицательное число");
	}
	else if (NUM > 0){
		System.out.println("Вы сохранили положительное число");
	}
	else{
		System.out.println("Вы сохранили нуль");
	}
		Scanner in = new Scanner(System.in);
		System.out.println("Введите ваше имя: ");
		String name = in.nextLine();
		System.out.println("Привет, " + name);


    }
}

