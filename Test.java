public class Test {
    public static void main(String[] args) {
        Streak s = new Streak("Brush Teeth", "Brush and floss teeth.", CycleType.DAILY, 2);
        System.out.println(s.toString());       
    }
}