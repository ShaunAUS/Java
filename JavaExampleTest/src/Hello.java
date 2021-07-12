
	public interface Hello {
	
		
		public void Method();
		
		
		//default 메서드도 오버라이딩가능
		default void Method2() {
			System.out.println("아 자바 언제 마스터하냐");
		}
}
