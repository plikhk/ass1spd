// собираем игровой комп
public class GamingComputerBuilder extends ComputerBuilder{

    private static final int MIN_GAMING_RAM = 16;

    public GamingComputerBuilder() {
        // по дефолту ставим водянку
        this.cooling = CoolingType.LIQUID_COOLING;
    }





}