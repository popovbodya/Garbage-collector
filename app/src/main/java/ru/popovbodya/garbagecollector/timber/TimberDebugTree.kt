package ru.popov.bodya.app.timber

import timber.log.Timber

class TimberDebugTree : Timber.DebugTree() {

    override fun createStackElementTag(element: StackTraceElement): String =
        "${super.createStackElementTag(element)}:${element.lineNumber}"
}