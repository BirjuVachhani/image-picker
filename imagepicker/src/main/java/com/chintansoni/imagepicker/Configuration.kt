/*
 * Copyright 2019 Chintan Soni
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chintansoni.imagepicker

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/*
 * Created by Birju Vachhani on 26 July 2019
 * Copyright © 2019 image-picker. All rights reserved.
 */

@Parcelize
data class Configuration internal constructor(
    var rationaleText: String = "This app needs permission to read external storage.",
    var blockedTitle: String = "Storage permission Blocked",
    var blockedText: String = "This app needs permission to read external storage."
) : Parcelable