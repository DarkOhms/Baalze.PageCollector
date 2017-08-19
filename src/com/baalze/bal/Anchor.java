package com.baalze.bal;

import java.sql.Timestamp;

public class Anchor {
	private Domain domain;
	private String anchorHash;
	private String anchorUrl;
	private int scanStatus;
	private boolean activated;
	private Timestamp created;
	private Timestamp modified;
	
	public Anchor(Domain domain, String anchorHash, String anchorUrl) {
		super();
		this.domain = domain;
		this.anchorHash = anchorHash;
		this.anchorUrl = anchorUrl;
	}

	public Anchor(Domain domain, String anchorHash, String anchorUrl, int scanStatus, boolean activated,
			Timestamp created, Timestamp modified) {
		super();
		this.domain = domain;
		this.anchorHash = anchorHash;
		this.anchorUrl = anchorUrl;
		this.scanStatus = scanStatus;
		this.activated = activated;
		this.created = created;
		this.modified = modified;
	}

	public Domain getDomain() {
		return domain;
	}

	public String getAnchorHash() {
		return anchorHash;
	}

	public String getAnchorUrl() {
		return anchorUrl;
	}

	public int getScanStatus() {
		return scanStatus;
	}

	public boolean isActivated() {
		return activated;
	}

	public Timestamp getCreated() {
		return created;
	}

	public Timestamp getModified() {
		return modified;
	}
	
	
	
	
}
