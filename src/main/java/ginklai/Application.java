package ginklai;

import ginklai.model.DBActions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static final String HOME= "/";
    public static final String WEAPONS = "/ginklai";
    public static final String PURPOSE = "/ginklu_paskirtis";
    public static final String PURPOSE_HUNTING ="/ginklai/ginklo_paskirtis/medzioklei";
    public static final String PURPOSE_SELF_DEFENCE= "/ginklai/ginklo_paskirtis/savigynai";
    public static final String PURPOSE_TARGETS="/ginklai/ginklo_paskirtis/taikiniams";
    public static final String TYPE_GRAIZTVINIAI="/ginklai/ginklo_tipas/graiztviniai";
    public static final String TYPE_PISTOLETAI="/ginklai/ginklo_tipas/pistoletai";
    public static final String TYPE_LYGIAVAMZDZIAI="/ginklai/ginklo_tipas/lygiavamzdziai";
    public static final String TYPE_PNEUMATINIAI="/ginklai/ginklo_tipas/pneumatiniai";
    public static final String PAR_MEDZ_GRAIZT="/ginklai/ginklo_parinkimas/medzgraizt";

    public static DBActions sql;
    public static void main(String[] args){
        sql= new DBActions();
        SpringApplication.run(Application.class, args);
    }
}
