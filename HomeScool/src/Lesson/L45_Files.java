package Lesson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class L45_Files {
	public static void main(String[] args) throws IOException {
		File file = new File("temp.txt");
		
		
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("exists");
		}
		
		if (file.isDirectory()) {
			System.out.println("dir");
		}
		
		if (file.isFile()) {
			System.out.println("file");
		}
		
		//Редактируем файл
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("Str1\n"); //Редактируем файл
		fileWriter.write("Str2\n"); //Редактируем файл
//		fileWriter.flush(); 		//Закрываем редактирование
//		fileWriter.close();			//Закрываем редактирование
		
		//Читаем файл
		FileReader fileReader = new FileReader(file);
//		char[] chars = new char[20];
//		fileReader.read(chars);
//		System.out.println(chars);
		
//		Удобнее
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("Str3");
		bufferedWriter.newLine();     //Без \n , в отличии от вехнего метода
		bufferedWriter.write("Str4");
		bufferedWriter.flush();
		bufferedWriter.close();
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while (bufferedReader.ready()) {
			System.out.println(bufferedReader.readLine());
		}
	}
}
