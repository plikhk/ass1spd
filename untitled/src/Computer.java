public class Computer {
    private final String cpu;
    private final String gpu;
    private final int ramGb;
    private final int storageGb;
    private final String coolingSystem;

    // конструктор протектед, тупо чтоб извне нельзя было через new создать
    protected Computer(String cpu, String gpu, int ramGb, int storageGb, CoolingType cooling) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ramGb = ramGb;
        this.storageGb = storageGb;
        this.cooling = cooling;
}
