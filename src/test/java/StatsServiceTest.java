import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    int[] arr = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };git st

    @Test
    public void amount() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.allAmount(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middle() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.middleSum(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleBellow() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.quanMonthBellowMiddle(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleHigher() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.quanMonthHigherMiddle(arr);
        Assertions.assertEquals(expected, actual);
    }
}
