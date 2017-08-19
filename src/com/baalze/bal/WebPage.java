package com.baalze.bal;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebPage {
	private Anchor anchor;
	private String webPageHash;
	private int anchorParseStatus;
	private int emailParseStatus;
	
	private Document document;

	public WebPage(Anchor anchor) {
		super();
		this.anchor = anchor;
	}
	
	public void loadDocumentFromWeb() {
		try {
			
			document = Jsoup.connect(anchor.getAnchorUrl()).get();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
}
