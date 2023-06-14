public class Counter {
    private static int count = 0;
    public static void increase(){
        count++;
        if (count % 15 == 0)
            System.out.println("Количество точек стало кратно 15");
    }
    public static int getCount() {
        return count;
    }
}
