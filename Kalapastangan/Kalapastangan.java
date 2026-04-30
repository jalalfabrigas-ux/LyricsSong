public class Kalapastangan {
    public static void main(String[] args) throws InterruptedException {

       
        showLine("Oh, oh, oh, oh", 2000);
        showLine("Oh, ooh", 3000);
        showLine("Mamamatay akong nakangiti", 3000);
        showLine("Kapag Ikaw ang nasa aking tabi", 3000);
        showLine("Mabubuhay akong nagsisisi", 4000);
        showLine("Kapag 'sang araw hindi Kita mapangiti", 2000);
    }

    public static void showLine(String line, int delay) throws InterruptedException {
        System.out.println(line);
        Thread.sleep(delay); 
    }
}