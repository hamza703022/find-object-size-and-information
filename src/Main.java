import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

public class Main {
    public static void main(String[] args) {
        A a = new A(1);

        System.out.println(VM.current().details());
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
    }
}