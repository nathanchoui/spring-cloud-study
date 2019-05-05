package personal.nathan;

import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import com.netflix.zuul.monitoring.MonitoringHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author nathan.z
 * @date 2019/5/4.
 */
@Component
public class GroovyRunner implements CommandLineRunner {

    @Value("gateway.groovy.pollingIntervalSeconds")
    private int pollingIntervalSeconds;

    @Value("gateway.groovy.directories")
    private String[] directories;

    @Override
    public void run(String... args) throws Exception {
        MonitoringHelper.initMocks();
        FilterLoader.getInstance().setCompiler(new GroovyCompiler());
        try {
            FilterFileManager.setFilenameFilter(new GroovyFileFilter());
            FilterFileManager.init(pollingIntervalSeconds, directories);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
