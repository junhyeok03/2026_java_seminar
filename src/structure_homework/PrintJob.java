package structure_homework;

public class PrintJob {
    private static int counter = 1;
    private final int jobId;
    private final String fileName;
    private final int pages;
    private final String userId;

    public PrintJob(String fileName, int pages, String userId) {
        this.jobId = counter++;
        this.fileName = fileName;
        this.pages = pages;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return String.format("[작업#%d] %s (%d페이지, %s)",
                jobId, fileName, pages, userId);
    }
}
