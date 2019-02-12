package uk.ac.ebi.subs.fileupload.fileprocessinglistener.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class FileContentValidatorConfig {

    @Value("${fileProcessing-listener.content-validator.errLogDir}")
    private String errLogDir;

    @Value("${fileProcessing-listener.content-validator.outLogDir}")
    private String outLogDir;

    @Value("${fileProcessing-listener.content-validator.appLogDir}")
    private String appLogDir;

    @Value("${fileProcessing-listener.content-validator.memoryUsage}")
    private String memoryUsage;

    @Value("${fileProcessing-listener.content-validator.jobName}")
    private String jobName;

    @Value("${fileProcessing-listener.profile}")
    private String profile;

    @Value("${fileProcessing-listener.configLocation}")
    private String configLocation;

    //Graylog config
    @Value("#{environment.GRAYLOG_HOST}")
    private String graylogHost;

    @Value("#{environment.GRAYLOG_PORT}")
    private String graylogPort;
}
