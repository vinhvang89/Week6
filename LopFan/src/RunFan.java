public class RunFan {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Fan fan1 = new Fan(true,23,"Red",SLOW);
        Fan fan2 = new  Fan(false,33,"Blue",FAST);
        System.out.println(fan1.power + " "+fan1.color +" "+fan1.speed +" "+fan1.radius);
        System.out.println(fan2.power + " "+fan2.color +" "+fan2.speed + " " +fan2.radius);
    }
}
