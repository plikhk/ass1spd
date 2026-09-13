/ абстрактный класс чтоб не копипастить одно и то же в оба билдера (для clean code)
public abstract class ComputerBuilder{
    // протектед чтобы наследники видели эти поля
    protected String cpu;
    protected String gpu;
    protected int ramGb;
    protected int storageGb;
    protected CoolingType cooling = CoolingType.STOCK_AIR; // базовое охлаждение для всех


}