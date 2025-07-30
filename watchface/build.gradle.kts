plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.frank.watchface"
    compileSdk = 34

    defaultConfig {
        minSdk = 33
        targetSdk = 34
    }
}
