package eu.musesproject.client.model.contextmonitoring;

import java.util.ArrayList;
import java.util.List;

public class MailContent {
	private String from;
    private String to;
    private String cc;
    private String bcc;
    private String subject;
    private List<MailAttachment> attachments;
    
    public MailContent() {
    	attachments = new ArrayList<MailAttachment>();
    }
    
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public String getCc() {
		return cc;
	}
	
	public void setCc(String cc) {
		this.cc = cc;
	}
	
	public String getBcc() {
		return bcc;
	}
	
	public void setBcc(String bcc) {
		this.bcc = bcc;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public List<MailAttachment> getAttachments() {
		return attachments;
	}
	
	public void setAttachments(List<MailAttachment> attachments) {
		this.attachments = attachments;
	}
	
	public void addMailAttachmentItem(MailAttachment attachment) {
		attachments.add(attachment);
	}
	
	public void removeMailAttachmentItem(int pos) {
		if(attachments.size() > 0) {
			attachments.remove(pos);
		}
	}
}