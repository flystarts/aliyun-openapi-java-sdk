/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudphoto.model.v20170711;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphoto.transform.v20170711.ListPhotosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPhotosResponse extends AcsResponse {

	private String code;

	private String message;

	private String nextCursor;

	private Integer totalCount;

	private String requestId;

	private String action;

	private List<Photo> photos;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNextCursor() {
		return this.nextCursor;
	}

	public void setNextCursor(String nextCursor) {
		this.nextCursor = nextCursor;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<Photo> getPhotos() {
		return this.photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public static class Photo {

		private Long id;

		private String title;

		private String fileId;

		private String state;

		private String md5;

		private Boolean isVideo;

		private String remark;

		private Long width;

		private Long height;

		private Long ctime;

		private Long mtime;

		private Long takenAt;

		private Long inactiveTime;

		private Long shareExpireTime;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getMd5() {
			return this.md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public Boolean getIsVideo() {
			return this.isVideo;
		}

		public void setIsVideo(Boolean isVideo) {
			this.isVideo = isVideo;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public Long getCtime() {
			return this.ctime;
		}

		public void setCtime(Long ctime) {
			this.ctime = ctime;
		}

		public Long getMtime() {
			return this.mtime;
		}

		public void setMtime(Long mtime) {
			this.mtime = mtime;
		}

		public Long getTakenAt() {
			return this.takenAt;
		}

		public void setTakenAt(Long takenAt) {
			this.takenAt = takenAt;
		}

		public Long getInactiveTime() {
			return this.inactiveTime;
		}

		public void setInactiveTime(Long inactiveTime) {
			this.inactiveTime = inactiveTime;
		}

		public Long getShareExpireTime() {
			return this.shareExpireTime;
		}

		public void setShareExpireTime(Long shareExpireTime) {
			this.shareExpireTime = shareExpireTime;
		}
	}

	@Override
	public ListPhotosResponse getInstance(UnmarshallerContext context) {
		return	ListPhotosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
