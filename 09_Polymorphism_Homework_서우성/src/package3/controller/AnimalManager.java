package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;


public class AnimalManager {
	public static void main(String[] args) {
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("꽃분이","말티즈",3);
		arr[1] = new Dog("찐빵이","닥스훈트",5);
		arr[2] = new Cat("네로","코숏","부천","검은색");
		arr[3] = new Cat("코코","브숏","목동","회색");
		arr[4] = new Dog("콩순이","푸들",5);
		
		for(Animal ani : arr) {
			System.out.println(ani.toString());
		}
	}
}
