public class Main {


    public static void main(String[] args) {


        Airplane plane = new Airplane(1, 0, 0, 0, 2000);

        plane.printPosition();

        plane.flyStraight(50);
        plane.printPosition();
        plane.flyUp(50, 50);
        plane.turnLeft();
        plane.printPosition();
        plane.turnLeft();
        plane.printPosition();
        plane.turnLeft();
        plane.printPosition();
        plane.flyStraight(100);
        plane.turnRight();
        plane.turnRight();
        plane.printPosition();
        plane.flyStraight(100);
        plane.printPosition();
        plane.dropBombs();
        plane.flyStraight(50);
        plane.flyDown(50, 0);
        plane.printPosition();
        plane.fillFuel();
        plane.flyDown(0, 200);
        plane.printPosition();
        plane.fillFuel();
        plane.flyUp(50,50);
        plane.printPosition();
        plane.fillFuel();
        plane.flyDown(50,50);
        plane.printPosition();
        plane.fillFuel();
        plane.fillFuel();
        plane.fillFuel();
        plane.fillFuel();
        plane.fillFuel();



    }

}