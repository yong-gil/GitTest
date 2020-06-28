package com.board.test.dto;

public class MemberDto {

	private int mNumber;
	private String mName;
	private String mId;
	private String mPwd;
	private String gender;
	
	
	public MemberDto(int mNumber, String mName, String mId, String mPwd, String gender) {
		super();
		this.mNumber = mNumber;
		this.mName = mName;
		this.mId = mId;
		this.mPwd = mPwd;
		this.gender = gender;
	}
	public int getmNumber() {
		return mNumber;
	}
	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPwd() {
		return mPwd;
	}
	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "MemberDto [mNumber=" + mNumber + ", mName=" + mName + ", mId=" + mId + ", mPwd=" + mPwd + ", gender="
				+ gender + "]";
	}
	
	
	
}
