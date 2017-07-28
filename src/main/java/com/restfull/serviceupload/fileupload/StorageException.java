package com.restfull.serviceupload.fileupload;

/*
 * Storage file code was taken from Spring.io github 
 * https://github.com/spring-guides/gs-uploading-files
 * 
 */

public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
