package teacherTest;

public class SingleThread {
	
	
     String str;
     int time;
     
     
     SingleThread(String s,int t){
    	 str=s;
    	 time=t;
     }
     
    	 
    	 void start() {
    		 for(int i=0; i<5; i++) {
    			 System.out.println("NO."+i+":"+str);
    			 try {
					Thread.sleep(time);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
    		 }
    	 }
    	 
    	 public static void main(String[] args) {
    		 SingleThread a=new SingleThread("A",500);
    		 SingleThread b= new SingleThread("\tB",700);
    		 
    		 a.start();
    		 b.start();
			
		}
     
}
