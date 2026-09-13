// точка входа, тут все тестим и смотрим результаты
public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        System.out.println("=== 1. сборка игрового через директора ===");
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        director.constructTopTierGamingRig(gamingBuilder);
        Computer gamingPc = gamingBuilder.build();
        System.out.println(gamingPc);

        System.out.println("\n=== 2. сборка офисного через директора ===");
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director.constructCallCenterTerminal(officeBuilder);
        Computer officePc = officeBuilder.build();
        System.out.println(officePc);

        System.out.println("\n=== 3. кастомная сборка ручками ===");
        // чисто через точки вызываем методы по цепочке
        ComputerBuilder customBuilder = new GamingComputerBuilder();
        Computer customPc = customBuilder.setCpu("AMD Ryzen 7 7800X3D")
                .setGpu("NVIDIA RTX 4070 Ti")
                .setRam(32)
                .setStorage(2000)
                .build();
        System.out.println(customPc);

        System.out.println("\n=== 4. тест на ошибки (валидация) ===");
        try {
            ComputerBuilder failBuilder = new GamingComputerBuilder();
            failBuilder.setCpu("Intel i5")
                    .setGpu("RTX 3060")
                    .setRam(8) // тут спецом мало оперативы чтоб ошибка вылезла
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("поймали ошибку как и задумывалось: " + e.getMessage());
        }
    }
}