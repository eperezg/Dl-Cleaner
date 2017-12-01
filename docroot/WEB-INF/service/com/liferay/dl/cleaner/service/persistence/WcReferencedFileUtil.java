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

import com.liferay.dl.cleaner.model.WcReferencedFile;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the wc referenced file service. This utility wraps {@link WcReferencedFilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guywandji
 * @see WcReferencedFilePersistence
 * @see WcReferencedFilePersistenceImpl
 * @generated
 */
public class WcReferencedFileUtil {
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
	public static void clearCache(WcReferencedFile wcReferencedFile) {
		getPersistence().clearCache(wcReferencedFile);
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
	public static List<WcReferencedFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WcReferencedFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WcReferencedFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static WcReferencedFile update(WcReferencedFile wcReferencedFile)
		throws SystemException {
		return getPersistence().update(wcReferencedFile);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static WcReferencedFile update(WcReferencedFile wcReferencedFile,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(wcReferencedFile, serviceContext);
	}

	/**
	* Returns the wc referenced file where groupId = &#63; and dlFileUuId = &#63; or throws a {@link com.liferay.dl.cleaner.NoSuchWcReferencedFileException} if it could not be found.
	*
	* @param groupId the group ID
	* @param dlFileUuId the dl file uu ID
	* @return the matching wc referenced file
	* @throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile findByGroup_dlFileUuId(
		long groupId, java.lang.String dlFileUuId)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup_dlFileUuId(groupId, dlFileUuId);
	}

	/**
	* Returns the wc referenced file where groupId = &#63; and dlFileUuId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param dlFileUuId the dl file uu ID
	* @return the matching wc referenced file, or <code>null</code> if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile fetchByGroup_dlFileUuId(
		long groupId, java.lang.String dlFileUuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroup_dlFileUuId(groupId, dlFileUuId);
	}

	/**
	* Returns the wc referenced file where groupId = &#63; and dlFileUuId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param dlFileUuId the dl file uu ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching wc referenced file, or <code>null</code> if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile fetchByGroup_dlFileUuId(
		long groupId, java.lang.String dlFileUuId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroup_dlFileUuId(groupId, dlFileUuId,
			retrieveFromCache);
	}

	/**
	* Removes the wc referenced file where groupId = &#63; and dlFileUuId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dlFileUuId the dl file uu ID
	* @return the wc referenced file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile removeByGroup_dlFileUuId(
		long groupId, java.lang.String dlFileUuId)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByGroup_dlFileUuId(groupId, dlFileUuId);
	}

	/**
	* Returns the number of wc referenced files where groupId = &#63; and dlFileUuId = &#63;.
	*
	* @param groupId the group ID
	* @param dlFileUuId the dl file uu ID
	* @return the number of matching wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroup_dlFileUuId(long groupId,
		java.lang.String dlFileUuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroup_dlFileUuId(groupId, dlFileUuId);
	}

	/**
	* Returns all the wc referenced files where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.WcReferencedFile> findByGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup(groupId);
	}

	/**
	* Returns a range of all the wc referenced files where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dl.cleaner.model.impl.WcReferencedFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of wc referenced files
	* @param end the upper bound of the range of wc referenced files (not inclusive)
	* @return the range of matching wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.WcReferencedFile> findByGroup(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the wc referenced files where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dl.cleaner.model.impl.WcReferencedFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of wc referenced files
	* @param end the upper bound of the range of wc referenced files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.WcReferencedFile> findByGroup(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first wc referenced file in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wc referenced file
	* @throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile findByGroup_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup_First(groupId, orderByComparator);
	}

	/**
	* Returns the first wc referenced file in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wc referenced file, or <code>null</code> if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile fetchByGroup_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroup_First(groupId, orderByComparator);
	}

	/**
	* Returns the last wc referenced file in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wc referenced file
	* @throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile findByGroup_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last wc referenced file in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wc referenced file, or <code>null</code> if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile fetchByGroup_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroup_Last(groupId, orderByComparator);
	}

	/**
	* Returns the wc referenced files before and after the current wc referenced file in the ordered set where groupId = &#63;.
	*
	* @param wcRefencedFileId the primary key of the current wc referenced file
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next wc referenced file
	* @throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException if a wc referenced file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile[] findByGroup_PrevAndNext(
		long wcRefencedFileId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup_PrevAndNext(wcRefencedFileId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the wc referenced files where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroup(groupId);
	}

	/**
	* Returns the number of wc referenced files where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroup(groupId);
	}

	/**
	* Returns the wc referenced file where companyId = &#63; and dlFileUuId = &#63; or throws a {@link com.liferay.dl.cleaner.NoSuchWcReferencedFileException} if it could not be found.
	*
	* @param companyId the company ID
	* @param dlFileUuId the dl file uu ID
	* @return the matching wc referenced file
	* @throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile findByCompany_DlFileUuId(
		long companyId, java.lang.String dlFileUuId)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompany_DlFileUuId(companyId, dlFileUuId);
	}

	/**
	* Returns the wc referenced file where companyId = &#63; and dlFileUuId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param dlFileUuId the dl file uu ID
	* @return the matching wc referenced file, or <code>null</code> if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile fetchByCompany_DlFileUuId(
		long companyId, java.lang.String dlFileUuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCompany_DlFileUuId(companyId, dlFileUuId);
	}

	/**
	* Returns the wc referenced file where companyId = &#63; and dlFileUuId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param dlFileUuId the dl file uu ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching wc referenced file, or <code>null</code> if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile fetchByCompany_DlFileUuId(
		long companyId, java.lang.String dlFileUuId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompany_DlFileUuId(companyId, dlFileUuId,
			retrieveFromCache);
	}

	/**
	* Removes the wc referenced file where companyId = &#63; and dlFileUuId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dlFileUuId the dl file uu ID
	* @return the wc referenced file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile removeByCompany_DlFileUuId(
		long companyId, java.lang.String dlFileUuId)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByCompany_DlFileUuId(companyId, dlFileUuId);
	}

	/**
	* Returns the number of wc referenced files where companyId = &#63; and dlFileUuId = &#63;.
	*
	* @param companyId the company ID
	* @param dlFileUuId the dl file uu ID
	* @return the number of matching wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompany_DlFileUuId(long companyId,
		java.lang.String dlFileUuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompany_DlFileUuId(companyId, dlFileUuId);
	}

	/**
	* Returns all the wc referenced files where companyId = &#63; and orphan = &#63;.
	*
	* @param companyId the company ID
	* @param orphan the orphan
	* @return the matching wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.WcReferencedFile> findByCompany_Orphan(
		long companyId, boolean orphan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompany_Orphan(companyId, orphan);
	}

	/**
	* Returns a range of all the wc referenced files where companyId = &#63; and orphan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dl.cleaner.model.impl.WcReferencedFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param orphan the orphan
	* @param start the lower bound of the range of wc referenced files
	* @param end the upper bound of the range of wc referenced files (not inclusive)
	* @return the range of matching wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.WcReferencedFile> findByCompany_Orphan(
		long companyId, boolean orphan, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompany_Orphan(companyId, orphan, start, end);
	}

	/**
	* Returns an ordered range of all the wc referenced files where companyId = &#63; and orphan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dl.cleaner.model.impl.WcReferencedFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param orphan the orphan
	* @param start the lower bound of the range of wc referenced files
	* @param end the upper bound of the range of wc referenced files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.WcReferencedFile> findByCompany_Orphan(
		long companyId, boolean orphan, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompany_Orphan(companyId, orphan, start, end,
			orderByComparator);
	}

	/**
	* Returns the first wc referenced file in the ordered set where companyId = &#63; and orphan = &#63;.
	*
	* @param companyId the company ID
	* @param orphan the orphan
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wc referenced file
	* @throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile findByCompany_Orphan_First(
		long companyId, boolean orphan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompany_Orphan_First(companyId, orphan,
			orderByComparator);
	}

	/**
	* Returns the first wc referenced file in the ordered set where companyId = &#63; and orphan = &#63;.
	*
	* @param companyId the company ID
	* @param orphan the orphan
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wc referenced file, or <code>null</code> if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile fetchByCompany_Orphan_First(
		long companyId, boolean orphan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompany_Orphan_First(companyId, orphan,
			orderByComparator);
	}

	/**
	* Returns the last wc referenced file in the ordered set where companyId = &#63; and orphan = &#63;.
	*
	* @param companyId the company ID
	* @param orphan the orphan
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wc referenced file
	* @throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile findByCompany_Orphan_Last(
		long companyId, boolean orphan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompany_Orphan_Last(companyId, orphan,
			orderByComparator);
	}

	/**
	* Returns the last wc referenced file in the ordered set where companyId = &#63; and orphan = &#63;.
	*
	* @param companyId the company ID
	* @param orphan the orphan
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wc referenced file, or <code>null</code> if a matching wc referenced file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile fetchByCompany_Orphan_Last(
		long companyId, boolean orphan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompany_Orphan_Last(companyId, orphan,
			orderByComparator);
	}

	/**
	* Returns the wc referenced files before and after the current wc referenced file in the ordered set where companyId = &#63; and orphan = &#63;.
	*
	* @param wcRefencedFileId the primary key of the current wc referenced file
	* @param companyId the company ID
	* @param orphan the orphan
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next wc referenced file
	* @throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException if a wc referenced file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile[] findByCompany_Orphan_PrevAndNext(
		long wcRefencedFileId, long companyId, boolean orphan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompany_Orphan_PrevAndNext(wcRefencedFileId,
			companyId, orphan, orderByComparator);
	}

	/**
	* Removes all the wc referenced files where companyId = &#63; and orphan = &#63; from the database.
	*
	* @param companyId the company ID
	* @param orphan the orphan
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompany_Orphan(long companyId, boolean orphan)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompany_Orphan(companyId, orphan);
	}

	/**
	* Returns the number of wc referenced files where companyId = &#63; and orphan = &#63;.
	*
	* @param companyId the company ID
	* @param orphan the orphan
	* @return the number of matching wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompany_Orphan(long companyId, boolean orphan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompany_Orphan(companyId, orphan);
	}

	/**
	* Caches the wc referenced file in the entity cache if it is enabled.
	*
	* @param wcReferencedFile the wc referenced file
	*/
	public static void cacheResult(
		com.liferay.dl.cleaner.model.WcReferencedFile wcReferencedFile) {
		getPersistence().cacheResult(wcReferencedFile);
	}

	/**
	* Caches the wc referenced files in the entity cache if it is enabled.
	*
	* @param wcReferencedFiles the wc referenced files
	*/
	public static void cacheResult(
		java.util.List<com.liferay.dl.cleaner.model.WcReferencedFile> wcReferencedFiles) {
		getPersistence().cacheResult(wcReferencedFiles);
	}

	/**
	* Creates a new wc referenced file with the primary key. Does not add the wc referenced file to the database.
	*
	* @param wcRefencedFileId the primary key for the new wc referenced file
	* @return the new wc referenced file
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile create(
		long wcRefencedFileId) {
		return getPersistence().create(wcRefencedFileId);
	}

	/**
	* Removes the wc referenced file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wcRefencedFileId the primary key of the wc referenced file
	* @return the wc referenced file that was removed
	* @throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException if a wc referenced file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile remove(
		long wcRefencedFileId)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(wcRefencedFileId);
	}

	public static com.liferay.dl.cleaner.model.WcReferencedFile updateImpl(
		com.liferay.dl.cleaner.model.WcReferencedFile wcReferencedFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(wcReferencedFile);
	}

	/**
	* Returns the wc referenced file with the primary key or throws a {@link com.liferay.dl.cleaner.NoSuchWcReferencedFileException} if it could not be found.
	*
	* @param wcRefencedFileId the primary key of the wc referenced file
	* @return the wc referenced file
	* @throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException if a wc referenced file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile findByPrimaryKey(
		long wcRefencedFileId)
		throws com.liferay.dl.cleaner.NoSuchWcReferencedFileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(wcRefencedFileId);
	}

	/**
	* Returns the wc referenced file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param wcRefencedFileId the primary key of the wc referenced file
	* @return the wc referenced file, or <code>null</code> if a wc referenced file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.dl.cleaner.model.WcReferencedFile fetchByPrimaryKey(
		long wcRefencedFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(wcRefencedFileId);
	}

	/**
	* Returns all the wc referenced files.
	*
	* @return the wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.WcReferencedFile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the wc referenced files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dl.cleaner.model.impl.WcReferencedFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wc referenced files
	* @param end the upper bound of the range of wc referenced files (not inclusive)
	* @return the range of wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.WcReferencedFile> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the wc referenced files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dl.cleaner.model.impl.WcReferencedFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wc referenced files
	* @param end the upper bound of the range of wc referenced files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.dl.cleaner.model.WcReferencedFile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the wc referenced files from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of wc referenced files.
	*
	* @return the number of wc referenced files
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static WcReferencedFilePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (WcReferencedFilePersistence)PortletBeanLocatorUtil.locate(com.liferay.dl.cleaner.service.ClpSerializer.getServletContextName(),
					WcReferencedFilePersistence.class.getName());

			ReferenceRegistry.registerReference(WcReferencedFileUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(WcReferencedFilePersistence persistence) {
	}

	private static WcReferencedFilePersistence _persistence;
}