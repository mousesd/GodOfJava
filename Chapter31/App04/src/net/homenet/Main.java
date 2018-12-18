package net.homenet;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.*;

@SuppressWarnings("ALL")
public class Main extends Thread {
    private final String dirName;

    public Main(String dirName) {
        this.dirName = dirName;
    }

    public static void main(String[] args) throws InterruptedException {
        String dirName = "/Users/mousesd/Documents/Java/GodOfJava";
        String fileName = "WatcherSample.txt";

        Main app = new Main(dirName);
        app.setDaemon(true);
        app.start();

        Thread.sleep(1000);
        for (int loop = 0; loop < 10; loop++) {
            app.fileWriteDelete(fileName + loop);
        }
    }

    @Override
    public void run() {
        System.out.println("=== Watcher thread is started ===");
        System.out.printf("Directory=%s\n", dirName);
        addWatcher();
    }

    private void addWatcher() {
        try {
            Path path = Paths.get(dirName);
            WatchService watcher = FileSystems.getDefault().newWatchService();
            WatchKey watchKey = path.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

            while (true) {
                watchKey = watcher.take();
                List<WatchEvent<?>> events = watchKey.pollEvents();
                for (WatchEvent<?> event : events) {
                    Path name = (Path) event.context();
                    if (event.kind() == ENTRY_CREATE) {
                        System.out.printf("%s created\n", name);
                    } else if (event.kind() == ENTRY_MODIFY) {
                        System.out.printf("%s modified\n", name);
                    } else if (event.kind() == ENTRY_DELETE) {
                        System.out.printf("%s modified\n", name);
                    }
                }
                watchKey.reset();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void fileWriteDelete(String fileName) {
        Path path = Paths.get(dirName, fileName);
        String content = "Watcher sample";
        StandardOpenOption option = StandardOpenOption.CREATE;

        try {
            System.out.println("Write " + fileName);
            Files.write(path, content.getBytes(), option);
            Files.delete(path);
            Thread.sleep(1000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
