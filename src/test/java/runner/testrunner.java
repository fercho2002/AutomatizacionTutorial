package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue =  "selGlueCode",
        plugin = {"json:test/report/cucumber_report.json"}

)

public class testrunner {

    @AfterClass
    public static void abrirReporte(){
        try {
            System.out.println("se va a ejecutar el reporte ");
           String[] cmd = {"cmd.exe","/c","npm run report"};
           Runtime.getRuntime().exec(cmd);
        }catch (Exception e){
            System.out.println("error al abrir el reporte "+e);
        }
    }
}
