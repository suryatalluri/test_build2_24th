/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/


package com.test_build2_24th.t12.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface T12ProcedureExecutorService {

	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

