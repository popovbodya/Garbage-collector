plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("com.getkeepsafe.dexcount")
    id ("com.google.gms.google-services")
}

android {

    compileSdkVersion(AndroidVersions.compileSdk)

    defaultConfig {
        applicationId = "ru.popovbodya.garbagecollector"
        minSdkVersion(AndroidVersions.minSdk)
        targetSdkVersion(AndroidVersions.targetSdk)
        versionCode = AndroidVersions.appVersionCode
        versionName = AndroidVersions.appVersionName
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    sourceSets.forEach {
        it.java.srcDir("src/${it.name}/kotlin")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    // kotlin
    implementation(Libraries.kotlin)

    // androidx
    implementation(Libraries.appCompat)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.lifecycle)

    // dagger
    implementation(Libraries.dagger)
    kapt(Libraries.daggerCompiler)

    // rx
    implementation(Libraries.rxJava)
    implementation(Libraries.rxAndroid)
    implementation(Libraries.rxKotlin)

    // firebase
    implementation(Libraries.firebaseAnalytics)

    // testing
    testImplementation("junit:junit:4.12")
}