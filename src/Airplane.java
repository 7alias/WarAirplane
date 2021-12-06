public class Airplane {

    private String name = "Air-";
    private int n = 0;
    private int x;
    private int y;
    private int z;
    private int dir = 0;
    private int fuel;
    private int bx = 0;
    private int by = 0;

    public Airplane(int n, int x, int y, int z, int f) {
        this.x = x;
        this.y = y;
        this.z = 0;
        this.fuel = f;
        this.n = n;
    }

    public void printPosition() {
        System.out.println("The airplane " + name + n + " is at x:" + x + ", y:" + y + ", z:" + z + " now.");
        System.out.println(dir);
    }

    public void fillFuel() {
        if (z == 0) {
            this.fuel += 100;
        System.out.println(name + n + " fuel: " + this.fuel);}
        else {
            System.out.println("Impossible fueling in air");
        }
    }

    public void dropBombs() {
        bx = this.x;
        by = this.y;
        System.out.println(name + n + " makes boom at " + this.bx + " : " + this.by);
    }

    public void turnLeft() {
        dir--;
        if (dir < 0) dir = -1;
        System.out.println("left " + dir + " " + this.y);
    }

    public void turnRight() {
        dir++;
        if (dir > 0) dir = 1;
        System.out.println("right " + dir + " " + this.y);
    }


    public void flyUp(int z, int i) {
        this.z += z;
        flyStraight(i);
    }

    public void flyDown(int z, int i) {
        flyUp(-z, i);
    }

    public void flyStraight(int i) {
        if (i < 0 && -i > fuel) i = -fuel;
        else if (i > fuel) i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else y -= i;
        fuel -= Math.abs(i);
    }

}
