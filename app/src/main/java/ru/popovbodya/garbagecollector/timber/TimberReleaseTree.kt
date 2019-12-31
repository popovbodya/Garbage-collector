package ru.popov.bodya.app.timber

import android.util.Log
import timber.log.Timber

class TimberReleaseTree : Timber.Tree() {

    override fun isLoggable(tag: String?, priority: Int): Boolean =
        !(priority == Log.VERBOSE || priority == Log.DEBUG || priority == Log.INFO)

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (isLoggable(tag, priority)) {
            if (priority == Log.ERROR && t != null) {
                // Crashlytics log
            }
        }
    }
}