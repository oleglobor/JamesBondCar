import java.util.Random;

class JamesBondCar{ 

	static int rand1  = new Random().nextInt(2);// РАНДОМ КАРЛ, РАНДОМ

// це був мій перший коментар. І це круто)

	public static void main(String[] args) {
		int speed =  + 120; 
		
	Car c = new Car();
	c.colour = "silver"; // рандомний колір, надіюсь агент 007 не образиться
	c.name = "Audi"; // Джеймс Бонд катався на Ауді :)
	c.story(); // кожен письменник любить пролог :)
	c.start();
	if (speed == 120){
		System.out.println(" Насолоджуючись піснею AC DC High way to hell агент зі швидкістю 120 км. на годину їхав на зустріч ворогу");
		System.out.println(" Як виявилось, суперзлочинець хотів знищити селище з мирними жителями");
		System.out.println(" Але відстань до селища 3000 км. а злочинець за годину буде вже там");
		c.drive(50); // віііііііііііі
	 c.stop(); // дядько приїхав. Like a boss

if (rand1 ==0){
			System.out.println("тра ля ля ля ля");
}else if  (rand1 ==1){
	System.out.println("труууууууууу");
}		 
	 }
	 c.fire();// тут Джеймс бонд мітко стріляє з базуки :)
	 c.end();// завіса
		}
	}
// і це все мусила бути проста машинка