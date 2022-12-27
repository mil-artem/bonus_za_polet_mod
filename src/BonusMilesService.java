public class BonusMilesService {
    public int calculate(int cost) {
        int priceMile = 20;
        int miles = cost / priceMile;
        return miles;
    }
}
