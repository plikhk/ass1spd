/ абстрактный класс чтоб не копипастить одно и то же в оба билдера (для clean code)
public abstract class ComputerBuilder{
    // протектед чтобы наследники видели эти поля
    protected String cpu;
    protected String gpu;
    protected int ramGb;
    protected int storageGb;
    protected CoolingType cooling = CoolingType.STOCK_AIR; // базовое охлаждение для всех

    // каждый сеттер возвращает this, это тот самый fluent api
    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }
}