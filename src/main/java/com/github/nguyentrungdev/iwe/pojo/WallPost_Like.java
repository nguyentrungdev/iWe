package com.github.nguyentrungdev.iwe.pojo;

import javax.persistence.Entity;
import javax.persistence.IdClass;

@Entity @IdClass(Like.class)
public class WallPost_Like extends Like{
	private long wallPost_Id;

	public long getWallPost_Id() {
		return wallPost_Id;
	}

	public void setWallPost_Id(long wallPost_Id) {
		this.wallPost_Id = wallPost_Id;
	}
}
