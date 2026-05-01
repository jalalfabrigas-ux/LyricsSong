public class Crown {
    public static void main(String[] args) throws InterruptedException {

        // Each line + delay (milliseconds)
        showLine("We're the forgotten souls, so stop, drop, and roll", 2000);
        showLine("Ya lost all control, and pop off your bold", 3000);
        showLine("I got squat I fold, I'm not bought I'm sold", 3000);
        showLine("My stock rocks it's gold, hey knock knock behold", 3000);
        showLine("It's tick tock to close, I ain't stopping though", 4000);

    }

    public static void showLine(String line, int delay) throws InterruptedException {
        System.out.println(line);
        Thread.sleep(delay); // waits before showing next line
    }
}