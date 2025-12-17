package Encapsulation;

public class Car {
//	Create a class Car with a private variable speed . Implement getter and setter methods. 
//	In the setter, ensure speed cannot exceed 200 km/h.
	
	
	private float speed;
	
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		  if (speed > 200) {
	            System.out.println("Speed cannot exceed 200 km/h. Setting speed to 200.");
	            this.speed = speed;
	        } else {
	            this.speed = speed;
	        }
	}

}
