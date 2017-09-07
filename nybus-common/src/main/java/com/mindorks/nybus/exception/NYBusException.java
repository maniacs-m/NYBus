/*
 *    Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.mindorks.nybus.exception;

/**
 * Created by Jyoti on 06/09/17.
 */

public class NYBusException extends RuntimeException {


    public NYBusException(String detailMessage) {
        super(detailMessage);
    }

    public NYBusException(Throwable throwable) {
        super(throwable);
    }

    public NYBusException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

}

