/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.test_build2_24th.t12.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.test_build2_24th.t12.*;
/**
 * Specifies methods used to obtain and modify Table1 related information
 * which is stored in the database.
 */
@Repository("t12.Table1Dao")
public class Table1Dao extends WMGenericDaoImpl <Table1, Integer> {

   @Autowired
   @Qualifier("t12Template")
   private HibernateTemplate template;

   public HibernateTemplate getTemplate() {
        return this.template;
   }
}
