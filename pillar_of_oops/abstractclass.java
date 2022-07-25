package pillar_of_oops;
abstract class birds {
	abstract void makesound();
	public void fly() {
		System.out.println("I can fly");
	}
}
    class duck extends birds {
    	public void makesound() {
    		System.out.println("qwack qwack");
    	}
    }
    
    class abstractclass {
    	public static void main(String[] args) {
    		duck d1 =new duck();
    		d1.makesound();
    		d1.fly();
    		
    	}
    }