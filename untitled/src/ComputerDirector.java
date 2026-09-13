// директор который знает готовые сборки, чтоб вручную не писать одно и то же
public class ComputerDirector{
    // метод для топового компа
    public void constructTopTierGamingRig(ComputerBuilder builder) {
        builder.setCpu("Intel Core i9-14900K")
                .setGpu("NVIDIA RTX 4090 24GB")
                .setRam(64)
                .setStorage(4000)
                .setCooling(CoolingType.LIQUID_COOLING);
    }
}