
public class BagTracker {
    public static void main(String args[]) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everyfing is OK",Priority.ROUTINE);
        reportNotifier.notifyManager("Somthing was wrong",Priority.IMPORTANT);
        reportNotifier.notifyManager("We have a problem", Priority.ASAP);
    }
}
