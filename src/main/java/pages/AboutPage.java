package pages;

public class AboutPage extends Page {
    String Disclaimer;

    public String getDisclaimer() {
        return Disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        Disclaimer = disclaimer;
    }

    public void getDeveloperName(){
        System.out.println("Mary");
    }

}
