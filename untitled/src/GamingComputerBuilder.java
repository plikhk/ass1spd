// собираем игровой комп
public class GamingComputerBuilder extends ComputerBuilder{

    private static final int MIN_GAMING_RAM = 16;

    public GamingComputerBuilder() {
        // по дефолту ставим водянку
        this.cooling = CoolingType.LIQUID_COOLING;
    }

    @Override
    public Computer build() {
        // тут жестко проверяем чтоб проц и видюха не были пустыми
        if (this.cpu == null || this.cpu.trim().isEmpty()) {
            throw new IllegalStateException("проц нужен обязательно");
        }
        if (this.gpu == null || this.gpu.trim().isEmpty()) {
            throw new IllegalStateException("без видюхи это не игровой комп");
        }
        // ну и оперативки должно хватать
        if (this.ramGb < MIN_GAMING_RAM) {
            throw new IllegalStateException("надо минимум " + MIN_GAMING_RAM + " гигов");
        }

        // если все ок собираем объект
        return new Computer(cpu, gpu, ramGb, storageGb, cooling);
    }

}