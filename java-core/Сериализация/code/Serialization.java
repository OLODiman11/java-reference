import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Serialization {
    private static final Path ROOT = Path.of("java-core", "Сериализация", "code");

    public static void main(String[] args) throws CloneNotSupportedException {
        Child child = new Child();
        Child childClone = (Child) child.clone();
        System.out.println(child == childClone);
        System.out.println(child.getChild2() == childClone.getChild2());

//        try(var oos = new ObjectOutputStream(Files.newOutputStream(ROOT.resolve(Path.of("obj.dat"))))) {
//            oos.writeObject(child);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try (var ois = new ObjectInputStream(Files.newInputStream(ROOT.resolve(Path.of("obj.dat"))))) {
//            System.out.println(ois.readObject());
//        } catch (ClassNotFoundException | IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
