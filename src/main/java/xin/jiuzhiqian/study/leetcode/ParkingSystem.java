package xin.jiuzhiqian.study.leetcode;

/**
 * @author : zhou
 */
public class ParkingSystem {
    private int[] stock;

    private int[] curr = {0, 0, 0};

    public ParkingSystem(int big, int medium, int small) {
        stock = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (curr[carType] < stock[carType]) {
            curr[carType]++;
            return true;
        }
        return false;
    }
}