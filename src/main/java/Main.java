import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        System.out.println(service.getAverageAmount(sales));
        System.out.println(service.getTotalAmount(sales));
        System.out.println(service.getMaxMonth(sales));
        System.out.println(service.getMinMonth(sales));
        System.out.println(service.getMonthsBelowAverage(sales));
        System.out.println(service.getMonthsAboveAverage(sales));
    }
}
