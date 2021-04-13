package day4_Oops_coup;

public class Car {
	private int cost;
	private String carName;
	private Engine engine;
	private int carPower;
	private int bass;
	
	//----
	private MusicSystem ms;
	



	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(MusicSystem ms) {
		super();
		this.bass = bass;
		this.ms = ms;
	}

	

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	
	public Car(String carName, int carPower) {
		super();
		this.carName = carName;
		this.carPower = carPower;
	}

	public int getCost() {
		return cost;
	}





	public void setCost(int cost) {
		this.cost = cost;
	}





	public String getCarName() {
		return carName;
	}





	public void setCarName(String carName) {
		this.carName = carName;
	}





	public Engine getEngine() {
		return engine;
	}





	public void setEngine(Engine engine) {
		this.engine = engine;
	}





	public int getCarPower() {
		return carPower;
	}





	public void setCarPower(int carPower) {
		this.carPower = carPower;
	}





	public int getBass() {
		return bass;
	}





	public void setBass(int bass) {
		this.bass = bass;
	}





	public MusicSystem getMs() {
		return ms;
	}





	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}





	public void doStartCar()
	{
		 // ------
		carPower = engine.doStartEngine("petrol") + 100;
		
	}
	
	
	
	public void moveCarForward()
	{
		doStartCar();
		if(carPower>1000) System.out.println(" Car speed is High ");
		if(carPower<1000) System.out.println(" Car speed is low ");
		if(carPower<5000) System.out.println(" This must be a truck ");
		
		
	}
	
	public void doCheckBass() {
		
		bass = ms.musicQuality("Pioneer Receiver", 2);
		
	}
	
	public void playMusic()
	{
		doCheckBass();
		if(bass > 100) {
			System.out.println("The bass is full "+bass);
		}
		if(bass < 100 && bass > 80) {
			System.out.println("The bass is medium "+bass);
		}
		if(bass < 80 && bass > 60) {
			System.out.println("The bass is normal "+bass);
		}
		if(bass < 60) {
			System.out.println("No bass "+bass);
		}
		
	}
	
	

}
