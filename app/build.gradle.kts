plugins {
    id("org.conventions.app")
    id("org.conventions.hilt")
    id("org.conventions.compose")
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.xerv.shucoffee"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.xerv.shucoffee"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.ui.tooling.preview.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}