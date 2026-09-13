// билдер для обычного офисного компа
public class OfficeComputerBuilder extends ComputerBuilder{

    // дефолтная встройка
    private static final String DEFAULT_GPU = "Integrated Graphics";
    private static final int MIN_OFFICE_RAM = 8;

    public OfficeComputerBuilder() {
        this.gpu = DEFAULT_GPU;
        this.cooling = CoolingType.STOCK_AIR;
    }

    @Override
    public Computer build() {
        // офисному хватит и базовых требований
        if (this.cpu == null || this.cpu.trim().isEmpty()) {
            throw new IllegalStateException("проц нужен");
        }
        if (this.ramGb < MIN_OFFICE_RAM) {
            throw new IllegalStateException("винда не потянет, надо минимум " + MIN_OFFICE_RAM + " гб");
        }

        return new Computer(cpu, gpu, ramGb, storageGb, cooling);
    }

}