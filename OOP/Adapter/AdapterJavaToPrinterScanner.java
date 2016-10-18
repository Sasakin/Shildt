

public class AdapterJavaToPrinterScanner extends JavaApplication implements  PrinterScanner {
    @Override
    public void print() {
        printObject();
    }

    @Override
    public void scan() {
        scanObject();
    }

    @Override
    public void photocopy() {
        photocopyObject();
    }
}
