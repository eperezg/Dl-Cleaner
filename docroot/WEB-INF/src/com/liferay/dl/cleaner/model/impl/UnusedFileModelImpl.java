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

package com.liferay.dl.cleaner.model.impl;

import com.liferay.dl.cleaner.model.UnusedFile;
import com.liferay.dl.cleaner.model.UnusedFileModel;
import com.liferay.dl.cleaner.model.UnusedFileSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the UnusedFile service. Represents a row in the &quot;DlCleaner_UnusedFile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.dl.cleaner.model.UnusedFileModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UnusedFileImpl}.
 * </p>
 *
 * @author guywandji
 * @see UnusedFileImpl
 * @see com.liferay.dl.cleaner.model.UnusedFile
 * @see com.liferay.dl.cleaner.model.UnusedFileModel
 * @generated
 */
@JSON(strict = true)
public class UnusedFileModelImpl extends BaseModelImpl<UnusedFile>
	implements UnusedFileModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a unused file model instance should use the {@link com.liferay.dl.cleaner.model.UnusedFile} interface instead.
	 */
	public static final String TABLE_NAME = "DlCleaner_UnusedFile";
	public static final Object[][] TABLE_COLUMNS = {
			{ "unusedFileId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "fileEntryId", Types.BIGINT },
			{ "dlFileVersionId", Types.BIGINT },
			{ "dlFileTitle", Types.VARCHAR },
			{ "dlFileUuId", Types.VARCHAR },
			{ "deleted", Types.BOOLEAN },
			{ "comment_", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DlCleaner_UnusedFile (unusedFileId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,fileEntryId LONG,dlFileVersionId LONG,dlFileTitle VARCHAR(75) null,dlFileUuId VARCHAR(75) null,deleted BOOLEAN,comment_ STRING null)";
	public static final String TABLE_SQL_DROP = "drop table DlCleaner_UnusedFile";
	public static final String ORDER_BY_JPQL = " ORDER BY unusedFile.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY DlCleaner_UnusedFile.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.dl.cleaner.model.UnusedFile"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.dl.cleaner.model.UnusedFile"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.dl.cleaner.model.UnusedFile"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long DELETED_COLUMN_BITMASK = 2L;
	public static long DLFILEVERSIONID_COLUMN_BITMASK = 4L;
	public static long FILEENTRYID_COLUMN_BITMASK = 8L;
	public static long GROUPID_COLUMN_BITMASK = 16L;
	public static long CREATEDATE_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static UnusedFile toModel(UnusedFileSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		UnusedFile model = new UnusedFileImpl();

		model.setUnusedFileId(soapModel.getUnusedFileId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setFileEntryId(soapModel.getFileEntryId());
		model.setDlFileVersionId(soapModel.getDlFileVersionId());
		model.setDlFileTitle(soapModel.getDlFileTitle());
		model.setDlFileUuId(soapModel.getDlFileUuId());
		model.setDeleted(soapModel.getDeleted());
		model.setComment(soapModel.getComment());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<UnusedFile> toModels(UnusedFileSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<UnusedFile> models = new ArrayList<UnusedFile>(soapModels.length);

		for (UnusedFileSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.dl.cleaner.model.UnusedFile"));

	public UnusedFileModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _unusedFileId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUnusedFileId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _unusedFileId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return UnusedFile.class;
	}

	@Override
	public String getModelClassName() {
		return UnusedFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("unusedFileId", getUnusedFileId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("dlFileVersionId", getDlFileVersionId());
		attributes.put("dlFileTitle", getDlFileTitle());
		attributes.put("dlFileUuId", getDlFileUuId());
		attributes.put("deleted", getDeleted());
		attributes.put("comment", getComment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long unusedFileId = (Long)attributes.get("unusedFileId");

		if (unusedFileId != null) {
			setUnusedFileId(unusedFileId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Long dlFileVersionId = (Long)attributes.get("dlFileVersionId");

		if (dlFileVersionId != null) {
			setDlFileVersionId(dlFileVersionId);
		}

		String dlFileTitle = (String)attributes.get("dlFileTitle");

		if (dlFileTitle != null) {
			setDlFileTitle(dlFileTitle);
		}

		String dlFileUuId = (String)attributes.get("dlFileUuId");

		if (dlFileUuId != null) {
			setDlFileUuId(dlFileUuId);
		}

		Boolean deleted = (Boolean)attributes.get("deleted");

		if (deleted != null) {
			setDeleted(deleted);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}
	}

	@JSON
	@Override
	public long getUnusedFileId() {
		return _unusedFileId;
	}

	@Override
	public void setUnusedFileId(long unusedFileId) {
		_unusedFileId = unusedFileId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getFileEntryId() {
		return _fileEntryId;
	}

	@Override
	public void setFileEntryId(long fileEntryId) {
		_columnBitmask |= FILEENTRYID_COLUMN_BITMASK;

		if (!_setOriginalFileEntryId) {
			_setOriginalFileEntryId = true;

			_originalFileEntryId = _fileEntryId;
		}

		_fileEntryId = fileEntryId;
	}

	public long getOriginalFileEntryId() {
		return _originalFileEntryId;
	}

	@JSON
	@Override
	public long getDlFileVersionId() {
		return _dlFileVersionId;
	}

	@Override
	public void setDlFileVersionId(long dlFileVersionId) {
		_columnBitmask |= DLFILEVERSIONID_COLUMN_BITMASK;

		if (!_setOriginalDlFileVersionId) {
			_setOriginalDlFileVersionId = true;

			_originalDlFileVersionId = _dlFileVersionId;
		}

		_dlFileVersionId = dlFileVersionId;
	}

	public long getOriginalDlFileVersionId() {
		return _originalDlFileVersionId;
	}

	@JSON
	@Override
	public String getDlFileTitle() {
		if (_dlFileTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _dlFileTitle;
		}
	}

	@Override
	public void setDlFileTitle(String dlFileTitle) {
		_dlFileTitle = dlFileTitle;
	}

	@JSON
	@Override
	public String getDlFileUuId() {
		if (_dlFileUuId == null) {
			return StringPool.BLANK;
		}
		else {
			return _dlFileUuId;
		}
	}

	@Override
	public void setDlFileUuId(String dlFileUuId) {
		_dlFileUuId = dlFileUuId;
	}

	@JSON
	@Override
	public boolean getDeleted() {
		return _deleted;
	}

	@Override
	public boolean isDeleted() {
		return _deleted;
	}

	@Override
	public void setDeleted(boolean deleted) {
		_columnBitmask |= DELETED_COLUMN_BITMASK;

		if (!_setOriginalDeleted) {
			_setOriginalDeleted = true;

			_originalDeleted = _deleted;
		}

		_deleted = deleted;
	}

	public boolean getOriginalDeleted() {
		return _originalDeleted;
	}

	@JSON
	@Override
	public String getComment() {
		if (_comment == null) {
			return StringPool.BLANK;
		}
		else {
			return _comment;
		}
	}

	@Override
	public void setComment(String comment) {
		_comment = comment;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			UnusedFile.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UnusedFile toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (UnusedFile)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UnusedFileImpl unusedFileImpl = new UnusedFileImpl();

		unusedFileImpl.setUnusedFileId(getUnusedFileId());
		unusedFileImpl.setGroupId(getGroupId());
		unusedFileImpl.setCompanyId(getCompanyId());
		unusedFileImpl.setUserId(getUserId());
		unusedFileImpl.setUserName(getUserName());
		unusedFileImpl.setCreateDate(getCreateDate());
		unusedFileImpl.setModifiedDate(getModifiedDate());
		unusedFileImpl.setFileEntryId(getFileEntryId());
		unusedFileImpl.setDlFileVersionId(getDlFileVersionId());
		unusedFileImpl.setDlFileTitle(getDlFileTitle());
		unusedFileImpl.setDlFileUuId(getDlFileUuId());
		unusedFileImpl.setDeleted(getDeleted());
		unusedFileImpl.setComment(getComment());

		unusedFileImpl.resetOriginalValues();

		return unusedFileImpl;
	}

	@Override
	public int compareTo(UnusedFile unusedFile) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), unusedFile.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UnusedFile)) {
			return false;
		}

		UnusedFile unusedFile = (UnusedFile)obj;

		long primaryKey = unusedFile.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		UnusedFileModelImpl unusedFileModelImpl = this;

		unusedFileModelImpl._originalGroupId = unusedFileModelImpl._groupId;

		unusedFileModelImpl._setOriginalGroupId = false;

		unusedFileModelImpl._originalCompanyId = unusedFileModelImpl._companyId;

		unusedFileModelImpl._setOriginalCompanyId = false;

		unusedFileModelImpl._originalFileEntryId = unusedFileModelImpl._fileEntryId;

		unusedFileModelImpl._setOriginalFileEntryId = false;

		unusedFileModelImpl._originalDlFileVersionId = unusedFileModelImpl._dlFileVersionId;

		unusedFileModelImpl._setOriginalDlFileVersionId = false;

		unusedFileModelImpl._originalDeleted = unusedFileModelImpl._deleted;

		unusedFileModelImpl._setOriginalDeleted = false;

		unusedFileModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<UnusedFile> toCacheModel() {
		UnusedFileCacheModel unusedFileCacheModel = new UnusedFileCacheModel();

		unusedFileCacheModel.unusedFileId = getUnusedFileId();

		unusedFileCacheModel.groupId = getGroupId();

		unusedFileCacheModel.companyId = getCompanyId();

		unusedFileCacheModel.userId = getUserId();

		unusedFileCacheModel.userName = getUserName();

		String userName = unusedFileCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			unusedFileCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			unusedFileCacheModel.createDate = createDate.getTime();
		}
		else {
			unusedFileCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			unusedFileCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			unusedFileCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		unusedFileCacheModel.fileEntryId = getFileEntryId();

		unusedFileCacheModel.dlFileVersionId = getDlFileVersionId();

		unusedFileCacheModel.dlFileTitle = getDlFileTitle();

		String dlFileTitle = unusedFileCacheModel.dlFileTitle;

		if ((dlFileTitle != null) && (dlFileTitle.length() == 0)) {
			unusedFileCacheModel.dlFileTitle = null;
		}

		unusedFileCacheModel.dlFileUuId = getDlFileUuId();

		String dlFileUuId = unusedFileCacheModel.dlFileUuId;

		if ((dlFileUuId != null) && (dlFileUuId.length() == 0)) {
			unusedFileCacheModel.dlFileUuId = null;
		}

		unusedFileCacheModel.deleted = getDeleted();

		unusedFileCacheModel.comment = getComment();

		String comment = unusedFileCacheModel.comment;

		if ((comment != null) && (comment.length() == 0)) {
			unusedFileCacheModel.comment = null;
		}

		return unusedFileCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{unusedFileId=");
		sb.append(getUnusedFileId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append(", dlFileVersionId=");
		sb.append(getDlFileVersionId());
		sb.append(", dlFileTitle=");
		sb.append(getDlFileTitle());
		sb.append(", dlFileUuId=");
		sb.append(getDlFileUuId());
		sb.append(", deleted=");
		sb.append(getDeleted());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.liferay.dl.cleaner.model.UnusedFile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>unusedFileId</column-name><column-value><![CDATA[");
		sb.append(getUnusedFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dlFileVersionId</column-name><column-value><![CDATA[");
		sb.append(getDlFileVersionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dlFileTitle</column-name><column-value><![CDATA[");
		sb.append(getDlFileTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dlFileUuId</column-name><column-value><![CDATA[");
		sb.append(getDlFileUuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deleted</column-name><column-value><![CDATA[");
		sb.append(getDeleted());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = UnusedFile.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			UnusedFile.class
		};
	private long _unusedFileId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _fileEntryId;
	private long _originalFileEntryId;
	private boolean _setOriginalFileEntryId;
	private long _dlFileVersionId;
	private long _originalDlFileVersionId;
	private boolean _setOriginalDlFileVersionId;
	private String _dlFileTitle;
	private String _dlFileUuId;
	private boolean _deleted;
	private boolean _originalDeleted;
	private boolean _setOriginalDeleted;
	private String _comment;
	private long _columnBitmask;
	private UnusedFile _escapedModel;
}