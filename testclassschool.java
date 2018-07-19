import mytest2.labtrainer;
import mytest2.myschool;
import mytest2.trainer;

public class testclassschool {
	public static void main(String[] args) {

		trainer tr = new trainer();
		tr.name = "surul";
		tr.salary = 15000;
		// tr.age = 25;

		myschool ms = new myschool();
		ms.city = "pala";
		ms.nameoftheschool = "eden";
		ms.noofstudents = 1500;

		labtrainer lt = new labtrainer();
		lt.salary = 15000;

	}
}
