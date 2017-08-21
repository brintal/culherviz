package at.ac.tuwien.cvast.culherviz;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Artifact;
import at.ac.tuwien.cvast.culherviz.persistence.repo.ArtifactRepository;
import at.ac.tuwien.cvast.culherviz.persistence.repo.KeywordRepository;
import at.ac.tuwien.cvast.culherviz.service.ArtifactService;
import at.ac.tuwien.cvast.culherviz.service.KeywordService;
import at.ac.tuwien.cvast.culherviz.service.OnbFileDownloader;
import at.ac.tuwien.cvast.culherviz.service.OnbParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CulhervizApplicationTests {


    @Autowired
    OnbParser onbParser;

    @Test
    public void contextLoads() {
//        onbParser.updateAllTitles();
    }

}
