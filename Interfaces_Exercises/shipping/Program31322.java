import providers.DalseyHillblomLynn;
import providers.Fedex;
import providers.UnitedParcelService;
import java.util.Locale;
public class Program31322 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMANY);
        Orderff order1 = new Orderff(1, 1500, 234.90);
        Orderff order2 = new Orderff(2, 600, 124.00);
        Orderff order3 = new Orderff(3, 3000, 53.00);
        Orderff order4 = new Orderff(4, 7000, 300.00);

        OrderProcessor orderProcessorFedex = new OrderProcessor(new Fedex());
        orderProcessorFedex.process(order1);

        System.out.printf("%s - %.2f\n", order1.getShipping().getShippingProviderType(), order1.getShipping().getValue());

        OrderProcessor orderProcessorUnitedParcelService = new OrderProcessor(new UnitedParcelService());
        orderProcessorUnitedParcelService.process(order1);

        System.out.printf("%s - %.2f\n", order1.getShipping().getShippingProviderType(), order1.getShipping().getValue());

        OrderProcessor orderProcessorDalseyHillblomLynn = new OrderProcessor(new DalseyHillblomLynn());
        orderProcessorDalseyHillblomLynn.process(order1);

        System.out.printf("%s - %.2f\n", order1.getShipping().getShippingProviderType(), order1.getShipping().getValue());

        System.out.println("-----");

        orderProcessorFedex.process(order2);
        System.out.printf("%s - %.2f\n", order2.getShipping().getShippingProviderType(), order2.getShipping().getValue());

        orderProcessorUnitedParcelService.process(order2);
        System.out.printf("%s - %.2f\n", order2.getShipping().getShippingProviderType(), order2.getShipping().getValue());

        orderProcessorDalseyHillblomLynn.process(order2);
        System.out.printf("%s - %.2f\n", order2.getShipping().getShippingProviderType(), order2.getShipping().getValue());

        System.out.println("-----");

        orderProcessorFedex.process(order3);
        System.out.printf("%s - %.2f\n", order3.getShipping().getShippingProviderType(), order3.getShipping().getValue());

        orderProcessorUnitedParcelService.process(order3);
        System.out.printf("%s - %.2f\n", order3.getShipping().getShippingProviderType(), order3.getShipping().getValue());

        orderProcessorDalseyHillblomLynn.process(order3);
        System.out.printf("%s - %.2f\n", order3.getShipping().getShippingProviderType(), order3.getShipping().getValue());

        System.out.println("-----");

        orderProcessorFedex.process(order4);
        System.out.printf("%s - %.2f\n", order4.getShipping().getShippingProviderType(), order4.getShipping().getValue());

        orderProcessorUnitedParcelService.process(order4);
        System.out.printf("%s - %.2f\n", order4.getShipping().getShippingProviderType(), order4.getShipping().getValue());

        orderProcessorDalseyHillblomLynn.process(order4);
        System.out.printf("%s - %.2f\n", order4.getShipping().getShippingProviderType(), order4.getShipping().getValue());
    }
}
