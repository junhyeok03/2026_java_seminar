package ch18.sec08;

import java.io.*;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        // DataOutputStream 생성
        FileOutputStream fos = new FileOutputStream("/Users/heojunhyeok/Downloads/primitive.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        // 기본 타입 출력
        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);            // ⭐ writeInt로 수정

        dos.writeUTF("감자바");
        dos.writeDouble(90.3);
        dos.writeInt(2);            // ⭐ writeInt로 수정

        dos.flush();
        dos.close();
        fos.close();

        // DataInputStream 생성
        FileInputStream fis = new FileInputStream("/Users/heojunhyeok/Downloads/primitive.txt");
        DataInputStream dis = new DataInputStream(fis);

        // 기본 타입 입력
        for (int i = 0; i < 2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();   // ⭐ ;2 제거
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }

        dis.close();
        fis.close();
    }
}