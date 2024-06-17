public class TimeSeconds {
 
    public static void main(String[] args) {
        // Declare variables
        int timeSeconds, hours, minutes, seconds;
        
        // Instantiate --> Create the Scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompt for user to enter time in seconds
        System.out.print("Please enter time in seconds: ");
        
        // Read and Store time in seconds, entered by the user
        timeSeconds = input.nextInt();
        
        // Convert timeSeconds into hours
        hours = timeSeconds / 3600;
        
        // Convert timeSeconds into minutes
        minutes = (timeSeconds % 3600) / 60;
        
        // Convert timeSeconds into seconds
        seconds = (timeSeconds % 3600) % 60;
        
        // Display the output
        System.out.println(hours + "H: " + minutes + "M: " + seconds + "S");
    }
    
}
