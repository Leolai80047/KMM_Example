plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.3")
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.30")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.example.kmm_example.android"
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}