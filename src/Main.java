public class Main {
    public static void main(String[] args) {
        CyclicQueue<String> cyclicQueue = new CyclicQueue<>(5);

        System.out.println("Запись в очередь");
        cyclicQueue.put("Первый");
        cyclicQueue.put("Второй");
        cyclicQueue.put("Третий");
        cyclicQueue.put("Четвертый");
        cyclicQueue.put("Пятый");
        cyclicQueue.put("Шестой");

        System.out.println("Чтение из очереди");
        System.out.println("Первый элемент: " + cyclicQueue.get());
        System.out.println("Второй элемент: " + cyclicQueue.get());
        System.out.println("Третий элемент: " + cyclicQueue.get());
        System.out.println("Четвертый элемент: " + cyclicQueue.get());
        System.out.println("Пятый элемент: " + cyclicQueue.get());
        System.out.println("Шестой элемент: " + cyclicQueue.get());

    }
}