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

package com.mindorks.nybus.utils;

import com.mindorks.nybus.event.Channel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jyoti on 04/09/17.
 */

/**
 * The utility class for list conversion.
 */
public class ListUtils {

    private ListUtils() {
        // no instance
    }

    /**
     * Convert the var args to list.
     *
     * @param channelIDs the var args of channel ids.
     * @return the list of channel ids.
     */
    public static List<String> convertVarargsToList(String... channelIDs) {
        List<String> channelIDListForRegister;
        if (channelIDs.length == 0) {
            channelIDListForRegister = new ArrayList<>();
            channelIDListForRegister.add(Channel.DEFAULT);
        } else {
            channelIDListForRegister = new ArrayList<>(Arrays.asList(channelIDs));
        }
        return channelIDListForRegister;
    }
}
