import com.dgmf.constructordi.ClientWithConstructorDI;
import com.dgmf.service.Service;
import com.dgmf.setterdi.ClientWithSetterDI;
import com.dgmf.withoutdi.ClientWithoutDI;

public class Main {
    public static void main(String[] args) {
        ClientWithoutDI clientWithoutDI =
                new ClientWithoutDI();
        ClientWithConstructorDI clientWithConstructorDI =
                new ClientWithConstructorDI(new Service());
        ClientWithSetterDI clientWithSetterDI = new ClientWithSetterDI();
        clientWithSetterDI.setService(new Service());
    }
}