package com.restfull.serviceupload.fileupload;
/*
 * Storage file code was taken from Spring.io github 
 * https://github.com/spring-guides/gs-uploading-files
 * 
 */

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    void init();

    void store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();

}
