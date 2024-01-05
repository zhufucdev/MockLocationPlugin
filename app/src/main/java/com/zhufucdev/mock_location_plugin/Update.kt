package com.zhufucdev.mock_location_plugin

import android.content.Context
import com.zhufucdev.update.AppUpdater

fun Context.updater() = AppUpdater(BuildConfig.server_uri, BuildConfig.product, this)