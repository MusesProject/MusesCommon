/*
 * #%L
 * musesclient
 * %%
 * Copyright (C) 2013 - 2014 HITEC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

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