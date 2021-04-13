package day4_Oops_coup;
import java.util.Scanner;

import day4_Oops_coup.Car;
import day4_Oops_coup.Engine;
public class MainRunner {
	
	public static void main(String[] args, int basePow) {
		// TODO Auto-generated method stub
		
		/**Engine e1 = new Engine(800);
		Engine e2 = new Engine(1800);
		Engine e3 = new Engine(2000);**/
		
		System.out.println("ENter the number of cars you want to enter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Car arr[] = new Car[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the car and power of "+(i+1));
			String name = sc.next();
			int power = sc.nextInt();
			int basepPow= sc.nextInt();
			Engine e = new Engine(basePow);
			Car car = new Car(e);
			arr[i] = new Car(name, power);
			}
		
		
		
		
		
		for(int i = 0; i < n; i++) {
			System.out.println();
		}

		/**Car obj1 = new Car(e1);
		obj1.setCarName("Honda");
		obj1.setCarPower(1000);
		Car obj2 = new Car(e2);
		obj2.setCarName("Suziki");
		obj2.setCarPower(2000);
		Car obj3 = new Car(e3);
		obj3.setCarName("Apache");
		obj3.setCarPower(1500);

		// insert into an array
		arr[0] = obj1;
		arr[1] = obj2;
		arr[2] = obj3;**/
		
		
		
		
		
		
		
		
		
		
		
		
		

		// ---- iterate the array
		// approach - 1
		for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i].getCarName()+" - "+arr[i].getCarPower());
		}
		System.out.println("-----------------------------------");
		// --- appraoch 2
		for (Car car : arr) {
		System.out.println(car.getCarName()+" --- "+car.getCarPower());
		}


		
		
	//	Engine hondaEngine = new Engine(1000); // type of A
		//Engine tataEngine = new Engine(1200);  // type B
		MusicSystem s1 = new MusicSystem(2);
		
		
		// --- default features-----
		//  ---- Base model ---
		Car car1 = new Car(s1);
		//car1.moveCarForward();
		car1.playMusic();
		
		
		// ---- new enhancements in old component ---
		// ---- do some changes in base engine --
		//Engine e = car1.getEngine();
		//e.setBasepower(e.getBasepower()+1);
		
		//car1.moveCarForward();
		
		MusicSystem ms = car1.getMs();
		ms.setBass(ms.getBass()+4);
		
		car1.playMusic();
		
		//--- Switch to new component ---
		// --- change engine ---
		//car1.setEngine(tataEngine);
		//car1.moveCarForward();
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getCarPower() > 1500) {
				System.out.println(arr[i].getCarName());
			}
		}
		
		

	}

}
