public class Elevator {

    int currentFloor = 1;
    int minFloor;
    int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown(int currentFloor) {
        return currentFloor - 1;
    }

    public int moveUp(int currentFloor) {
        return currentFloor + 1;
    }

    public void move(int floor) {

        if (floor >= minFloor && floor <= maxFloor) {
            if (currentFloor > floor) {
                for (int i = currentFloor - 1; i >= floor; i--) {
                    currentFloor = moveDown(currentFloor);
                    System.out.println(getCurrentFloor());
                }
            } else if (currentFloor < floor) {
                for (int i = currentFloor; i < floor; i++) {
                    currentFloor = moveUp(currentFloor);
                    System.out.println(getCurrentFloor());
                }
            } else {
                System.out.println("Вы находитесь на выбранном этаже");
            }
        } else {
            System.out.println("Этаж не существует!");
        }
    }
}
