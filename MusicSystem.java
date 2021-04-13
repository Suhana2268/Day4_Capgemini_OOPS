package day4_Oops_coup;

public class MusicSystem {
	
	private int bass;
	
	
	public MusicSystem(int bass) {
		super();
		this.bass = bass;
	}
	

	public MusicSystem() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBass() {
		return bass;
	}



	public void setBass(int bass) {
		this.bass = bass;
	}



	public int musicQuality(String brand, int speakers) {
		if(brand.equals("Kenwood Receiver")) {
			if(speakers== 2) {
				bass = bass+100;
				
			}
			else {
				if(speakers == 1) {
					bass = bass+80;
				}
				else
					bass = bass+20;
			}
			
		}
		else if(brand.equals("Pioneer Receiver")) {
			if(speakers == 2) {
				bass = bass+90;
			}
			else {
				if(speakers == 1) {
					bass = bass+70;
				}
				else {
					bass = bass+10;
				}
			}
		}
		else {
			return bass+30;
		}
			 
		return bass;	
		
	}
	

}
