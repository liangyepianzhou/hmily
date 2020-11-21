/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.hmily.repository.spi.entity.tuple;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Hmily SQL tuple.
 *
 * @author zhaojun
 */
@RequiredArgsConstructor
@Getter
public final class HmilySQLTuple implements Serializable {
    
    private static final long serialVersionUID = -5978500621198003611L;
    
    private final String tableName;
    
    private final HmilySQLManipulation manipulationType;
    
    private final List<Object> primaryKeyValues;
    
    private final Map<String, Object> beforeImage;
    
    private final Map<String, Object> afterImage;
}