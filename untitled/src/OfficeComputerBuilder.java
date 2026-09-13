// билдер для обычного офисного компа
public class OfficeComputerBuilder extends ComputerBuilder{

    // дефолтная встройка
    private static final String DEFAULT_GPU = "Integrated Graphics";
    private static final int MIN_OFFICE_RAM = 8;

    public OfficeComputerBuilder() {
        this.gpu = DEFAULT_GPU;
        this.cooling = CoolingType.STOCK_AIR;
    }

}