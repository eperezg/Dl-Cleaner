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

package com.liferay.dl.cleaner.service.persistence;

import com.liferay.dl.cleaner.model.LostFile;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the lost file service. This utility wraps {@link LostFilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guywandji
 * @see LostFilePersistence
 * @see LostFilePersistenceImpl
 * @generated
 */
public class LostFileUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(LostFile lostFile) {
		getPersistence().clearCache(lostFile);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LostFile> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LostFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LostFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LostFile update(LostFile lostFile) throws SystemException {
		return getPersistence().update(lostFile);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LostFile update(LostFile lostFile,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(lostFile, serviceContext);
	}

	/**
	* Returns the lost file where groupId = &#63; and fileEntryId = &#63; and dlFileVersionId = &#63; or throws a {@link com.liferay.dl.cleaner.NoSuchLostFileException} if it could not be found.
	*
	* @param groupId the group ID
	* @param fileEntryId the file entry ID
	* @param dlFileVersionId the dl file version ID
	* @return the matching lost file
	* @throws com.liferay.dl.cleaner.NoSuchLostFileException if a matching lost file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile findByGroup_FileEntryId_VersionId(
		long groupId, long fileEntryId, long dlFileVersionId)
		throws com.liferay.dl.cleaner.NoSuchLostFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup_FileEntryId_VersionId(groupId, fileEntryId,
			dlFileVersionId);
	}

	/**
	* Returns the lost file where groupId = &#63; and fileEntryId = &#63; and dlFileVersionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param fileEntryId the file entry ID
	* @param dlFileVersionId the dl file version ID
	* @return the matching lost file, or <code>null</code> if a matching lost file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile fetchByGroup_FileEntryId_VersionId(
		long groupId, long fileEntryId, long dlFileVersionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroup_FileEntryId_VersionId(groupId, fileEntryId,
			dlFileVersionId);
	}

	/**
	* Returns the lost file where groupId = &#63; and fileEntryId = &#63; and dlFileVersionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param fileEntryId the file entry ID
	* @param dlFileVersionId the dl file version ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching lost file, or <code>null</code> if a matching lost file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile fetchByGroup_FileEntryId_VersionId(
		long groupId, long fileEntryId, long dlFileVersionId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroup_FileEntryId_VersionId(groupId, fileEntryId,
			dlFileVersionId, retrieveFromCache);
	}

	/**
	* Removes the lost file where groupId = &#63; and fileEntryId = &#63; and dlFileVersionId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param fileEntryId the file entry ID
	* @param dlFileVersionId the dl file version ID
	* @return the lost file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile removeByGroup_FileEntryId_VersionId(
		long groupId, long fileEntryId, long dlFileVersionId)
		throws com.liferay.dl.cleaner.NoSuchLostFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByGroup_FileEntryId_VersionId(groupId, fileEntryId,
			dlFileVersionId);
	}

	/**
	* Returns the number of lost files where groupId = &#63; and fileEntryId = &#63; and dlFileVersionId = &#63;.
	*
	* @param groupId the group ID
	* @param fileEntryId the file entry ID
	* @param dlFileVersionId the dl file version ID
	* @return the number of matching lost files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroup_FileEntryId_VersionId(long groupId,
		long fileEntryId, long dlFileVersionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByGroup_FileEntryId_VersionId(groupId, fileEntryId,
			dlFileVersionId);
	}

	/**
	* Returns all the lost files where groupId = &#63; and deleted = &#63;.
	*
	* @param groupId the group ID
	* @param deleted the deleted
	* @return the matching lost files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.LostFile> findByGroup_Deleted(
		long groupId, java.lang.Boolean deleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup_Deleted(groupId, deleted);
	}

	/**
	* Returns a range of all the lost files where groupId = &#63; and deleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dl.cleaner.model.impl.LostFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param deleted the deleted
	* @param start the lower bound of the range of lost files
	* @param end the upper bound of the range of lost files (not inclusive)
	* @return the range of matching lost files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.LostFile> findByGroup_Deleted(
		long groupId, java.lang.Boolean deleted, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup_Deleted(groupId, deleted, start, end);
	}

	/**
	* Returns an ordered range of all the lost files where groupId = &#63; and deleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dl.cleaner.model.impl.LostFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param deleted the deleted
	* @param start the lower bound of the range of lost files
	* @param end the upper bound of the range of lost files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lost files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.LostFile> findByGroup_Deleted(
		long groupId, java.lang.Boolean deleted, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup_Deleted(groupId, deleted, start, end,
			orderByComparator);
	}

	/**
	* Returns the first lost file in the ordered set where groupId = &#63; and deleted = &#63;.
	*
	* @param groupId the group ID
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lost file
	* @throws com.liferay.dl.cleaner.NoSuchLostFileException if a matching lost file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile findByGroup_Deleted_First(
		long groupId, java.lang.Boolean deleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.dl.cleaner.NoSuchLostFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup_Deleted_First(groupId, deleted,
			orderByComparator);
	}

	/**
	* Returns the first lost file in the ordered set where groupId = &#63; and deleted = &#63;.
	*
	* @param groupId the group ID
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lost file, or <code>null</code> if a matching lost file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile fetchByGroup_Deleted_First(
		long groupId, java.lang.Boolean deleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroup_Deleted_First(groupId, deleted,
			orderByComparator);
	}

	/**
	* Returns the last lost file in the ordered set where groupId = &#63; and deleted = &#63;.
	*
	* @param groupId the group ID
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lost file
	* @throws com.liferay.dl.cleaner.NoSuchLostFileException if a matching lost file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile findByGroup_Deleted_Last(
		long groupId, java.lang.Boolean deleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.dl.cleaner.NoSuchLostFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup_Deleted_Last(groupId, deleted, orderByComparator);
	}

	/**
	* Returns the last lost file in the ordered set where groupId = &#63; and deleted = &#63;.
	*
	* @param groupId the group ID
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lost file, or <code>null</code> if a matching lost file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile fetchByGroup_Deleted_Last(
		long groupId, java.lang.Boolean deleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroup_Deleted_Last(groupId, deleted,
			orderByComparator);
	}

	/**
	* Returns the lost files before and after the current lost file in the ordered set where groupId = &#63; and deleted = &#63;.
	*
	* @param lostFileId the primary key of the current lost file
	* @param groupId the group ID
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lost file
	* @throws com.liferay.dl.cleaner.NoSuchLostFileException if a lost file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile[] findByGroup_Deleted_PrevAndNext(
		long lostFileId, long groupId, java.lang.Boolean deleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.dl.cleaner.NoSuchLostFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup_Deleted_PrevAndNext(lostFileId, groupId,
			deleted, orderByComparator);
	}

	/**
	* Removes all the lost files where groupId = &#63; and deleted = &#63; from the database.
	*
	* @param groupId the group ID
	* @param deleted the deleted
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroup_Deleted(long groupId,
		java.lang.Boolean deleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroup_Deleted(groupId, deleted);
	}

	/**
	* Returns the number of lost files where groupId = &#63; and deleted = &#63;.
	*
	* @param groupId the group ID
	* @param deleted the deleted
	* @return the number of matching lost files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroup_Deleted(long groupId,
		java.lang.Boolean deleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroup_Deleted(groupId, deleted);
	}

	/**
	* Caches the lost file in the entity cache if it is enabled.
	*
	* @param lostFile the lost file
	*/
	public static void cacheResult(
		com.liferay.dl.cleaner.model.LostFile lostFile) {
		getPersistence().cacheResult(lostFile);
	}

	/**
	* Caches the lost files in the entity cache if it is enabled.
	*
	* @param lostFiles the lost files
	*/
	public static void cacheResult(
		java.util.List<com.liferay.dl.cleaner.model.LostFile> lostFiles) {
		getPersistence().cacheResult(lostFiles);
	}

	/**
	* Creates a new lost file with the primary key. Does not add the lost file to the database.
	*
	* @param lostFileId the primary key for the new lost file
	* @return the new lost file
	*/
	public static com.liferay.dl.cleaner.model.LostFile create(long lostFileId) {
		return getPersistence().create(lostFileId);
	}

	/**
	* Removes the lost file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lostFileId the primary key of the lost file
	* @return the lost file that was removed
	* @throws com.liferay.dl.cleaner.NoSuchLostFileException if a lost file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile remove(long lostFileId)
		throws com.liferay.dl.cleaner.NoSuchLostFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(lostFileId);
	}

	public static com.liferay.dl.cleaner.model.LostFile updateImpl(
		com.liferay.dl.cleaner.model.LostFile lostFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lostFile);
	}

	/**
	* Returns the lost file with the primary key or throws a {@link com.liferay.dl.cleaner.NoSuchLostFileException} if it could not be found.
	*
	* @param lostFileId the primary key of the lost file
	* @return the lost file
	* @throws com.liferay.dl.cleaner.NoSuchLostFileException if a lost file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile findByPrimaryKey(
		long lostFileId)
		throws com.liferay.dl.cleaner.NoSuchLostFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(lostFileId);
	}

	/**
	* Returns the lost file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lostFileId the primary key of the lost file
	* @return the lost file, or <code>null</code> if a lost file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.LostFile fetchByPrimaryKey(
		long lostFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(lostFileId);
	}

	/**
	* Returns all the lost files.
	*
	* @return the lost files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.LostFile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lost files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dl.cleaner.model.impl.LostFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lost files
	* @param end the upper bound of the range of lost files (not inclusive)
	* @return the range of lost files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.LostFile> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lost files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dl.cleaner.model.impl.LostFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lost files
	* @param end the upper bound of the range of lost files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lost files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.LostFile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the lost files from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lost files.
	*
	* @return the number of lost files
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LostFilePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LostFilePersistence)PortletBeanLocatorUtil.locate(com.liferay.dl.cleaner.service.ClpSerializer.getServletContextName(),
					LostFilePersistence.class.getName());

			ReferenceRegistry.registerReference(LostFileUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LostFilePersistence persistence) {
	}

	private static LostFilePersistence _persistence;
}