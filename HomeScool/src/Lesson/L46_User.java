package Lesson;

import java.io.Serializable;

public class L46_User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int lifeLevel;
	static int staticField;
	L46_Sword sword;
//	transient L46_Sword sword; //Не сериализуемое
}
