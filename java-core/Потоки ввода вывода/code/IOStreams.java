import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class IOStreams {
    private static final Path ROOT = Path.of("java-core", "Потоки ввода вывода", "code");

    public static void main(String[] args) throws IOException {
        var dir1 = ROOT.resolve("dir1");
        var dir2 = dir1.resolve("dir2");
        var dir3 = dir1.resolve("dir3");
        var file1 = dir2.resolve("file1.txt");

        Files.createDirectories(dir2);
        Files.createDirectories(dir3);
        try {
            Files.createFile(file1);
        } catch (FileAlreadyExistsException _) {}
        Stream<Path> paths = Files.list(dir1);
        paths.toList();
        Files.walkFileTree(dir1, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
