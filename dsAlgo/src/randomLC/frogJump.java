package randomLC;

public class frogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxJump(int[] stones) {
        int max = Math.abs(stones[0]-stones[1]);

        for(int i=0; i<stones.length-2; i++) {
            int temp = Math.abs(stones[i+2]-stones[i]);
            if( temp > max) {
                max = temp; 
            }
        }

        return max;
    }

}
