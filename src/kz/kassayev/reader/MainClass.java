package kz.kassayev.reader;

import kz.kassayev.reader.Report.ReportDigits;
import kz.kassayev.reader.file.Read;

/**
 * @author serzhan
 */
public class MainClass {
    public static void main(String[] args) {
        Read read = new Read("file.txt");
        ReportDigits reportDigits = new ReportDigits();
        reportDigits.getResult(read.getReadNumbers());
    }
}
