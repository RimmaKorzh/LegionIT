package pages;

public abstract class Page {



    private String pageName;
    private int pageId =54;
    private String URL;




public Page(String pageName, int pageId, String URL){
    this.pageName = pageName;
    this.pageId = pageId;
    this.URL = URL;

}
public Page(){

}
public  int getPageId(){
    return  pageId;
}
//public void setPageId(int pageId){
//    this.pageId =pageId;
//}
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    public String getPageName() {
        return pageName;
    }

    public String getURL() {
        return URL;
    }

    public void openPage(){

        System.out.println(String.format("Page %s was opened", pageName));
    }
    public void closePage(){

        System.out.println(String.format("Page %s was closed", pageName));
    }
    public void clickButton(String buttonName){
        System.out.println(String.format("button %s was clicked", buttonName));
    }

    public abstract void getDeveloperName();

    }



