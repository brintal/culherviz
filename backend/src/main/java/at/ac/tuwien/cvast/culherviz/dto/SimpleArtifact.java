package at.ac.tuwien.cvast.culherviz.dto;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;

public interface SimpleArtifact {

    String getTitle();

    @Value("#{target.location.latitude}")
    Double getLatitude();

    @Value("#{target.location.longitude}")
    Double getLongitude();

}
