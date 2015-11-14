package com.dpilipenko.post.commons;

import java.io.Serializable;

import com.dpilipenko.post.commons.IMessage;

public interface IEnvelope<T> extends Serializable {
	public String getFromAddress();
	public void setFromAddress(String fromAddress);
	public String getToAddress();
	public void setToAddress(String toAddress);
	public IMessage<T> getMessage();
	public void setMessage(IMessage<T> message);
}
