package com.lol.app.bean;


public class SerchBean {

	String id;
	String accountId;
	String puuid;
	String name;
	int profileIconId;
	long revisionDate;
	long summonerLevel;
	public String getId() {
		return id;
	}
	public String getAccountId() {
		return accountId;
	}
	public String getPuuid() {
		return puuid;
	}
	public String getName() {
		return name;
	}
	public int getProfileIconId() {
		return profileIconId;
	}
	public long getRevisionDate() {
		return revisionDate;
	}
	public long getSummonerLevel() {
		return summonerLevel;
	}
	public SerchBean(String id, String accountId, String puuid, String name, int profileIconId, long revisionDate,
			long summonerLevel) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.puuid = puuid;
		this.name = name;
		this.profileIconId = profileIconId;
		this.revisionDate = revisionDate;
		this.summonerLevel = summonerLevel;
	}
	@Override
	public String toString() {
		return "SerchBean [id=" + id + ", accountId=" + accountId + ", puuid=" + puuid + ", name=" + name
				+ ", profileIconId=" + profileIconId + ", revisionDate=" + revisionDate + ", summonerLevel="
				+ summonerLevel + "]";
	}
	
}
