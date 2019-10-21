package aufgabe.format;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class PersonUtils {

	public static void main(String[] args) {
		
		String[] arrayMitSilben = {"as", "we", "gh", "ob", "pe", "aqs", "nu", "az", "mi", "id", "je", "er", "ut", "tu"};
		
		String neuerName = generiereName(arrayMitSilben, 4);
		
		Person p1 = new Person(generiereName(arrayMitSilben, randomVor()), generiereName(arrayMitSilben, randomNach()), randomInt());
		Person p2 = new Person(generiereName(arrayMitSilben, randomVor()), generiereName(arrayMitSilben, randomNach()), randomInt());
		Person p3 = new Person(generiereName(arrayMitSilben, randomVor()), generiereName(arrayMitSilben, randomNach()), randomInt());
		Person p4 = new Person(generiereName(arrayMitSilben, randomVor()), generiereName(arrayMitSilben, randomNach()), randomInt());
		Person p5 = new Person(generiereName(arrayMitSilben, randomVor()), generiereName(arrayMitSilben, randomNach()), randomInt());
		Person p6 = new Person(generiereName(arrayMitSilben, randomVor()), generiereName(arrayMitSilben, randomNach()), randomInt());
		Person p7 = new Person(generiereName(arrayMitSilben, randomVor()), generiereName(arrayMitSilben, randomNach()), randomInt());
		Person p8 = new Person(generiereName(arrayMitSilben, randomVor()), generiereName(arrayMitSilben, randomNach()), randomInt());
		Person p9 = new Person(generiereName(arrayMitSilben, randomVor()), generiereName(arrayMitSilben, randomNach()), randomInt());
		Person p10 = new Person(generiereName(arrayMitSilben, randomVor()), generiereName(arrayMitSilben, randomNach()), randomInt());
		
		Person[] personArr = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
		
		printPersonen(personArr);
		
		System.out.println();
		Arrays.sort(personArr);
		
		printPersonen(personArr);
		
		System.out.println();
		
		Comparator<Person> persComp = new PersonComparator();
		Arrays.sort(personArr, persComp);
		
		printPersonen(personArr);
	}
	
	static void printPersonen(Person[] personen){
		System.out.format("| %4s | %11s | %11s | %12s |%n","Nr.", "Vorname", "Nachname", "Geburtsjahr");
		for (int i = 0; i < personen.length; i++) {
			System.out.format("| %4d | %11s | %11s | %12d |%n", (i+1), personen[i].getVorName(), personen[i].getNachname(), personen[i].getGeburtsjahr());
		}
	}
	
	static String generiereName(String[] str, int numb) {
		
		String newStr = "";
		String returnString = "";
		
		for (int j = 0; j < numb; j++) {
			int random = new Random().nextInt(str.length);
			returnString += newStr.concat((str[random]));
		}
		
		String st = returnString.substring(0, 1).toUpperCase();
		String end = returnString.substring(1);
		returnString = st + end;
		
		return returnString;
	}
	
	static int randomInt() {
		return new Random().nextInt((2019 - 1980)+1)+1980;
	}
	
	static int randomVor() {
		return new Random().nextInt(4-1) + 1;
	}
	
	static int randomNach() {
		return new Random().nextInt(4-1) + 1;
	}

	

}
