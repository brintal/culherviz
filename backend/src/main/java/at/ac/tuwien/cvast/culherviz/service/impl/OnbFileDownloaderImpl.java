package at.ac.tuwien.cvast.culherviz.service.impl;

import at.ac.tuwien.cvast.culherviz.persistence.repo.ArtifactRepository;
import at.ac.tuwien.cvast.culherviz.service.OnbFileDownloader;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;
import java.util.List;

@Component
public class OnbFileDownloaderImpl implements OnbFileDownloader {


    private static final String DOWNLOAD_PATH = "D:/Dev/pictureStore/";


    @Autowired
    ArtifactRepository artifactRepository;

    @Override
    public void downloadAllPictures() {


        List<Integer> ids = artifactRepository.findAllOnbImageIds();

        int counter = 1;
        for (Integer bildId : ids) {

//            Integer bildId = 14596180;
            try {

                if (fileExists(bildId)) {
                    System.out.println(counter++ +" | "+bildId+" (already exists, skipped)");
                    continue;
                }

                File folderMain = new File(DOWNLOAD_PATH + bildId);
                folderMain.mkdir();

                String urlLarge = "http://www.bildarchivaustria.at/Preview/" + bildId + ".jpg";

                FileUtils.copyURLToFile(new URL(urlLarge), new File(folderMain.getAbsolutePath() + "/" + bildId + ".jpg"));


                System.out.println(counter++ +" | "+bildId);
            } catch (Exception e) {
                System.out.println("ERROR while downloading image with bildId " + bildId);
                e.printStackTrace();
            }

        }

    }

    public boolean fileExists(Integer onbImageId) {
        File f = new File(DOWNLOAD_PATH + onbImageId + "/" + onbImageId + ".jpg");
        return f.exists();
    }

@Override
    public void checkPresenceOfAllFiles() {


    List<Integer> ids = artifactRepository.findAllOnbImageIds();


    int counter = 1;
    for (Integer bildId : ids) {
        if (!fileExists(bildId)) {
            System.out.println("no file found for onb image id " + bildId);
        }
            else {
            System.out.println(counter++ +" | "+bildId);
        }


    }
    File f = new File(DOWNLOAD_PATH);
    System.out.println("total folders: "+f.listFiles().length);
    System.out.println(ids.size() +" ids found");
    System.out.println(ids.stream().distinct().count() +" distinct ids found");

}


}
