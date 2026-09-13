public class Computer {
    private final String cpu;
    private final String gpu;
    private final int ramGb;
    private final int storageGb;
    private final CoolingType cooling; // ТУТ БЫЛА ОШИБКА, заменили String на CoolingType

    // конструктор протектед, тупо чтоб извне нельзя было через new создать
    protected Computer(String cpu, String gpu, int ramGb, int storageGb, CoolingType cooling) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ramGb = ramGb;
        this.storageGb = storageGb;
        this.cooling = cooling;
    }

    // ту стринг чисто для удобного вывода в консоль
    @Override
    public String toString() {
        return String.format("PC Build -> CPU: %s | GPU: %s | RAM: %dGB | Storage: %dGB | Cooling: %s",
                cpu, gpu, ramGb, storageGb, cooling);
    }
}