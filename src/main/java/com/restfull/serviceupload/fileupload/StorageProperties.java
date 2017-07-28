package com.restfull.serviceupload.fileupload;
/*
 * Storage file code was taken from Spring.io github 
 * https://github.com/spring-guides/gs-uploading-files
 * 
 */
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
