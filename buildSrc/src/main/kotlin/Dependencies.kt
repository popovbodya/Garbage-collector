@file:Suppress("unused")

object AndroidVersions {
    const val appVersionCode = 1
    const val appVersionName = "1.0"
    const val coreLibVersionCode = 1

    const val minSdk = 21
    const val targetSdk = 29
    const val compileSdk = 29
}

object PluginVersions {
    const val androidPlugin = "3.5.2"
    const val kotlinPlugin = "1.3.50"
    const val dexcountPlugin = "1.0.0"
}

object LibsVersions {
    const val kotlin = "1.3.61"
    const val appCompat = "1.1.0"
    const val lifecycle = "2.1.0"
    const val constraintLayout = "1.1.3"
    const val dagger = "2.25.2"
    const val rxJava = "2.2.15"
    const val rxAndroid = "2.1.1"
    const val rxKotlin = "2.4.0"
    const val mockk = "1.9"
    const val assertK = "0.12"
}

object GradlePlugins {
    const val android = "com.android.tools.build:gradle:${PluginVersions.androidPlugin}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersions.kotlinPlugin}"
    const val dexcount = "com.getkeepsafe.dexcount:dexcount-gradle-plugin:${PluginVersions.dexcountPlugin}"
}


object Libraries {

    // androidx
    const val appCompat = "androidx.appcompat:appcompat:${LibsVersions.appCompat}"
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${LibsVersions.lifecycle}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${LibsVersions.constraintLayout}"

    // di
    const val dagger = "com.google.dagger:dagger:${LibsVersions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${LibsVersions.dagger}"

    // kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${LibsVersions.kotlin}"

    // rx
    const val rxJava = "io.reactivex.rxjava2:rxjava:${LibsVersions.rxJava}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${LibsVersions.rxAndroid}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${LibsVersions.rxKotlin}"

    // testing
    const val mockk = "io.mockk:mockk:${LibsVersions.mockk}"
    const val assertK = "com.willowtreeapps.assertk:assertk-jvm:${LibsVersions.assertK}"
}
