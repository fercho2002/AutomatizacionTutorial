package BrowserManager;




public class driverManagerFactory {
    public static DriverManager getManager(DriverType type){

        DriverManager driverManager = null;
        switch (type){
            case CHROME:
                driverManager = new chromeDriverManager();
                break;
            case EDGE:
                driverManager = new edgeDriverManager();
                break;
            default:
                System.out.println("error al buscar el browserDriver ");
                break;
        }
        return driverManager;
    }
}
