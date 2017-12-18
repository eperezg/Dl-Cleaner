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

package com.liferay.dl.cleaner.service.base;

import com.liferay.dl.cleaner.service.WcReferencedFileLocalServiceUtil;

import java.util.Arrays;

/**
 * @author guywandji
 * @generated
 */
public class WcReferencedFileLocalServiceClpInvoker {
	public WcReferencedFileLocalServiceClpInvoker() {
		_methodName0 = "addWcReferencedFile";

		_methodParameterTypes0 = new String[] {
				"com.liferay.dl.cleaner.model.WcReferencedFile"
			};

		_methodName1 = "createWcReferencedFile";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteWcReferencedFile";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteWcReferencedFile";

		_methodParameterTypes3 = new String[] {
				"com.liferay.dl.cleaner.model.WcReferencedFile"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchWcReferencedFile";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getWcReferencedFile";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getWcReferencedFiles";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getWcReferencedFilesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateWcReferencedFile";

		_methodParameterTypes15 = new String[] {
				"com.liferay.dl.cleaner.model.WcReferencedFile"
			};

		_methodName40 = "getBeanIdentifier";

		_methodParameterTypes40 = new String[] {  };

		_methodName41 = "setBeanIdentifier";

		_methodParameterTypes41 = new String[] { "java.lang.String" };

		_methodName46 = "addWcReferencedFile";

		_methodParameterTypes46 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "boolean"
			};

		_methodName47 = "getWcReferencedFilesByGroupId";

		_methodParameterTypes47 = new String[] { "long", "int", "int" };

		_methodName48 = "getWcReferencedFilesByGroupAndFileUUID";

		_methodParameterTypes48 = new String[] { "long", "java.lang.String" };

		_methodName49 = "countWcReferencedFilesByGroupId";

		_methodParameterTypes49 = new String[] { "long" };

		_methodName50 = "getWcReferencedFilesByCompanyAndFileUUID";

		_methodParameterTypes50 = new String[] { "long", "java.lang.String" };

		_methodName51 = "removeWcReferencedFile";

		_methodParameterTypes51 = new String[] { "long" };

		_methodName52 = "cleanAll";

		_methodParameterTypes52 = new String[] {  };

		_methodName53 = "getWcReferencedFilesByCompanyIdAndOrphan";

		_methodParameterTypes53 = new String[] { "long", "boolean", "int", "int" };

		_methodName54 = "countWcReferencedFilesByCompanyIdAndOrphan";

		_methodParameterTypes54 = new String[] { "long", "boolean" };

		_methodName55 = "searchWcReferencedFiles";

		_methodParameterTypes55 = new String[] {
				"java.lang.String", "long", "long", "boolean",
				"java.lang.String", "java.lang.String", "int", "int"
			};

		_methodName56 = "countSearchWcReferencedFiles";

		_methodParameterTypes56 = new String[] {
				"java.lang.String", "long", "long", "boolean"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.addWcReferencedFile((com.liferay.dl.cleaner.model.WcReferencedFile)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.createWcReferencedFile(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.deleteWcReferencedFile(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.deleteWcReferencedFile((com.liferay.dl.cleaner.model.WcReferencedFile)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.fetchWcReferencedFile(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.getWcReferencedFile(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.getWcReferencedFiles(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.getWcReferencedFilesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.updateWcReferencedFile((com.liferay.dl.cleaner.model.WcReferencedFile)arguments[0]);
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			WcReferencedFileLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.addWcReferencedFile(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4],
				((Boolean)arguments[5]).booleanValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.getWcReferencedFilesByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.getWcReferencedFilesByGroupAndFileUUID(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.countWcReferencedFilesByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.getWcReferencedFilesByCompanyAndFileUUID(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
			WcReferencedFileLocalServiceUtil.removeWcReferencedFile(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			WcReferencedFileLocalServiceUtil.cleanAll();

			return null;
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.getWcReferencedFilesByCompanyIdAndOrphan(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.countWcReferencedFilesByCompanyIdAndOrphan(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.searchWcReferencedFiles((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Boolean)arguments[3]).booleanValue(),
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			return WcReferencedFileLocalServiceUtil.countSearchWcReferencedFiles((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Boolean)arguments[3]).booleanValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
	private String _methodName51;
	private String[] _methodParameterTypes51;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
	private String _methodName56;
	private String[] _methodParameterTypes56;
}