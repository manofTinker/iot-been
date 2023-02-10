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

package io.github.pnoker.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Aes/Rsa 加密密钥
 *
 * @author pnoker
 */
public class Keys {

    /**
     * Aes 密钥
     */
    @Data
    @AllArgsConstructor
    public static class Aes {
        private String privateKey;
    }

    /**
     * RSA 密钥对
     */
    @Data
    @AllArgsConstructor
    public static class Rsa {
        private String publicKey;
        private String privateKey;
    }
}