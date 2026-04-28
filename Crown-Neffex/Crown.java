public class Crown {
    public static void main(String[] args) throws InterruptedException {

        // Each line + delay (milliseconds)
        showLine("🎵 [Intro]", 2000);
        showLine("First line of the song...", 3000);
        showLine("Second line of the song...", 3000);
        showLine("Third line of the song...", 3000);
        showLine("🎶 Chorus line here...", 4000);

        showLine("Next verse line...", 3000);
        showLine("Another line...", 3000);

        showLine("🎵 End of song", 2000);
    }

    public static void showLine(String line, int delay) throws InterruptedException {
        System.out.println(line);
        Thread.sleep(delay); // waits before showing next line
    }
}