package utils;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(LoadType.FIRST)
@Sources({"classpath:env.${env}.properties"
})
public interface Environments extends Config {

    @Key("DESKTOP_WEB.URL")
    String WEB_URL();

    @Key("location")
    @DefaultValue("lc")
    String RUN_LOCATION();

    @Key("page.time_out")
    @DefaultValue("30")
    long TIME_OUTS();

    @Key("BS.USER")
    String BS_USER();

    @Key("BS.KEY")
    String BS_KEY();

    @Key("USERNAME")
    String USERNAME();

    @Key("PASSWORD")
    String PASSWORD();
}
