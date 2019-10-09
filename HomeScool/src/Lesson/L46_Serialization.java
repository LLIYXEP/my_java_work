package Lesson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class L46_Serialization {
	public static void main(String[] args) throws Exception {
		L46_User user = new L46_User();
		user.lifeLevel = 55;
		user.staticField = 45;
		
		L46_Sword sword = new L46_Sword();
		sword.level = 5;
		user.sword = sword;
		
		FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(user);
		objectOutputStream.close();
		
		user.staticField = 35;
		
		FileInputStream fileInputStream = new FileInputStream("tempFile");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		L46_User newUser = (L46_User) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(newUser.lifeLevel);
		System.out.println(newUser.staticField);
		System.out.println(newUser.sword.level);
	}
}
