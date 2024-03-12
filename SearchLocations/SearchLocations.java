
package SearchLocations;
import java.util.Scanner;
public class SearchLocations {
    public static void main(String[] args) {
        int[] locations = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to search: ");
        int target = scanner.nextInt();
        
        int left = 0;
        int right = locations.length - 1;
        int mid;
        
        while (left <= right) {
            mid = (left + right) / 2;
            
            if (locations[mid] == target) {
                System.out.println("Target found at position " + mid);
                break;
            } else if (locations[mid] < target) {
                System.out.println("Examining position " + mid + " (Value: " + locations[mid] + ")");
                left = mid + 1;
            } else {
                System.out.println("Examining position " + mid + " (Value: " + locations[mid] + ")");
                right = mid - 1;
            }
        }
        
        if (left > right) {
            System.out.println("Target not found");
        }
    }
}
