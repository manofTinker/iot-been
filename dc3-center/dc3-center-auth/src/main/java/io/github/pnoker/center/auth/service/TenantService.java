/*
 * Copyright 2022 Pnoker All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.pnoker.center.auth.service;

import io.github.pnoker.common.base.Service;
import io.github.pnoker.common.dto.TenantDto;
import io.github.pnoker.common.model.Tenant;

/**
 * Tenant Interface
 *
 * @author pnoker
 */
public interface TenantService extends Service<Tenant, TenantDto> {

    /**
     * 根据租户名查询租户
     *
     * @param nama
     * @return Tenant
     */
    Tenant selectByName(String nama);
}
