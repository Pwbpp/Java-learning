package com.peng.test06;

public class demo3 {
	public static void  main(String args[]) {
		animal amAnimal = new cat();
		amAnimal.eat();
		amAnimal.sleep();
		amAnimal.run();
		
		System.out.println(amAnimal.num);
		System.out.println(amAnimal.age);
		
		System.out.println("================");
		
		cat c = (cat) amAnimal;
		c.run();
		c.eat();
		c.sleep();
		c.catchMOuse();
		System.out.println(c.num);
		System.out.println(c.age);
		
	}
}
