public class StatService {
    public class StatsService {
        public long salesSumm(long[] sales) {
            int salesCounter = 0;
            for (long i : sales) {
                salesCounter += i;

            }
            return salesCounter;
        }
        public long salesAverageSumm(long[] sales) {
            // long averageSumCounter = salesSumm(sales) / 12;
            return salesSumm(sales) / sales.length;

        }
        public int minSales(long[] sales) {
            int minMonth = 0;
            int month = 0; // переменная для индекса рассматриваемого месяца в массиве
            for (long sale : sales) {
                // sales[minMonth] - продажи в месяце minMonth
                // sale - продажи в рассматриваемом месяце
                if (sale <= sales[minMonth]) {
                    minMonth = month;
                }
                month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
            }
            return minMonth + 1;
        }
        public int maxSales(long[] sales) {
            int maxMonth = 0;
            int month = 0;
            for (long sale : sales) {
                if (sale >= sales[maxMonth]) {
                    maxMonth = month;
                }
                month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
            }
            return maxMonth + 1;
        }


    }

}
