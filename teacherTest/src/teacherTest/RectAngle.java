package teacherTest;

public class RectAngle {
	int width;
	int height;
	
	public RectAngle(int width,int height) {
		this.width=width;
		this.height=height;
		
	}
	
	
	public int GetFill() {
		
		return width*height;
	}
}
