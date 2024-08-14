package mid.two.generic.ex3;

import mid.two.generic.animal.Cat;
import mid.two.generic.animal.Dog;

public class AnimalHospitalMainV2 {
	public static void main(String[] args) {
		AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
		AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
		AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
		AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
	}
}
