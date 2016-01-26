/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.content.targeting.rule.engine.model.impl;

import com.liferay.content.targeting.rule.engine.model.RuleEngine;
import com.liferay.content.targeting.rule.engine.model.RuleEngineModel;
import com.liferay.content.targeting.rule.engine.model.RuleEngineSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the RuleEngine service. Represents a row in the &quot;RuleEngine_RuleEngine&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.content.targeting.rule.engine.model.RuleEngineModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RuleEngineImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RuleEngineImpl
 * @see com.liferay.content.targeting.rule.engine.model.RuleEngine
 * @see com.liferay.content.targeting.rule.engine.model.RuleEngineModel
 * @generated
 */
@JSON(strict = true)
public class RuleEngineModelImpl extends BaseModelImpl<RuleEngine>
	implements RuleEngineModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a rule engine model instance should use the {@link com.liferay.content.targeting.rule.engine.model.RuleEngine} interface instead.
	 */
	public static final String TABLE_NAME = "RuleEngine_RuleEngine";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "dummyId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table RuleEngine_RuleEngine (uuid_ VARCHAR(75) null,dummyId LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table RuleEngine_RuleEngine";
	public static final String ORDER_BY_JPQL = " ORDER BY ruleEngine.dummyId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY RuleEngine_RuleEngine.dummyId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.content.targeting.rule.engine.model.RuleEngine"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.content.targeting.rule.engine.model.RuleEngine"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.content.targeting.rule.engine.model.RuleEngine"),
			true);
	public static long UUID_COLUMN_BITMASK = 1L;
	public static long DUMMYID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static RuleEngine toModel(RuleEngineSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		RuleEngine model = new RuleEngineImpl();

		model.setUuid(soapModel.getUuid());
		model.setDummyId(soapModel.getDummyId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<RuleEngine> toModels(RuleEngineSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<RuleEngine> models = new ArrayList<RuleEngine>(soapModels.length);

		for (RuleEngineSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.content.targeting.rule.engine.model.RuleEngine"));

	public RuleEngineModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _dummyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDummyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dummyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return RuleEngine.class;
	}

	@Override
	public String getModelClassName() {
		return RuleEngine.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dummyId", getDummyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dummyId = (Long)attributes.get("dummyId");

		if (dummyId != null) {
			setDummyId(dummyId);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getDummyId() {
		return _dummyId;
	}

	@Override
	public void setDummyId(long dummyId) {
		_dummyId = dummyId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			RuleEngine.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public RuleEngine toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (RuleEngine)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RuleEngineImpl ruleEngineImpl = new RuleEngineImpl();

		ruleEngineImpl.setUuid(getUuid());
		ruleEngineImpl.setDummyId(getDummyId());

		ruleEngineImpl.resetOriginalValues();

		return ruleEngineImpl;
	}

	@Override
	public int compareTo(RuleEngine ruleEngine) {
		long primaryKey = ruleEngine.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RuleEngine)) {
			return false;
		}

		RuleEngine ruleEngine = (RuleEngine)obj;

		long primaryKey = ruleEngine.getPrimaryKey();

		return getPrimaryKey() == primaryKey;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		RuleEngineModelImpl ruleEngineModelImpl = this;

		ruleEngineModelImpl._originalUuid = ruleEngineModelImpl._uuid;

		ruleEngineModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<RuleEngine> toCacheModel() {
		RuleEngineCacheModel ruleEngineCacheModel = new RuleEngineCacheModel();

		ruleEngineCacheModel.uuid = getUuid();

		String uuid = ruleEngineCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			ruleEngineCacheModel.uuid = null;
		}

		ruleEngineCacheModel.dummyId = getDummyId();

		return ruleEngineCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", dummyId=");
		sb.append(getDummyId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.liferay.content.targeting.rule.engine.model.RuleEngine");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dummyId</column-name><column-value><![CDATA[");
		sb.append(getDummyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = RuleEngine.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			RuleEngine.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _dummyId;
	private long _columnBitmask;
	private RuleEngine _escapedModel;
}