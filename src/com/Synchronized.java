package com;

 class Synchronized  implements Runnable{
     int tikets=5;
//	
	public void run() {
		for(int i=0;i<10;i++){
			test();
			
			}
				
		}
	public synchronized void test(){
		if(tikets>0){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("车票"+tikets--);
		}
	}
//		
	}
