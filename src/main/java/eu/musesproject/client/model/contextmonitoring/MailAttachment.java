package eu.musesproject.client.model.contextmonitoring;

public class MailAttachment {
	private String fileName;
	private String fileType;
	/** size + unit (e.g. kb, mb, gb) */
	private String fileSize;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	} 
}