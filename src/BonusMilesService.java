public class BonusMilesService {

    public int calculate (int price) {
        int miles = price / 20; //1 бонус за каждые 20 руб
        return miles;
    }

}
