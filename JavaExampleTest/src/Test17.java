
	public class Mycar extends AbstractAutomobile{
		
		
		Mycar(){
			super(STANDERD_CAR);
					
		}
		
		@Override
		public abstract int getCapacity() {
			int value=5;
			return value;
		}
		@Override
		public abstract String getCarModel() {
			System.out.println("자가용 미니쿠퍼");
		}
		
	}