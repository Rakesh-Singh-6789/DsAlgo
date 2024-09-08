public class PackageSorter {
    
    public static String solve(int width, int height, int length, int mass) {
        
        
        // Check if the package is bulky
        boolean isBulky = width >= 150 || height >= 150 || length >= 150;
        
        if(!isBulky) {
        	// Calculate the volume later as MULTIPLICATION is a heavy operation
            int volume = width * height * length;
        	isBulky = volume >= 1000000;
        }
        
        // Check if the package is heavy
        boolean isHeavy = mass >= 20;
        
        // Determine the category
        if (isBulky && isHeavy) {
            return "REJECTED";
        } else if (isBulky || isHeavy) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    public static void main(String[] args) {
        // Test cases
    	System.out.println(solve(160, 70, 70, 10)); // "SPECIAL"
        System.out.println(solve(120, 100, 100, 10)); // "SPECIAL"
        System.out.println(solve(90, 90, 118, 10)); // "STANDARD"
        System.out.println(solve(120, 100, 50, 30)); // "SPECIAL"
        System.out.println(solve(80, 110, 80, 70)); // "SPECIAL"
        System.out.println(solve(70, 80, 90, 10)); // "STANDARD"
        System.out.println(solve(100, 120, 60, 19)); // "STANDARD"
        System.out.println(solve(150, 70, 70, 10)); // "SPECIAL"
        System.out.println(solve(120, 100, 100, 10)); // "SPECIAL"
        System.out.println(solve(90, 90, 118, 10)); // "STANDARD"
        System.out.println(solve(120, 100, 110, 20)); // "REJECTED"
        System.out.println(solve(80, 110, 80, 70)); // "SPECIAL"
        System.out.println(solve(70, 80, 90, 10)); // "STANDARD"
        System.out.println(solve(100, 150, 60, 30)); // "REJECTED"
    }
}
