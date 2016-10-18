


public class PrinterScannerRunner {
    public static void main(String args[]) {
        PrinterScanner printerScanner = new AdapterJavaToPrinterScanner();

        printerScanner.print();
        printerScanner.scan();
        printerScanner.photocopy();
    }
}
