/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.dl.cleaner.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the UnusedFile service. Represents a row in the &quot;DlCleaner_UnusedFile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.dl.cleaner.model.impl.UnusedFileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.dl.cleaner.model.impl.UnusedFileImpl}.
 * </p>
 *
 * @author guywandji
 * @see UnusedFile
 * @see com.liferay.dl.cleaner.model.impl.UnusedFileImpl
 * @see com.liferay.dl.cleaner.model.impl.UnusedFileModelImpl
 * @generated
 */
public interface UnusedFileModel extends BaseModel<UnusedFile>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a unused file model instance should use the {@link UnusedFile} interface instead.
	 */

	/**
	 * Returns the primary key of this unused file.
	 *
	 * @return the primary key of this unused file
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this unused file.
	 *
	 * @param primaryKey the primary key of this unused file
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the unused file ID of this unused file.
	 *
	 * @return the unused file ID of this unused file
	 */
	public long getUnusedFileId();

	/**
	 * Sets the unused file ID of this unused file.
	 *
	 * @param unusedFileId the unused file ID of this unused file
	 */
	public void setUnusedFileId(long unusedFileId);

	/**
	 * Returns the group ID of this unused file.
	 *
	 * @return the group ID of this unused file
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this unused file.
	 *
	 * @param groupId the group ID of this unused file
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this unused file.
	 *
	 * @return the company ID of this unused file
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this unused file.
	 *
	 * @param companyId the company ID of this unused file
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this unused file.
	 *
	 * @return the user ID of this unused file
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this unused file.
	 *
	 * @param userId the user ID of this unused file
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this unused file.
	 *
	 * @return the user uuid of this unused file
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this unused file.
	 *
	 * @param userUuid the user uuid of this unused file
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this unused file.
	 *
	 * @return the user name of this unused file
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this unused file.
	 *
	 * @param userName the user name of this unused file
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this unused file.
	 *
	 * @return the create date of this unused file
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this unused file.
	 *
	 * @param createDate the create date of this unused file
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this unused file.
	 *
	 * @return the modified date of this unused file
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this unused file.
	 *
	 * @param modifiedDate the modified date of this unused file
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the file entry ID of this unused file.
	 *
	 * @return the file entry ID of this unused file
	 */
	public long getFileEntryId();

	/**
	 * Sets the file entry ID of this unused file.
	 *
	 * @param fileEntryId the file entry ID of this unused file
	 */
	public void setFileEntryId(long fileEntryId);

	/**
	 * Returns the dl file version ID of this unused file.
	 *
	 * @return the dl file version ID of this unused file
	 */
	public long getDlFileVersionId();

	/**
	 * Sets the dl file version ID of this unused file.
	 *
	 * @param dlFileVersionId the dl file version ID of this unused file
	 */
	public void setDlFileVersionId(long dlFileVersionId);

	/**
	 * Returns the dl file title of this unused file.
	 *
	 * @return the dl file title of this unused file
	 */
	@AutoEscape
	public String getDlFileTitle();

	/**
	 * Sets the dl file title of this unused file.
	 *
	 * @param dlFileTitle the dl file title of this unused file
	 */
	public void setDlFileTitle(String dlFileTitle);

	/**
	 * Returns the deleted of this unused file.
	 *
	 * @return the deleted of this unused file
	 */
	public Boolean getDeleted();

	/**
	 * Sets the deleted of this unused file.
	 *
	 * @param deleted the deleted of this unused file
	 */
	public void setDeleted(Boolean deleted);

	/**
	 * Returns the comment of this unused file.
	 *
	 * @return the comment of this unused file
	 */
	@AutoEscape
	public String getComment();

	/**
	 * Sets the comment of this unused file.
	 *
	 * @param comment the comment of this unused file
	 */
	public void setComment(String comment);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.dl.cleaner.model.UnusedFile unusedFile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.dl.cleaner.model.UnusedFile> toCacheModel();

	@Override
	public com.liferay.dl.cleaner.model.UnusedFile toEscapedModel();

	@Override
	public com.liferay.dl.cleaner.model.UnusedFile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}