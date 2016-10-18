package Template;

public class WebSiteRunner {
    public static void main(String[] args) {
        WebSiteTemplate whelcomePage = new WhelcomePage();
        WebSiteTemplate newsPage = new NewsPage();

        whelcomePage.showPage();

        newsPage.showPage();
    }
}
