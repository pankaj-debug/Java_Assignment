package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Posts {
	@Id
	private Long postId;
	private String postName;
	private String postDesc;
	
	public Posts() {
		  
    }
 
    public Posts(Long postId,String postName, String postDesc) {
    	this.postId=postId;
        this.postName = postName;
        this.postDesc = postDesc;
    }

	public Long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getPostDesc() {
		return postDesc;
	}
	public void setPostDesc(String postDesc) {
		this.postDesc = postDesc;
	}	
	
	@Override
    public String toString() {
        return "Posts [id=" + postId + ", Post Name=" + postName + ", Post Desc=" + postDesc + "]";
}
}