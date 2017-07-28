package com.restfull.serviceupload.fileupload;

public class StorageFileNotFoundException extends StorageException {

	/*
	 * Storage file code was taken from Spring.io github 
	 * https://github.com/spring-guides/gs-uploading-files
	 * 
	 */

	public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}