package structure_homework;

public class PrinterSimulation {
    public static void main(String[] args) {
        PrinterQueue printer = new PrinterQueue();

        printer.addJob(new PrintJob("보고서.pdf", 5, "user01"));
        printer.addJob(new PrintJob("강의자료.pptx", 12, "user02"));
        printer.addJob(new PrintJob("이력서.docx", 2, "user03"));

        System.out.println("\n--- 인쇄 처리 시작 ---");
        printer.processAll();
    }
}
