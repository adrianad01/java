package io.reactordevelop.config;
import jakarta.annotation.PostConstruct;
import lombok.NoArgsConstructor;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
@NoArgsConstructor
public class DroolsBeanFactory {
    @Value("${drools.rule.file}")
    private String ruleFile;
    private KieServices kieServices;
    @PostConstruct
    public void init() {
        this.kieServices = KieServices.Factory.get();
    }
    private KieFileSystem getKieFileSystem() {
        KieFileSystem kfs = kieServices.newKieFileSystem();
        kfs.write(ResourceFactory.newClassPathResource(ruleFile));
        return kfs;
    }
    public KieSession getKieSession() {
        KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
        kb.buildAll();
        KieRepository kieRepository = kieServices.getRepository();
        ReleaseId krDefaultReleaseId = kieRepository.getDefaultReleaseId();
        KieContainer kieContainer = kieServices.newKieContainer(krDefaultReleaseId);
        return kieContainer.newKieSession();
    }
}