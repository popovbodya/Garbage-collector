package ru.popovbodya.garbagecollector.app

import android.app.Application
import ru.popov.bodya.app.timber.TimberDebugTree
import ru.popov.bodya.app.timber.TimberReleaseTree
import ru.popovbodya.garbagecollector.BuildConfig
import timber.log.Timber

class GarbageCollectorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
    }

    private fun initTimber() =
        Timber.plant(if (BuildConfig.DEBUG) TimberDebugTree() else TimberReleaseTree())
}