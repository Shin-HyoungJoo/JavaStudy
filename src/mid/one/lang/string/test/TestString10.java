package mid.one.lang.string.test;

public class TestString10 {
	public static void main(String[] args) {
		String fruits = "apple,banana,mango";
		
		String[] fruitArr = fruits.split(",");
		String joinFruits = "";
		
		for (String str : fruitArr) {
			System.out.println(str);
//			joinFruits = String.join("->", str);
		}
		
		joinFruits = String.join("->", fruitArr);	//배열, str 다 가능
		
		System.out.println("joinedString = " + joinFruits);
	}
}
