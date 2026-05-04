package ch17.sec04.exam04;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws Exception {
        // data.txt 파일의 경로(Path) 객체 얻기
        Path path = Paths.get(
                StreamExample.class.getResource("data.txt").toURI()
        );

        // 한 행씩 읽으면서 문자열 스트림 생성 (UTF-8)
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(line -> System.out.println(line));

        stream.close();  // 파일 핸들 해제
    }
}