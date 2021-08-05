package hw8;

public class Robot implements Sport {
    private String name;
    private int maxLength;
    private int maxHeight;

    public Robot(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance < maxLength) {
            System.out.println("Робот пробежал " + distance + "м");
            return true;
        } else {
            System.out.println("Робот не смог пробежать " + distance + "м");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height < maxHeight) {
            System.out.println("Робот прыгнул " + height + "м");
            return true;
        } else {
            System.out.println("Робот не смог прыгнуть " + height + "м");
            return false;
        }
    }
}
