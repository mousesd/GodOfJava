package net.homenet;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runFilesSamples();
    }

    private void runFilesSamples() {
        String fileName = "AboutThisBook.txt";
        Path path = Paths.get(fileName);
        try {
            Path resPath = writeFile(path);
            System.out.println("============== Created file contents ==============");
            readFile(resPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> getContents() {
        List<String> contents = new ArrayList<>();
        contents.add("이 책은 저자의 6번째 책입니다.");
        contents.add("필자의 수년간의 자바 경험을 바탕으로 집필되었습니다.");
        contents.add("많은 분들에게 도움이 되면 좋겠습니다.");
        contents.add("책에 대한 질문은 god@godofjava.com으로 문의 주시기 바랍니다.");
        contents.add("Current Date=" + new Date());
        return contents;
    }

    private Path writeFile(Path path) throws IOException {
        Charset charset = Charset.forName("EUC-KR");
        List<String> contents = getContents();
        StandardOpenOption openOption = StandardOpenOption.CREATE;
        return Files.write(path, contents, charset, openOption);
    }

    private void readFile(Path path) throws IOException {
        System.out.println("Path=" + path);

        Charset charset = Charset.forName("EUC-KR");
        List<String> content = Files.readAllLines(path, charset);
        for (String line : content) {
            System.out.println(line);
        }
        System.out.println();
    }
}
